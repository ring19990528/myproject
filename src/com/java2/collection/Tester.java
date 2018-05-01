package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(8);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(8);
		set.add(2);
		set.add(8);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Ring");
		set2.add("Hsin");
		set2.add("Coco");
		set2.add("Ring");
		System.out.println(set2);
		Map<String, String> stocks = new TreeMap<>();
		stocks.put("2330", "TSMC");
		stocks.put("2454", "Mediatek");
		stocks.put("2317", "Honhai");
		System.out.println(stocks);

	}

}
