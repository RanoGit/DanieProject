package com.dani.practiceSample.map;

import java.util.HashMap;
import java.util.Map;
/*
 * This approach is available in Java 8 + versions.
 */
public class IterateHashMapLambda {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.forEach((key,value) -> System.out.println(key + " = " + value));
	}


}
