package net.com.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE User_Table SET status = false WHERE User_id= ?")
@Where(clause = "status= true")
@Table(name = "User_Table")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_id")
	private int userid;

	@Column(name = "First_name")
	private String firstname;

	@Column(name = "Last_name")
	private String lastname;

	@Column(name = "Contact")
	private int contact;

	@Column(name = "Address")
	private String address;

	@Column(name = "Job")
	private String job;

	@Column(name = "Role")
	private String role;

	@Column(name = "Status")
	private Boolean status;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "empid", foreignKey = @javax.persistence.ForeignKey(name = "userid"))
	private Employee employee;

	public User() {
		super();
	}

	public User(String firstname, String lastname, int contact, String address, String job, String role,
			Boolean status, Employee employee) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.address = address;
		this.job = job;
		this.role = role;
		this.status = status;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
