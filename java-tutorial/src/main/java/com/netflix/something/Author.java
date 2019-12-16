package com.netflix.something;

public class Author implements Comparable<Author>{

	private Integer id;
	private String lastName;
	private String firstName;
	private String country;
	private Short age;
	
	public Author() {}

	public Author(Integer id, String lastName, String firstName, String country, Short age) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.country = country;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", country=" + country
				+ ", age=" + age + "]";
	}

	@Override
	public int compareTo(Author anotherAuthor) {
		return this.lastName.compareTo(anotherAuthor.getLastName());
	}

}
