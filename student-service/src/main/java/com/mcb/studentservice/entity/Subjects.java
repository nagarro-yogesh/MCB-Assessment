package com.mcb.studentservice.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id", unique = true, nullable = false)
	private Integer subjectId = null;

	@Column(name = "title")
	private String title = null;

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

	@OneToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	private Set<Marks> marks = null;

	@OneToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	private Set<StudentTeacherAssociation> studentTeacherAssociation = null;

	public Subjects() {
		super();
	}

	public Subjects(Integer subjectId, String title, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate, Integer isDeleted, Set<Marks> marks,
			Set<StudentTeacherAssociation> studentTeacherAssociation) {
		super();
		this.subjectId = subjectId;
		this.title = title;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
		this.marks = marks;
		this.studentTeacherAssociation = studentTeacherAssociation;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Set<Marks> getMarks() {
		return marks;
	}

	public void setMarks(Set<Marks> marks) {
		this.marks = marks;
	}

	public Set<StudentTeacherAssociation> getStudentTeacherAssociation() {
		return studentTeacherAssociation;
	}

	public void setStudentTeacherAssociation(Set<StudentTeacherAssociation> studentTeacherAssociation) {
		this.studentTeacherAssociation = studentTeacherAssociation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, isDeleted, marks, studentTeacherAssociation, subjectId, title, updatedBy);
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
		Subjects other = (Subjects) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(isDeleted, other.isDeleted)
				&& Objects.equals(marks, other.marks)
				&& Objects.equals(studentTeacherAssociation, other.studentTeacherAssociation)
				&& Objects.equals(subjectId, other.subjectId) && Objects.equals(title, other.title)
				&& Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubjectMaster [subjectId=").append(subjectId).append(", title=").append(title)
				.append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate)
				.append(", isDeleted=").append(isDeleted).append(", markMaster=").append(marks)
				.append(", studentTeacherAssociation=").append(studentTeacherAssociation).append("]");
		return builder.toString();
	}

}
