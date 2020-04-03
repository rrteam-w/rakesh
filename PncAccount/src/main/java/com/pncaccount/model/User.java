package com.pncaccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PNC_CUSTOMER_TABLE")
public class User {
//    @Column(name = "ID")
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer accountid;
    
    @Column(name = "PNC_ACCOUNTID")
    @Id
    private Integer accountid;
  
    @Column(name = "PNC_CUSTOMER_FIRST_NAME", nullable = true, length = 20)
    private String firstname;
  
    @Column(name = "PNC_CUSTOMER_LAST_NAME", nullable = true, length = 20)
    private String lastname;
    
    @Column(name = "PNC_CUSTOMER_EMAIL_ID", nullable = true, length = 20)
    private String email;
    
    @Column(name = "PNC_CUSTOMER_BALANCE", nullable = true, length = 20)
    private Integer balance;
    
    @Column(name = "CARD_TYPE", nullable = true, length = 15)
    private String cardtype;
    
    
    
    
  
    public String getCardtype() {
		return cardtype;
	}



	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}


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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getBalance() {
		return balance;
	}



	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	


	/*public User(String name, Integer balance) {
		super();
		this.name = name;
		this.balance = balance;
	}*/



	public Integer getAccountid() {
		return accountid;
	}



	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}



	@Override
	public String toString() {
		return "User [accountid=" + accountid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", balance=" + balance + ", cardtype=" + cardtype + "]";
	}



	

    
    
	
    //constructor, setters and getters omitted for brevity
}