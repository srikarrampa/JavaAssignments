package com.javaassignment.third.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.javaassignment.third.entity.Person;

public interface initialise {
	
	void update(int level,int identify,HashMap<Integer,ArrayList<Person>> items1);
	void posts(ArrayList<Integer> check,HashMap<Integer,ArrayList<Person>> items1,int level);
	void get(HashMap<Integer,ArrayList<Person>> items1);
	void getingLevel(HashMap<Integer, ArrayList<Person>> items1, ArrayList<Integer> check, int level_id) ;
	void gettingId(HashMap<Integer, ArrayList<Person>> items1, ArrayList<Integer> check, int level_id, int ids) ;
	void delete(int l,int ids,HashMap<Integer,ArrayList<Person>> items1,ArrayList<Integer> check);

}
