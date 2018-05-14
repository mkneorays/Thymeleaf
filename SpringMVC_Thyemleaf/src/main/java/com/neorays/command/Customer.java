package com.neorays.command;

public class Customer {

	 private long id =100;
	    private String firstname="XXX";
	    private String lastname="YYY";
	     
	 
	    public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
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

		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
		}
	    
}
