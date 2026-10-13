import fs from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import {root,build} from './sincronizar.mjs';
import {scoreQuiz,validateProgress} from '../logic.js';
const course=JSON.parse(fs.readFileSync(path.join(root,'course.json'),'utf8'));
assert.deepEqual(course,build(),'course.json debe corresponder exactamente al Markdown actual');
const original=JSON.parse(fs.readFileSync(path.join(root,'tools','original-sha256.json'),'utf8'));
const lessons=course.units.flatMap(u=>u.lessons),ids=lessons.map(l=>l.id);
const bank=JSON.parse(fs.readFileSync(path.join(root,'quizzes.json'),'utf8'));
assert.equal(lessons.length,134);assert.equal(course.units.length,16);assert.equal(new Set(ids).size,134);
assert.equal(bank.length,16);assert.equal(bank.flat().length,64);
for(const questions of bank){assert.equal(questions.length,4);for(const q of questions){assert.equal(q[1].length,3);assert.equal(new Set(q[1]).size,3);assert.ok(q[2].includes(q[1][0])&&q[2].includes(q[1][1])&&q[2].includes(q[1][2]));assert.ok(ids.includes(q[3]));}}
const broken=[];
const check=(text,base,pattern)=>{for(const match of text.matchAll(pattern)){const url=match[1].replaceAll('&amp;','&');if(/^(https?:|mailto:|#)/.test(url))continue;const target=decodeURIComponent(url.split('#')[0]);if(target&&!fs.existsSync(path.resolve(base,target)))broken.push(url);}};
for(const lesson of lessons){for(const field of ['theory','practice','solution']){assert.ok(lesson[field].length);assert.ok(!lesson[field].includes('<script>'));check(lesson[field],root,/(?:href|src)="([^"]+)"/g);}}
for(const field of ['roadmap','glossary','examples','review'])check(course[field],root,/(?:href|src)="([^"]+)"/g);
for(const html of Object.values(course.documents))check(html,root,/(?:href|src)="([^"]+)"/g);
function walk(dir){return fs.readdirSync(dir,{withFileTypes:true}).flatMap(e=>e.isDirectory()?(['node_modules','target','.git','__pycache__'].includes(e.name)?[]:walk(path.join(dir,e.name))):[path.join(dir,e.name)]);}
for(const p of walk(path.join(root,'material')).filter(p=>p.endsWith('.md')))check(fs.readFileSync(p,'utf8'),path.dirname(p),/\]\(([^\n)]+)\)/g);
assert.deepEqual(broken,[],'Enlaces locales rotos');
const qs=bank[0].map(q=>({options:q[1].map((text,i)=>({text,correct:i===0}))}));
assert.equal(scoreQuiz(qs,[0,0,0,0]).score,100);assert.equal(scoreQuiz(qs,[0,1,0,2]).score,50);assert.equal(scoreQuiz(qs,[1,1,1,1]).score,0);assert.equal(scoreQuiz(qs,[0,0]),null);
const progress={version:1,completed:[ids[0],ids[0],'03.01'],last:'03.01',scores:{3:{best:100,last:50,attempts:2,date:'2026-10-13T12:00:00.000Z'}}};
assert.deepEqual(validateProgress(progress,ids,16).completed,[ids[0],'03.01']);
assert.equal(validateProgress({...progress,completed:['inventada']},ids,16),null);
assert.ok(original['course.json']);
console.log('PASS: sincronización exacta,134 clases,64 preguntas explicadas,enlaces locales,notas e importación de avance.');
