package com.packtpub.springhibernate.ch03;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
 	public Student(String firstName, String lastName) {
 		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
 	public boolean equals(Object o) {
 		// TODO Auto-generated method stub
 		if (this == o) return true;
 			if(o==null || getClass() != o.getClass()) return false;
 			Student student = (Student) o;
 			if (id != student.id) return false;
 			
 			if (firstName != null ? !firstName.equals(student.firstName) :
 				student.firstName != null) return false;
 			
 			if (lastName != null ? !lastName.equals(student.lastName) :
 				student.lastName != null) return false;
 			
 			return true;
 	}
	
	@Override
	public int hashCode() {
		int result;
		result =id;
		result = 29 * result +(firstName != null ? firstName.hashCode() :  0);
		result = 29 * result + (lastName != null ? lastName.hashCode() 	: 0);
		return result;
	}
	

}
