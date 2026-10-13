import http from 'node:http';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
const root=path.resolve(path.dirname(fileURLToPath(import.meta.url)),'..');
const port=Number(process.env.CURSO_PUERTO||8766);
const mime={'.html':'text/html','.js':'text/javascript','.mjs':'text/javascript','.json':'application/json','.css':'text/css','.md':'text/plain','.java':'text/plain','.ts':'text/plain','.sql':'text/plain','.svg':'image/svg+xml','.py':'text/plain','.xml':'text/plain'};
http.createServer(async(req,res)=>{
 try{
  let rel=decodeURIComponent(new URL(req.url,'http://localhost').pathname);
  // El alias permite probar el mismo sitio bajo una subruta como GitHub Pages.
  if(rel.startsWith('/curso-programacion-3/'))rel=rel.slice('/curso-programacion-3'.length);
  if(rel==='/')rel='/index.html';
  const file=path.resolve(root,'.'+rel);
  if(file!==root&&!file.startsWith(root+path.sep)){res.writeHead(403).end();return;}
  const body=await fs.readFile(file);
  res.writeHead(200,{'Content-Type':(mime[path.extname(file)]||'application/octet-stream')+'; charset=utf-8','Cache-Control':'no-cache'});res.end(body);
 }catch{res.writeHead(404,{'Content-Type':'text/plain; charset=utf-8'}).end('No encontrado');}
}).listen(port,'127.0.0.1',()=>console.log(`Revisión local: http://127.0.0.1:${port}`));
