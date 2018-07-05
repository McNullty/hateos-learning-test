package com.mladen.cikara.hateos;

import org.springframework.hateoas.ResourceSupport;

public class PersonResource extends ResourceSupport {
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
	String firstname;
	String lastname;
}
