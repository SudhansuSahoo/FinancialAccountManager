package com.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank_Account {
	private Long account_number;
	private String first_name;
	private String last_name;
	private String dob;
	private String ssn;
	private String email_id;
	private String mobile_number;
	private String home_address;
	private String mailing_address;
	private String account_type;
	private int minimum_balance;

	protected Bank_Account() {
	}

	protected Bank_Account(Long account_number, String first_name, String last_name, String dob, String ssn, 
			String email_id, String mobile_number, String home_address, String mailing_address, 
			String account_type, int minimum_balance
			) {
		super();
		this.account_number = account_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.ssn = ssn;
		this.email_id = email_id;
		this.mobile_number = mobile_number;
		this.home_address = home_address;
		this.mailing_address = mailing_address;
		this.account_type = account_type;
		this.minimum_balance = minimum_balance;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getHome_address() {
		return home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}

	public String getMailing_address() {
		return mailing_address;
	}

	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getMinimum_balance() {
		return minimum_balance;
	}

	public void setMinimum_balance(int minimum_balance) {
		this.minimum_balance = minimum_balance;
	}

	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAccount_number() {
		return account_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setName(String first_name) {
		this.first_name = first_name;
	}

	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
