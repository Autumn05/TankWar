package com.test;

import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			c.add(i);
		}
		for(Integer i : c){
			System.out.println(i + ",   ");
		}


//添加元素到集合
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		Integer[] moreInts = {
				6, 7, 8, 9, 10
		};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, moreInts);
		Collections.addAll(collection, 11, 12, 13, 14);
		List<Integer> list = Arrays.asList(16, 18, 19);
		list.set(1, 99);
//		Arrays.asList输出的List，底层表示仍然为数组，因此增加或删除元素会报错，如下
//		list.add(20);
		

	}

}
