
CREATE TABLE usr (
    id INTEGER PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    active boolean
);

CREATE TABLE instrument (
    id INTEGER PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE key (
    id INTEGER PRIMARY KEY,
    key VARCHAR(1)
);

CREATE TABLE music_band (
    id INTEGER PRIMARY KEY,
    band_name VARCHAR(128) NOT NULL,
    create_date TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE track (
    id INTEGER PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    create_date TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE sound_sample (
    id INTEGER PRIMARY KEY,
    path_to_sound_sample VARCHAR(255) NOT NULL
);