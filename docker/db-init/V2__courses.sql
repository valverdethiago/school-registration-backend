-- Table: courses

-- DROP TABLE IF EXISTS courses;


CREATE TABLE IF NOT EXISTS courses
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name character varying(255),
    description character varying(255),
    PRIMARY KEY (id)
)
