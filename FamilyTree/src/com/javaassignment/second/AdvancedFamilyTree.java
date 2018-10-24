package com.javaassignment.second;

import java.util.*;
import com.javaassignment.second.entity.Person;
import com.javaassignment.second.util.Computing;
public class AdvancedFamilyTree {
	
	static ArrayList<Integer> check ;
	static HashMap<Integer,ArrayList<Person>> items1;
	public AdvancedFamilyTree()
	{
		items1 = new HashMap<Integer,ArrayList<Person>>();
		check = new ArrayList<Integer>();
		
	}
	

	public static void main(String[] args) {
		AdvancedFamilyTree family = new AdvancedFamilyTree();
		Computing computing = new Computing();
		Scanner scan = new Scanner(System.in);
		computing.compute(items1,check);
	}
	

}
