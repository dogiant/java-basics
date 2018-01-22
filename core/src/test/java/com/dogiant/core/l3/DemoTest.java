package com.dogiant.core.l3;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test1() {
		Set<Integer> numbers = new HashSet<Integer>(); 
		numbers.add(111);
		numbers.add(222);
		numbers.add(3333);
		assertTrue(numbers.contains(111));
	}
	
	@Test
	public void test2() {
		Set<Integer> numbers = new HashSet<Integer>(){
			{
		           add(1);
		           add(2);
		           add(3);
		    }
		};
		assertTrue(numbers.contains(1));
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		List<String> strings = new ArrayList<>(asList("foo", "bar", "baz"));
	
		Set<String> set = new HashSet<String>() {{
		    add("a"); add("b"); add("c");
		}};
		
		
		Set<String> set2 = Stream.of("foo", "bar", "baz").collect(toSet());
		System.out.println(set2);
		List<String> list2 = Stream.of("foo", "bar", "baz").collect(toList());
		
	}


	
	

}
