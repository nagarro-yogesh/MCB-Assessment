package com.mcb.studentservice.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mark_id", unique = true, nullable = false)
	private Integer markId = null;

	@Column(name = "subject_id")
	private Integer subjectId = null;

	@Column(name = "student_id")
	private Integer studentId = null;

	@Column(name = "mark")
	private Integer mark = null;

	@Column(name = "exam_date")
	private Date examDate = null;

	@Column(name = "created_by")
	private String createdBy = null;

	@Column(name = "created_date")
	private Date createdDate = null;

	@Column(name = "updated_by")
	private String updatedBy = null;

	@Column(name = "updated_date")
	private Date updatedDate = null;

	@Column(name = "is_deleted")
	private Integer isDeleted = null;

	@ManyToOne
	@JoinColumn(name = "subject_id", nullable = false, insertable = false, updatable = false)
	private Subjects subjects = null;

	@ManyToOne
	@JoinColumn(name = "student_id", nullable = false, insertable = false, updatable = false)
	private Students students = null;

	public Marks() {
		super();
	}

	public Marks(Integer markId, Integer subjectId, Integer studentId, Integer mark, Date examDate, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate, Integer isDeleted, Subjects subjects,
			Students students) {
		super();
		this.markId = markId;
		this.subjectId = subjectId;
		this.studentId = studentId;
		this.mark = mark;
		this.examDate = examDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
		this.subjects = subjects;
		this.students = students;
	}

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, examDate, isDeleted, mark, markId, studentId, students, subjectId,
				subjects, updatedBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Marks other = (Marks) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(examDate, other.examDate)
				&& Objects.equals(isDeleted, other.isDeleted) && Objects.equals(mark, other.mark)
				&& Objects.equals(markId, other.markId) && Objects.equals(studentId, other.studentId)
				&& Objects.equals(students, other.students) && Objects.equals(subjectId, other.subjectId)
				&& Objects.equals(subjects, other.subjects) && Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marks [markId=").append(markId).append(", subjectId=").append(subjectId)
				.append(", studentId=").append(studentId).append(", mark=").append(mark).append(", examDate=")
				.append(examDate).append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate)
				.append(", isDeleted=").append(isDeleted).append(", subjects=").append(subjects)
				.append(", students=").append(students).append("]");
		return builder.toString();
	}

}
