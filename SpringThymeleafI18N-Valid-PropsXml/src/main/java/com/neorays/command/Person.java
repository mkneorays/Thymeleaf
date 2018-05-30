package com.neorays.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Person {
     @NotNull
	private Integer p_id;
     @NotNull
     @Size(max=20,min=2)
	private String fname;
     
     @NotEmpty
	private String lname;
     
	public Integer getP_id() {
		return p_id;
	}
	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", fname=" + fname + ", lname=" + lname
				+ "]";
	}
	
	
	
}
