package com.dogiant.core.l2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("c", "b", "a", "f", "e", "d");
		Collections.sort(list1);
		System.out.println(list1);

		List<Staff> list2 = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));
		
		//根据年龄排序
		Collections.sort(list2, new Comparator<Staff>(){
			@Override
			public int compare(Staff o1, Staff o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});
	
		System.out.println(list2.get(0));
	}

}
