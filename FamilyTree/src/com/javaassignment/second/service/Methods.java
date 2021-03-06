package com.javaassignment.second.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.javaassignment.second.entity.Person;
import com.javaassignment.second.util.Computing;
import com.javaassignment.third.service.initialise;


public class Methods {
	

	public void delete(int l,int ids,HashMap<Integer,ArrayList<Person>> items1) {
		
		ArrayList<Person> temp = new ArrayList<Person>();
		temp = items1.get(l);
		Scanner scan = new Scanner(System.in);
		for(Person p: temp)
		{
			if(p.getId()==ids)
			{
				temp.remove(p);
			}
			break;
		}
	
		items1.put(l, temp);
}


//Update Function
	public void update(int level,int identify,HashMap<Integer,ArrayList<Person>> items1) 
	{
		
		ArrayList<Person> temp = new ArrayList<Person>();
		temp =  items1.get(level);
		Scanner scan = new Scanner(System.in);
		System.out.println("--");
		System.out.println(identify);
		for(Person p: temp)
		{
			if(p.getId()==identify)
			{
				System.out.println("Enter updated First Name:");
				p.setFirstName(scan.next());
				System.out.println("Enter updated Second Name:");
				p.setSecondName(scan.next());
				System.out.println("Enter updated Married Status:");
				p.setMarried(scan.nextBoolean());
			}
			System.out.println(p);
			break;
		}
		items1.put(level, temp);
//		System.out.println(items1.get(level));
//		Person person = items1.get(level);
//		System.out.println(person.firstName);
		
	
	
	}

	//Post Function
	public ArrayList<Person> posts(ArrayList<Integer> check)
	{
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of names you wish to add:");
		int number = scan.nextInt();
		for(int i=0; i<number;i++)
		{
			Person person = new Person();
			System.out.println("enter the id number:");
			int temp_id= scan.nextInt();
			//checking entered id
			if(check.contains(temp_id))
			{
				System.out.println("enter a different id");
				person.setId(scan.nextInt());
			}
			else
			{
				person.setId(temp_id);
				check.add(temp_id);
			}
			System.out.println("enter the First Name:");
			person.setFirstName(scan.next());
			System.out.println("enter the Second Name:");
			person.setSecondName(scan.next());
			System.out.println("enter the True/False if your Married:");
			person.setMarried(scan.nextBoolean());
			list.add(person);
		}
		return list ;
		
	}


	//Get Function
	public void get(HashMap<Integer,ArrayList<Person>> items1)  
    { 
        if (items1.isEmpty())  
        { 
            System.out.println("No items1 in the Tree"); 
        } 
          
        else
        { 
            System.out.println(items1); 
        } 
	}


	public void getingLevel(HashMap<Integer, ArrayList<Person>> items1, ArrayList<Integer> check, int level_id) {
		System.out.println(items1.get(level_id));
	}


	public void gettingId(HashMap<Integer, ArrayList<Person>> items1, ArrayList<Integer> check, int level_id, int ids) {
		ArrayList<Person> temp_person= new ArrayList<Person>();
		temp_person=items1.get(level_id);
		boolean flag=true;
		for(Person p: temp_person)
		{
			System.out.println("");
			if(p.getId()==ids)
			{
				flag=false;
				System.out.println("ID no:"+ p.getId());
				
				System.out.println("First Name:"+ p.getFirstName());
				
				System.out.println("Second Name:"+ p.getSecondName());
				
				System.out.println("Married Status:"+ p.isMarried());
			}
			
		}
		if(flag==true)
		{
			System.out.println("entered id not present in level");
		}
		
	}


}
