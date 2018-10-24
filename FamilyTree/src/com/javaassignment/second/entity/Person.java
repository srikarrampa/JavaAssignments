package com.javaassignment.second.entity;

public class Person {
	
	private int id;
	private String firstName;
	private String secondName;
	private boolean isMarried;
	public Person()
	{
		
	}
	public Person(int id, String firstName,String secondName,boolean isMarried )
	{
		this.id=id;
		this.firstName=firstName;
		this.secondName=secondName;
		this.isMarried=isMarried;
		
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()  + "[id="+ id + "]" + "[First Name=" + firstName + "]" + "[Second Name=" + secondName + "]" + "[Married=" + isMarried + "]";
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
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
}
