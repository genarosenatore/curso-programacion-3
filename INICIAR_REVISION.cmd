@echo off
cd /d "%~dp0"
echo Abri http://127.0.0.1:8766 en tu navegador.
echo Si queres recuperar avance de otro origen, exportalo alli e importalo aqui.
echo Ctrl+C detiene el servidor local.
python -m http.server 8766 --bind 127.0.0.1
pause
