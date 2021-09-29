SET FOREIGN_KEY_CHECKS = 0;

/*Start of subject_master*/
INSERT INTO subject_master(subject_id, title, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (1, 'Science', 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO subject_master(subject_id, title, created_by, created_date, updated_by, updated_date, is_deleted)
VALUES (2, 'Maths', 'admin@mcb.com', NOW(), NULL, NULL, 0);
 
INSERT INTO subject_master(subject_id, title, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (3, 'History', 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO subject_master(subject_id, title, created_by, created_date, updated_by, updated_date, is_deleted)
VALUES (4, 'Geography', 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of subject_master*/

/*Start of group_master*/

INSERT INTO group_master(group_id, group_name, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (1, 'Science-Group', 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO group_master(group_id, group_name, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (2, 'Maths-Group', 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of group_master*/

/*Start of student_master*/

INSERT INTO student_master(student_id, first_name, last_name, group_id, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (1, 'Alex', 'Cardoza', 1, 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO student_master(student_id, first_name, last_name, group_id, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (2, 'Ryan', 'Dsouza', 1, 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of student_master*/

/*Start of teacher_master*/

INSERT INTO teacher_master(teacher_id, first_name, last_name, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (1, 'Diana', 'Barboz', 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO teacher_master(teacher_id, first_name, last_name, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (2, 'Steffie', 'Fernandes', 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of teacher_master*/

/*Start of mark_master*/

INSERT INTO mark_master(mark_id, student_id, subject_id, mark, exam_date, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (1, 1, 1, 72, NOW(), 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO mark_master(mark_id, student_id, subject_id, mark, exam_date, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES (2, 1, 2, 86, NOW(), 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of mark_master*/

/*Start of mark_master*/

INSERT INTO subject_teacher_association (subject_teacher_assoc_id, subject_id, teacher_id, group_id, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES(1, 1, 1, 1, 'admin@mcb.com', NOW(), NULL, NULL, 0);

INSERT INTO subject_teacher_association (subject_teacher_assoc_id, subject_id, teacher_id, group_id, created_by, created_date, updated_by, updated_date, is_deleted) 
VALUES(2, 2, 2, 2, 'admin@mcb.com', NOW(), NULL, NULL, 0);

/*End of mark_master*/
SET FOREIGN_KEY_CHECKS = 1;
 
