package com.javaassignment.second.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.javaassignment.second.entity.Person;
import com.javaassignment.second.service.Methods;
public class Computing{
	
	public void compute(HashMap<Integer,ArrayList<Person>> items1,ArrayList<Integer> check) {
		// TODO Auto-generated method stub
		
		Methods methods = new Methods();
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
				items1.put(n, methods.posts(check));
//				get(items1);
				break;
			case 2:
				System.out.println("the whole tree");
				methods.get(items1);
				System.out.println("enter the level which you wish to print:");
				int level_id=scan.nextInt();
				methods.getingLevel(items1,check,level_id);
				System.out.println("enter the id which you wish to print:");
				int level_ids=scan.nextInt();
				methods.gettingId(items1,check,level_id,level_ids);
				break;
			case 3:
				System.out.print("enter the level in which you wish to update a name:");
				int level= scan.nextInt();
				System.out.println(items1.get(level));
				System.out.print("enter the id in which you wish to update:");
				int identify=scan.nextInt();
//				System.out.println(level);
//				System.out.println(items1.get(level));
				methods.update(level,identify,items1);
				break;
			case 4:
				System.out.print("enter the level in which you wish to delete:");
				int l= scan.nextInt();
				System.out.print("enter the id in which you wish to delete:");
				int ids=scan.nextInt();
				methods.delete(l,ids,items1);
				methods.get(items1);
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

}
