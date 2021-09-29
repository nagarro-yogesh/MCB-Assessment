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
@Table(name = "groups")
public class Groups {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_id", unique = true, nullable = false)
	private Integer group_id = null;

	@Column(name = "group_name")
	private String groupName = null;

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

	@OneToMany(mappedBy = "groups", fetch = FetchType.LAZY)
	private Set<Students> students = null;

	@OneToMany(mappedBy = "groups", fetch = FetchType.LAZY)
	private Set<StudentTeacherAssociation> studentTeacherAssociation = null;

	public Groups() {
		super();
	}

	public Groups(Integer group_id, String groupName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate, Integer isDeleted, Set<Students> students,
			Set<StudentTeacherAssociation> studentTeacherAssociation) {
		super();
		this.group_id = group_id;
		this.groupName = groupName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
		this.students = students;
		this.studentTeacherAssociation = studentTeacherAssociation;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}

	public Set<StudentTeacherAssociation> getStudentTeacherAssociation() {
		return studentTeacherAssociation;
	}

	public void setStudentTeacherAssociation(Set<StudentTeacherAssociation> studentTeacherAssociation) {
		this.studentTeacherAssociation = studentTeacherAssociation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, groupName, group_id, isDeleted, students, studentTeacherAssociation,
				updatedBy);
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
		Groups other = (Groups) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(groupName, other.groupName)
				&& Objects.equals(group_id, other.group_id) && Objects.equals(isDeleted, other.isDeleted)
				&& Objects.equals(students, other.students)
				&& Objects.equals(studentTeacherAssociation, other.studentTeacherAssociation)
				&& Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Groups [group_id=").append(group_id).append(", groupName=").append(groupName)
				.append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate)
				.append(", isDeleted=").append(isDeleted).append(", students=").append(students)
				.append(", studentTeacherAssociation=").append(studentTeacherAssociation).append("]");
		return builder.toString();
	}

}
