"""Lanzador de SQL didáctico: siempre usa una base descartable en memoria."""
import argparse, sqlite3
from pathlib import Path

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('archivo', type=Path)
parser.add_argument('--tienda', action='store_true', help='Cargar primero tienda.sql')
args = parser.parse_args()
with sqlite3.connect(':memory:') as db:
    db.execute('PRAGMA foreign_keys=ON')
    if args.tienda:
        db.executescript(Path(__file__).with_name('tienda.sql').read_text(encoding='utf-8'))
        db.commit()
    pending = ''
    for line in args.archivo.read_text(encoding='utf-8').splitlines(keepends=True):
        # Conserva comentarios; complete_statement reconoce comillas y terminadores.
        for char in line:
            pending += char
            if char == ';' and sqlite3.complete_statement(pending):
                cursor = db.execute(pending)
                if cursor.description:
                    print(' | '.join(col[0] for col in cursor.description))
                    rows = cursor.fetchall()
                    for row in rows:
                        print(' | '.join('NULL' if v is None else str(v) for v in row))
                    if not rows:
                        print('(sin filas)')
                pending = ''
    if pending.strip() and not pending.lstrip().startswith('--'):
        raise SystemExit('Falta el punto y coma final de una sentencia.')
