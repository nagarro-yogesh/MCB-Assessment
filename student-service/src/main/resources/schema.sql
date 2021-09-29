SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE IF NOT EXISTS subject_master(
	subject_id INT(11) AUTO_INCREMENT,
	title VARCHAR(500),
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (subject_id)
);

CREATE TABLE IF NOT EXISTS group_master(
	group_id INT(11) AUTO_INCREMENT,
	group_name VARCHAR(500),
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (group_id)
);

CREATE TABLE IF NOT EXISTS student_master(
	student_id INT(11) AUTO_INCREMENT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	group_id INT(11),
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (student_id),
	CONSTRAINT ibfk_student_master_1 FOREIGN KEY(group_id) REFERENCES group_master(group_id) ON DELETE NO ACTION ON UPDATE NO ACTION
);


CREATE TABLE IF NOT EXISTS teacher_master(
	teacher_id INT(11) AUTO_INCREMENT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (teacher_id)
);

CREATE TABLE IF NOT EXISTS mark_master(
	mark_id INT(11) AUTO_INCREMENT,
	student_id INT(11),
	subject_id INT(11),
	mark INT(11),
	exam_date DATETIME,
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (mark_id),
	CONSTRAINT ibfk_mark_master_1 FOREIGN KEY(student_id) REFERENCES student_master(student_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT ibfk_mark_master_2 FOREIGN KEY(subject_id) REFERENCES subject_master(subject_id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS subject_teacher_association(
	subject_teacher_assoc_id INT(11) AUTO_INCREMENT,
	subject_id INT(11),
	teacher_id INT(11),
	group_id INT(11),
	created_by VARCHAR(50),
	created_date DATETIME DEFAULT NOW(),
	updated_by VARCHAR(50),
	updated_date DATETIME DEFAULT NOW(),
	is_deleted INT(11) DEFAULT 0,
	PRIMARY KEY (subject_teacher_assoc_id),
	CONSTRAINT ibfk_subject_teacher_association_1 FOREIGN KEY(subject_id) REFERENCES subject_master(subject_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT ibfk_subject_teacher_association_2 FOREIGN KEY(teacher_id) REFERENCES teacher_master(teacher_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT ibfk_subject_teacher_association_3 FOREIGN KEY(group_id) REFERENCES group_master(group_id) ON DELETE NO ACTION ON UPDATE NO ACTION	
);

SET FOREIGN_KEY_CHECKS = 1;