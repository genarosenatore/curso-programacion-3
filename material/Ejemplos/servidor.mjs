import http from "node:http";
import { readFile, stat } from "node:fs/promises";
import path from "node:path";
import { fileURLToPath } from "node:url";
const root = path.dirname(fileURLToPath(import.meta.url));
const port = Number(process.env.CURSO_PUERTO ?? 3000);
const tipos = { ".html":"text/html; charset=utf-8", ".css":"text/css", ".js":"text/javascript", ".json":"application/json", ".svg":"image/svg+xml" };
const servidor = http.createServer(async (req,res) => {
  if (req.method !== "GET") { res.writeHead(405); res.end(); return; }
  try {
    const url = new URL(req.url, `http://127.0.0.1:${port}`);
    let archivo = path.resolve(root, "." + decodeURIComponent(url.pathname));
    const relativo = path.relative(root, archivo);
    if (relativo.startsWith("..") || path.isAbsolute(relativo)) { res.writeHead(403);res.end();return; }
    if ((await stat(archivo)).isDirectory()) archivo = path.join(archivo,"index.html");
    const cuerpo = await readFile(archivo);
    res.writeHead(200,{"Content-Type":tipos[path.extname(archivo)]??"application/octet-stream","Cache-Control":"no-store"});
    res.end(cuerpo);
  } catch { res.writeHead(404,{"Content-Type":"text/plain; charset=utf-8"});res.end("Archivo no encontrado"); }
});
servidor.listen(port,"127.0.0.1",()=>console.log(`Abrí http://127.0.0.1:${port} — Ctrl+C para cerrar.`));
