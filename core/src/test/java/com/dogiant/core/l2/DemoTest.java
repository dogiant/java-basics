package com.dogiant.core.l2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		List<Staff> list2 = Arrays.asList(
				new Staff(2L, 25, "王五"),
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));

		Collections.sort(list2, new Comparator<Staff>() {
			@Override
			public int compare(Staff o1, Staff o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});
		System.out.println(list2.get(0));

		Assert.assertThat(list2.get(0), equalTo(new Staff(1L, 18, "张三")));
	}
	
	@Test
	public void testLambdaSorted() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));

		staffs.sort((Staff o1, Staff o2) -> o1.getAge().compareTo(o2.getAge()));

		assertThat(staffs.get(0), equalTo(new Staff(1L, 18, "张三")));
	}
	
	@Test
	public void testLambdaSorted2() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));

		staffs.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));

		assertThat(staffs.get(0), equalTo(new Staff(1L, 18, "张三")));
	}

	@Test
	public void testLambdaSortReversed() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));
		Comparator<Staff> comparator = (o1, o2) -> o1.getAge().compareTo(o2.getAge());
	    staffs.sort(comparator.reversed());
		assertThat(staffs.get(0), equalTo(new Staff(1L, 18, "张三")));
	}
	
	@Test
	public void testLambdaSortedByMultipleCondition() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(4L, 17, "张三"),
				new Staff(3L, 36, "李六"));
		
		staffs.sort((lo, ro) -> {
	        if (lo.getName().equals(ro.getName())) {
	            return lo.getAge() - ro.getAge();
	        } else {
	            return lo.getName().compareTo(ro.getName());
	        }
	    });
		
		assertThat(staffs.get(0), equalTo(new Staff(4L, 17, "张三")));
	}
	
	@Test
	public void testLambdaSortedByStaticMethod() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(4L, 17, "张三"),
				new Staff(3L, 36, "李六"));
	    staffs.sort(Staff :: compareByNameThenAge);
		assertThat(staffs.get(0), equalTo(new Staff(4L, 17, "张三")));
	}
	
	@Test
	public void testLambdaSortedByGetter() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(3L, 36, "李六"));
	    Collections.sort(staffs, Comparator.comparing(Staff::getAge));
		assertThat(staffs.get(0), equalTo(new Staff(1L, 18, "张三")));
	}
	
	@Test
	public void testLambdaSortedByChainGetter() {
		List<Staff> staffs = Arrays.asList(
				new Staff(2L, 25, "王五"), 
				new Staff(1L, 18, "张三"), 
				new Staff(4L, 17, "张三"),
				new Staff(3L, 36, "李六"));
	    staffs.sort(Comparator.comparing(Staff::getName).thenComparing(Staff::getAge));
		assertThat(staffs.get(0), equalTo(new Staff(4L, 17, "张三")));
	}
	
}
