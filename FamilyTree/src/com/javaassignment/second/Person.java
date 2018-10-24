package com.javaassignment.second;

public class Person {
	
	static int id;
	String firstName;
	String secondName;
	boolean isMarried;
	Person()
	{
		
	}
	Person(int id, String firstName,String secondName,boolean isMarried )
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
