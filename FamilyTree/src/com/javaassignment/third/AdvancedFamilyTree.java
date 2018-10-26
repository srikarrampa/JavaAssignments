package com.javaassignment.third;

import java.util.*;
import com.javaassignment.third.entity.Person;
import com.javaassignment.third.util.Computing;
public class AdvancedFamilyTree {
	
	static ArrayList<Integer> check ;
	static ArrayList<Integer> levellist;
	static HashMap<Integer,ArrayList<Person>> items1;
	public AdvancedFamilyTree()
	{
		items1 = new HashMap<Integer,ArrayList<Person>>();
		check = new ArrayList<Integer>();
		levellist = new ArrayList<Integer>();
		
	}
	

	public static void main(String[] args) {
		AdvancedFamilyTree family = new AdvancedFamilyTree();
		Computing computing = new Computing();
		Scanner scan = new Scanner(System.in);
		computing.compute(items1,check,levellist);
	}
	

}
