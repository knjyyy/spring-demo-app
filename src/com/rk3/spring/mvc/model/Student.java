package com.rk3.spring.mvc.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	String firstName;
	String lastName;
	String country;
	String favoriteLanguage;
	String[] osUsed;

	// Map<String, String> countryOptions;
	Map<String, String> programmingLanguages;

	public Student() {
		// this.countryOptions = new LinkedHashMap<String, String>();
		// this.countryOptions.put("philippines", "Philippines");
		// this.countryOptions.put("argentina", "Argentina");
		// this.countryOptions.put("canada", "Canada");
		// this.countryOptions.put("japan", "Japan");

		this.programmingLanguages = new LinkedHashMap<String, String>();
		this.programmingLanguages.put("java", "Java");
		this.programmingLanguages.put("python", "Python");
		this.programmingLanguages.put("ruby", "Ruby");
		this.programmingLanguages.put("php", "PHP");
	}

	public Student(String firstName, String lastName, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Map<String, String> getProgrammingLanguages() {
		return programmingLanguages;
	}

	public String[] getOsUsed() {
		return osUsed;
	}

	public void setOsUsed(String[] osUsed) {
		this.osUsed = osUsed;
	}
	
	// public void setCountry(String country) {
	// this.country = country;
	// }

	// public Map<String, String> getCountryOptions() {
	// return countryOptions;
	// }
}
