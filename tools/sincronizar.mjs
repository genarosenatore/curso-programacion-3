import fs from 'node:fs';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createRequire} from 'node:module';
const require=createRequire(import.meta.url);
const {marked}=require('marked');
export const root=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const material=path.join(root,'material');
const inventory=JSON.parse(fs.readFileSync(path.join(material,'Inventario_clases.json'),'utf8'));
const esc=s=>s.replaceAll('&','&amp;').replaceAll('<','&lt;').replaceAll('>','&gt;').replaceAll('"','&quot;');
marked.use({renderer:{html(token){return esc(typeof token==='string'?token:token.text);}}});
export function render(file){
  const html=marked.parse(fs.readFileSync(path.join(material,file),'utf8'));
  return html.replace(/(href|src)="([^"#]+)"/g,(all,attr,url)=>{
    if(/^(https?:|mailto:)/.test(url))return all;
    if(/^[a-z]+:/i.test(url))return `${attr}="#"`;
    const local=path.posix.normalize(path.posix.join('material',path.posix.dirname(file),url));
    return `${attr}="${esc(local)}"`;
  });
}
export function build(){
  const names=['Fundamentos','HTML','CSS','JavaScript','TypeScript','Java desde cero','Métodos de objetos','Colecciones','Lombok y DTO','Genéricos y Reflection','Programación funcional','Bases de datos y SQL','JPA','JPQL','Spring Boot','Integración'];
  const units=[];
  for(const row of inventory){
    let unit=units.find(u=>u.folder===row.unidad);
    if(!unit){unit={folder:row.unidad,name:names[units.length],lessons:[]};units.push(unit);}
    const nn=String(row.clase).padStart(2,'0');
    const lesson={id:`${row.unidad.slice(0,2)}.${nn}`,title:row.titulo,file:row.archivo};
    for(const [field,file] of [['theory',row.archivo],['practice',`${row.unidad}/EJERCICIOS_${nn}.md`],['solution',`${row.unidad}/SOLUCIONES_${nn}.md`]])lesson[field]=render(file);
    unit.lessons.push(lesson);
  }
  const documents={};
  function addDocuments(dir){for(const e of fs.readdirSync(dir,{withFileTypes:true})){
    const full=path.join(dir,e.name);
    if(e.isDirectory()){if(!['node_modules','target','.git','__pycache__'].includes(e.name))addDocuments(full);}
    else if(e.name.endsWith('.md')&&!/^(CLASE|EJERCICIOS|SOLUCIONES)_/.test(e.name)){
      const rel=path.relative(material,full).replaceAll('\\','/');documents['material/'+rel]=render(rel);
    }
  }}
  addDocuments(material);
  const course={revision:'2026-10-13-fundamentos',units,roadmap:render('ROADMAP.md'),glossary:render('GLOSARIO.md'),examples:render('EJEMPLOS.md'),review:render('REVISION_POR_UNIDAD.md'),documents};
  return course;
}
if(process.argv[1]&&path.resolve(process.argv[1])===fileURLToPath(import.meta.url)){
  const course=build();fs.writeFileSync(path.join(root,'course.json'),JSON.stringify(course));
  console.log(`Sincronizadas ${course.units.flatMap(u=>u.lessons).length} clases desde Markdown.`);
}
