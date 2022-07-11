CREATE ROLE test LOGIN  ENCRYPTED PASSWORD 'tttt' SUPERUSER NOINHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;
CREATE DATABASE test WITH OWNER = test ENCODING = 'UTF8' LC_COLLATE = 'ru_RU.UTF-8' LC_CTYPE = 'ru_RU.UTF-8' CONNECTION LIMIT = -1;

CREATE SCHEMA  IF NOT EXISTS shp AUTHORIZATION test;
GRANT ALL ON SCHEMA shp TO test;

CREATE SCHEMA  IF NOT EXISTS sys AUTHORIZATION test;
GRANT ALL ON SCHEMA sys TO test;