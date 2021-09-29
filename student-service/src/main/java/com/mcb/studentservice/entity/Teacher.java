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
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id", unique = true, nullable = false)
	private Integer teacherId = null;

	@Column(name = "first_name")
	private String firstName = null;

	@Column(name = "last_name")
	private String lastName = null;

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

	@OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
	private Set<StudentTeacherAssociation> studentTeacherAssociation = null;

	public Teacher() {
		super();
	}

	public Teacher(Integer teacherId, String firstName, String lastName) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Set<StudentTeacherAssociation> getStudentTeacherAssociation() {
		return studentTeacherAssociation;
	}

	public void setStudentTeacherAssociation(Set<StudentTeacherAssociation> studentTeacherAssociation) {
		this.studentTeacherAssociation = studentTeacherAssociation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, createdDate, firstName, isDeleted, lastName, studentTeacherAssociation,
				teacherId, updatedBy, updatedDate);
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
		Teacher other = (Teacher) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(isDeleted, other.isDeleted)
				&& Objects.equals(lastName, other.lastName)
				&& Objects.equals(studentTeacherAssociation, other.studentTeacherAssociation)
				&& Objects.equals(teacherId, other.teacherId) && Objects.equals(updatedBy, other.updatedBy)
				&& Objects.equals(updatedDate, other.updatedDate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [teacherId=").append(teacherId).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", createdBy=").append(createdBy)
				.append(", createdDate=").append(createdDate).append(", updatedBy=").append(updatedBy)
				.append(", updatedDate=").append(updatedDate).append(", isDeleted=").append(isDeleted)
				.append(", studentTeacherAssociation=").append(studentTeacherAssociation).append("]");
		return builder.toString();
	}

}
