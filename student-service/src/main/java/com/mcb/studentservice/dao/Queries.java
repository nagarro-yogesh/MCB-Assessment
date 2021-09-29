package com.mcb.studentservice.dao;

public final class Queries {

	public static final String GET_STUDENT_DETAILS_BY_ID = "SELECT new com.mcb.studentservice.dto.StudentDetailsDto "
			+ " (st.studentId AS studentId, st.firstName AS studentFirstName, st.lastName AS studentLastName) "
			+ " FROM Students AS st " + " WHERE st.studentId = :studentId ";

	public static final String GET_MARK_DETAILS_BY_STUDENT_ID = "SELECT new com.mcb.studentservice.dto.MarksDetailsDto "
			+ " (ms.markId AS markId, ms.studentId AS studentId, ms.subjectId AS subjectId"
			+ ", ms.examDate AS examDate, ms.mark AS mark) " + " FROM Marks AS ms "
			+ " WHERE ms.studentId = :studentId ";

	public static final String GET_SUBJECT_DETAILS_BY_ID = "SELECT new com.mcb.studentservice.dto.SubjectDetailsDto "
			+ " (ss.subjectId AS subjectId, ss.title AS subjectTitle, ss.createdBy AS createdBy, ss.createdDate AS createdDate "
			+ " , ss.updatedBy AS updatedBy, ss.updatedDate AS updatedDate, ss.isDeleted AS isDeleted) "
			+ " FROM Subjects AS ss " + " WHERE ss.subjectId = :subjectId ";

	public static final String GET_MARK_DETAILS_BY_SUBEJCT_ID = "SELECT new com.mcb.studentservice.dto.MarksDetailsDto "
			+ " (m.markId AS markId, m.studentId AS studentId, m.subjectId AS subjectId "
			+ ", m.examDate AS examDate, m.mark AS mark) " + " FROM Marks AS m "
			+ " WHERE m.subjectId = :subjectId ";

	public static final String GET_TEACHER_DETAILS_BY_ID = "SELECT new com.mcb.studentservice.dto.TeacherDetailsDto "
			+ " (t.teacherId AS teacherId, t.firstName AS teacherFirstName, t.lastName AS teacherFirstName "
			+ " , sta.groupId AS groupId) " + " FROM Teacher AS t "
			+ " LEFT OUTER JOIN t.studentTeacherAssociation AS sta " + " WHERE t.teacherId = :teacherId ";

	public static final String GET_STUDENT_BY_GROUP_ID = "SELECT new com.mcb.studentservice.dto.StudentDetailsDto "
			+ " (st.studentId AS studentId, st.firstName AS studentFirstName, st.lastName AS studentLastName) "
			+ " FROM Students AS st " + " WHERE st.groupId = :groupId ";

	public static final String DELETE_STUDENT_DETAILS_BY_ID = "UPDATE Students AS st SET st.isDeleted = :isDeleted,"
			+ " st.updatedBy = 'admin@mcb.com', st.updatedDate = NOW() WHERE st.studentId = :studentId ";
}
