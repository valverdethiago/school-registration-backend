-- Table: students

-- DROP TABLE IF EXISTS students;


CREATE TABLE IF NOT EXISTS students
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name character varying(255),
    PRIMARY KEY (id)
)
