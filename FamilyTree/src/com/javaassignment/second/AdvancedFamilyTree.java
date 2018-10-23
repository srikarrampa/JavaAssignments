package com.javaassignment.second;


import java.util.*;

import com.javaassignment.second.Person;
public class AdvancedFamilyTree {
	
	HashMap<Integer,ArrayList<Person>> items;
	AdvancedFamilyTree()
	{
		items = new HashMap<Integer,ArrayList<Person>>();
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Person person = new Person(0,null,null,false);
		AdvancedFamilyTree family = new AdvancedFamilyTree();
		
		Scanner scan = new Scanner(System.in);
		
		family.compute();
	}
	public void compute()
	{
		boolean flag= true;
		while(flag)
		{
			System.out.println("choose an option:");
			System.out.println("1: post the Tree");
			System.out.println("2: get the Tree");
			System.out.println("3: update the value in a level");
			System.out.println("4: delete a value in a level");
			System.out.println("5: exit");
			Scanner scan = new Scanner(System.in);
			int num= scan.nextInt();
			switch(num)
			{
			case 1:
				System.out.print("enter the level in which you wish to add:");
				int n= scan.nextInt();
//				System.out.println(n);
				items.put(n, posts());
//				get(items);
				break;
			case 2:
				get();
				break;
			case 3:
				System.out.print("enter the level in which you wish to update a name:");
				int level= scan.nextInt();
				System.out.println(items.get(level));
				System.out.print("enter the id in which you wish to update:");
				int identify=scan.nextInt();
//				System.out.println(level);
//				System.out.println(items.get(level));
				update(level,identify);
				break;
			case 4:
				System.out.print("enter the level in which you wish to delete:");
				int l= scan.nextInt();
				System.out.print("enter the id in which you wish to delete:");
				int ids=scan.nextInt();
				delete(l,ids);
				get();
				break;
			case 5:
				System.out.println("Exiting....");
				flag=false;
				break;
			default:
				System.out.println("invalid option");
				flag= true;
				
			}
		}
		
	}

		public void delete(int l,int ids) {
			
			ArrayList<Person> temp = new ArrayList<Person>();
			temp =  items.get(l);
			Scanner scan = new Scanner(System.in);
			for(Person p: temp)
			{
				if(p.id==ids)
				{
					temp.remove(p);
				}
				break;
			}
		
			items.put(l, temp);
	}


	//Update Function
		public void update(int level,int identify) 
		{
			
			ArrayList<Person> temp = new ArrayList<Person>();
			temp =  items.get(level);
			Scanner scan = new Scanner(System.in);
			System.out.println("--");
			for(Person p: temp)
			{
				if(p.id==identify)
				{
					System.out.println("Enter updated First Name:");
					p.firstName=scan.next();
					System.out.println("Enter updated Second Name:");
					p.secondName=scan.next();
					System.out.println("Enter updated Married Status:");
					p.isMarried=scan.nextBoolean();
				}
				System.out.println(p);
				break;
			}
			items.put(level, temp);
//			System.out.println(items.get(level));
//			Person person = items.get(level);
//			System.out.println(person.firstName);
			
		
		
		}

		//Post Function
		public ArrayList<Person> posts()
		{
			ArrayList<Person> list = new ArrayList<Person>();
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number of names you wish to add:");
			int number = scan.nextInt();
			for(int i=0; i<number;i++)
			{
				Person person = new Person();
				System.out.println("enter the id number:");
				person.id= scan.nextInt();
				System.out.println("enter the First Name:");
				person.firstName=scan.next();
				System.out.println("enter the Second Name:");
				person.secondName=scan.next();
				System.out.println("enter the True/False if your Married:");
				person.isMarried=scan.nextBoolean();
				list.add(person);
			}
			return list ;
			
		}
		//Get Function
		public void get()  
	    { 
	        if (items.isEmpty())  
	        { 
	            System.out.println("No items in the Tree"); 
	        } 
	          
	        else
	        { 
	            System.out.println(items); 
	        } 
		}
}
