-- Table: courses

-- DROP TABLE IF EXISTS registrations;


CREATE TABLE IF NOT EXISTS registrations
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    course_id MEDIUMINT NOT NULL,
    student_id MEDIUMINT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT registration_course_fk FOREIGN KEY (course_id)
        REFERENCES courses (id),
    CONSTRAINT registration_student_fk FOREIGN KEY (student_id)
        REFERENCES students (id)
)
