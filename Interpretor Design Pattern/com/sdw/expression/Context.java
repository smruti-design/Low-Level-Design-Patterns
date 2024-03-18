package com.sdw.expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	Map<String, Integer> context = new HashMap<>();
	
	public void put(String str, int val) {
		context.put(str, val);
	}
	
	public int get(String str) {
		return context.get(str);
	}

}
