package com.javaassignment.second;

public class Person {
	
	int id;
	String firstName;
	String secondName;
	boolean isMarried;
	Person()
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
}
