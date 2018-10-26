package com.javaassignment.third.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.javaassignment.third.entity.Person;
import com.javaassignment.third.service.Methods;
import com.javaassignment.third.service.initialise;
public class Computing{
	
	public void compute(HashMap<Integer,ArrayList<Person>> items1,ArrayList<Integer> check,ArrayList<Integer> levellist) {
		// TODO Auto-generated method stub
		
		initialise method = new Methods();
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
			//Exception Handling
			try
			{
			int num= scan.nextInt();
			
			switch(num)
			{
			case 1:
				System.out.print("enter the level in which you wish to add:");
				int n= scan.nextInt();
				levellist.add(1);
//				System.out.println(n);
				method.posts(check,items1,n);
//				get(items1);
				break;
			case 2:
				System.out.println("the whole tree");
				method.get(items1);
				System.out.println("enter the level which you wish to print:");
				int level_id=scan.nextInt();
				if
				(levellist.contains(level_id))
				{
					method.getingLevel(items1,check,level_id);
				}
				else
				{
					throw new MyException("Level not present");
				}
				System.out.println("enter the id which you wish to print:");
				int level_ids=scan.nextInt();
				if(check.contains(level_ids))
				{
					method.gettingId(items1,check,level_id,level_ids);
				}
				else
				{
					throw new MyException("ID not present");
				}
				
				break;
			case 3:
				System.out.print("enter the level in which you wish to update a name:");
				int level= scan.nextInt();
				System.out.println(items1.get(level));
				System.out.print("enter the id in which you wish to update:");
				int identify=scan.nextInt();
//				System.out.println(level);
//				System.out.println(items1.get(level));
				method.update(level,identify,items1);
				break;
			case 4:
				System.out.print("enter the level in which you wish to delete:");
				int l= scan.nextInt();
				System.out.print("enter the id in which you wish to delete:");
				int ids=scan.nextInt();
				if(check.contains(ids))
				{
					method.delete(l,ids,items1,check);
					method.get(items1);
				}
				else
				{
					throw new MyException("ID not present");
				}
				
				break;
			case 5:
				System.out.println("Exiting....");
				flag=false;
				break;
			default:
//				flag= true;
				throw new MyException("Invalid input!");
				
				
			}
			}
			catch(MyException string)
			{
				
			}
			
		
			
		}
		
		
	}

}
