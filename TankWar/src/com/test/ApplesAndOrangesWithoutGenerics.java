package com.test;

import java.util.*;

class Apple {
	private long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}

class Orange {
	private final long id = 200;	
	public long id(){
		return id;
	}
}


public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++){
			apples.add(new Apple());
		}
//		apples.addAll(new Orange());
		for (int i = 0; i < apples.size()-1; i++){
			System.out.println(((Apple)apples.get(i)).id());
		}
		
//		((Orange)apples.get(3)).id();
	}
	
}
