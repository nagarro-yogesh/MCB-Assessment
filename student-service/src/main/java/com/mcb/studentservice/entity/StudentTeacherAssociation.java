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
@Table(name = "subject_teacher_association")
public class StudentTeacherAssociation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_teacher_assoc_id", unique = true, nullable = false)
	private Integer subject_teacher_assoc_id = null;

	@Column(name = "subject_id")
	private Integer subjectId = null;

	@Column(name = "teacher_id")
	private Integer teacherId = null;

	@Column(name = "group_id")
	private Integer groupId = null;

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
	@JoinColumn(name = "teacher_id", nullable = false, insertable = false, updatable = false)
	private Teacher teacher = null;

	@ManyToOne
	@JoinColumn(name = "group_id", nullable = false, insertable = false, updatable = false)
	private Groups groups = null;

	public StudentTeacherAssociation() {
		super();
	}

	public StudentTeacherAssociation(Integer subject_teacher_assoc_id, Integer subjectId, Integer teacherId,
			Integer groupId, String createdBy, Date createdDate, String updatedBy, Date updatedDate, Integer isDeleted,
			Subjects subjects, Teacher teacher, Groups groups) {
		super();
		this.subject_teacher_assoc_id = subject_teacher_assoc_id;
		this.subjectId = subjectId;
		this.teacherId = teacherId;
		this.groupId = groupId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
		this.subjects = subjects;
		this.teacher = teacher;
		this.groups = groups;
	}

	public Integer getSubject_teacher_assoc_id() {
		return subject_teacher_assoc_id;
	}

	public void setSubject_teacher_assoc_id(Integer subject_teacher_assoc_id) {
		this.subject_teacher_assoc_id = subject_teacher_assoc_id;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Groups getGroups() {
		return groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, createdDate, groupId, groups, isDeleted, subjectId, subjects,
				subject_teacher_assoc_id, teacherId, teacher, updatedBy, updatedDate);
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
		StudentTeacherAssociation other = (StudentTeacherAssociation) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(groupId, other.groupId) && Objects.equals(groups, other.groups)
				&& Objects.equals(isDeleted, other.isDeleted) && Objects.equals(subjectId, other.subjectId)
				&& Objects.equals(subjects, other.subjects)
				&& Objects.equals(subject_teacher_assoc_id, other.subject_teacher_assoc_id)
				&& Objects.equals(teacherId, other.teacherId) && Objects.equals(teacher, other.teacher)
				&& Objects.equals(updatedBy, other.updatedBy) && Objects.equals(updatedDate, other.updatedDate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentTeacherAssociation [subject_teacher_assoc_id=").append(subject_teacher_assoc_id)
				.append(", subjectId=").append(subjectId).append(", teacherId=").append(teacherId).append(", groupId=")
				.append(groupId).append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate)
				.append(", isDeleted=").append(isDeleted).append(", subjects=").append(subjects)
				.append(", teacher=").append(teacher).append(", groups=").append(groups)
				.append("]");
		return builder.toString();
	}

}
