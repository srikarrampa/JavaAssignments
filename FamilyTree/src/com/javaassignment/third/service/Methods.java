package com.javaassignment.third.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.javaassignment.third.entity.Person;
import com.javaassignment.third.util.Computing;
import com.javaassignment.third.util.MyException;


public class Methods implements initialise{
	

	public void delete(int l,int ids,HashMap<Integer,ArrayList<Person>> items1,ArrayList<Integer> check) {
		
		ArrayList<Person> temp = new ArrayList<Person>();
		temp = items1.get(l);
		Scanner scan = new Scanner(System.in);
		for(Person p: temp)
		{
			if(p.getId()==ids)
			{
				temp.remove(p);
				int x=check.indexOf(ids);
				check.remove(x);
			}
			break;
		}
	
}


//Update Function
	public void update(int level,int identify,HashMap<Integer,ArrayList<Person>> items1) 
	{
		
		ArrayList<Person> temp = new ArrayList<Person>();
		temp =  items1.get(level);
		Scanner scan = new Scanner(System.in);
		System.out.println("--");
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
			else
			{
				System.out.println("do you wish to add in this level?");
				boolean flag =scan.nextBoolean();
				if(flag)
				{
					ArrayList<Person> list = new ArrayList<Person>(temp);
					Person person = new Person();
					System.out.println("Enter New ID:");
					person.setId(scan.nextInt());
					System.out.println("Enter New First Name:");
					person.setFirstName(scan.next());
					System.out.println("Enter New Second Name:");
					person.setSecondName(scan.next());
					System.out.println("Enter New Married Status:");
					person.setMarried(scan.nextBoolean());
					list.add(person);
					items1.put(level, list);
				}
				
			}
			break;
		}
//		items1.put(level, temp);

	}

	//Post Function
	public void posts(ArrayList<Integer> check,HashMap<Integer,ArrayList<Person>> items1,int level)
	{
		
		ArrayList<Person> list= new ArrayList<Person>();
		System.out.println("   ");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of names you wish to add:");
		int number = scan.nextInt();
		for(int i=0; i<number;i++)
		{
			Person person = new Person();
			System.out.println("enter the id number:");
			int temp_id= scan.nextInt();
			//checking entered id
			try
			{
				
			if(check.contains(temp_id))
			{
				throw new MyException("Duplicate ID,enter a different id");
				
			}
			else
			{
				person.setId(temp_id);
				check.add(temp_id);
			}
			}
			catch(MyException string)
			{
				
			}
			finally
			{
				System.out.println("enter the id to confirm");
				person.setId(scan.nextInt());
				System.out.println("enter the First Name:");
				person.setFirstName(scan.next());
				System.out.println("enter the Second Name:");
				person.setSecondName(scan.next());
				System.out.println("enter the True/False if your Married:");
				person.setMarried(scan.nextBoolean());
				list.add(person);
			}
			
		}
		items1.put(level, list);
		
		
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
