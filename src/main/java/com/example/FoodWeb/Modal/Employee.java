package com.example.FoodWeb.Modal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String Email;
	private String PhoneNo;
	private String UserName;
	@Column(columnDefinition = "varchar(10) default '1234567'")
	private String Password;
	@Column(columnDefinition = "varchar(1) default 'N'")
	private String status;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", PhoneNo=" + PhoneNo + ", UserName="
				+ UserName + ", Password=" + Password + ", status=" + status + "]";
	}
	public Employee(int id, String name, String email, String phoneNo, String userName, String password,
			String status) {
		super();
		Id = id;
		Name = name;
		Email = email;
		PhoneNo = phoneNo;
		UserName = userName;
		Password = password;
		this.status = status;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
