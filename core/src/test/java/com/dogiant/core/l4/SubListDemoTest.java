package com.dogiant.core.l4;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.junit.Test;

import com.google.common.collect.Lists;

public class SubListDemoTest {

	@Test
	public void useGuavaPartitionList() {
		List<Integer> originList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
		List<List<Integer>> pagedList = Lists.partition(originList, 3);

		// 最后一页是两个数字 7、8
		List<Integer> lastPage = pagedList.get(2);
		List<Integer> expectedLastPage = Lists.<Integer>newArrayList(7, 8);
		assertThat(pagedList.size(), equalTo(3));
		assertThat(lastPage, equalTo(expectedLastPage));
	}

	@Test
	public void originListChanged() {
		// 初始化一个集合
		List<Integer> originList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
		List<List<Integer>> pagedList = Lists.partition(originList, 3);

		// 当原始的集合发生改变，增加了一个元素
		originList.add(9);

		// 子列表同时发生改变
		List<Integer> lastPage = pagedList.get(2);
		List<Integer> expectedLastPage = Lists.<Integer>newArrayList(7, 8, 9);
		assertThat(lastPage, equalTo(expectedLastPage));
	}

	@Test
	public void useCommonsCollections4() {
		List<Integer> originList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
		List<List<Integer>> pagedList = ListUtils.partition(originList, 3);

		List<Integer> lastPage = pagedList.get(2);
		List<Integer> expectedLastPage = Lists.<Integer>newArrayList(7, 8);
		assertThat(pagedList.size(), equalTo(3));
		assertThat(lastPage, equalTo(expectedLastPage));
	}

}
