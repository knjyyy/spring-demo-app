package com.rk3.spring.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rk3.spring.mvc.annotation.CourseCode;

public class Customer {

	String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	String lastName;

	@NotNull
	@Min(value = 5, message = "must be greater than or equal to 5")
	@Max(value = 10, message = "must be less than or equal to 10")
	int freePasses;

	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "should be 5 characters/digits only")
	String postalCode;

	@CourseCode(value = { "CS", "IT" }, message = "Prefix not allowed")
	String courseCode;

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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
