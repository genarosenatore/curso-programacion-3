PRAGMA foreign_keys = ON;
CREATE TABLE categoria (id INTEGER PRIMARY KEY, nombre TEXT NOT NULL UNIQUE);
CREATE TABLE producto (
 id INTEGER PRIMARY KEY,
 nombre TEXT NOT NULL,
 categoria_id INTEGER REFERENCES categoria(id)
);
