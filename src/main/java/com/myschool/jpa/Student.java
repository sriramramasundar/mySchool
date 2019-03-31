package com.myschool.jpa;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "STD")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn()
	private School school;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn()
	private Teacher teacher;
	
	@Column(name = "usr_id")
	@NotNull
	private String userId;
	
	@Column(name = "FRST_NM")
	@NotNull
	private String firstName;
	
	@Column(name = "LST_NM")
	private String lastName;
	
	@Column(name = "CLS")
	@NotNull
	private String clas;
	
	@Column(name = "SCTN")
	private String section;
	
	@Column(name = "FTHR_NM")
	private String fatherName;
	
	
	@Column(name = "MTHR_NM")
	private String motherName;
	
	
	@Column(name = "GRDN_NM")
	private String guradianName;
	
	
	@Column(name = "PRIMARY_LANG")
	@NotNull
	private String primaryLanguage;
	
	
	@Column(name = "ID_MARK_1")
	private String idMark1;
	
	
	@Column(name = "ID_MARK_2")
	private String idMark2;
	
	
	@Column(name = "DOB")
	@NotNull
	private Date dob;
	
	@Column(name = "EMAIL")
	@NotNull
	private String email;
	
	@Column(name = "PHONE")
	@NotNull
	private int phoneNumber;
	
	@Column(name = "PHY_CHLNGD")
	@NotNull
	private boolean physicallyChallenged = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGuradianName() {
		return guradianName;
	}

	public void setGuradianName(String guradianName) {
		this.guradianName = guradianName;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getIdMark1() {
		return idMark1;
	}

	public void setIdMark1(String idMark1) {
		this.idMark1 = idMark1;
	}

	public String getIdMark2() {
		return idMark2;
	}

	public void setIdMark2(String idMark2) {
		this.idMark2 = idMark2;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPhysicallyChallenged() {
		return physicallyChallenged;
	}

	public void setPhysicallyChallenged(boolean physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}

}
