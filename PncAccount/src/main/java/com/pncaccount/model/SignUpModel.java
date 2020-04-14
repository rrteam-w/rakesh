package com.pncaccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users_DB")
public class SignUpModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, length = 20)
	private Integer id;
		
	@Column(name = "USER_NAME", unique=true, nullable = true, length = 20)
	private String username;
	
	@Column(name = "FIRST_NAME", nullable = true, length = 20)
    private String firstname;
	
	@Column(name = "LAST_NAME", nullable = true, length = 20)
    private String lastname;
	
	@Column(name = "MAILID", nullable = true, length = 30)
	private String mail;
	
	@Column(name = "PHONE", nullable = true, length = 30)
	private String phone;
	
	
	
	@Column(name = "PASSWORD", nullable = true, length = 20)
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignUpModel [firstname=" + firstname + ", lastname=" + lastname + ", mail=" + mail + ", phone=" + phone
				+ ", userName=" + username + ", password=" + password + "]";
	}

		
	

}
