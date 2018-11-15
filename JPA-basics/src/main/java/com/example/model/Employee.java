package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AMDOCS_EMPLOYEE")
public class Employee {

	@Id
	@SequenceGenerator(name="my_seq",sequenceName="MY_SEQ",initialValue=1,allocationSize=1)
	//@TableGenerator(name="my_gen",table="MY_PK_TABLE",pkColumnName="ENTITY",pkColumnValue="EMPLOYEE",valueColumnName="NEXT_VAL")
	//@GeneratedValue(strategy=GenerationType.TABLE,generator="my_gen")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq")
	@Column(name="EMP_ID")
	private int id;
	@Column(name="EMP_NAME")
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Lob
	private String profile;
	@Lob
	private byte[] profilePic;
	
	
	
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
