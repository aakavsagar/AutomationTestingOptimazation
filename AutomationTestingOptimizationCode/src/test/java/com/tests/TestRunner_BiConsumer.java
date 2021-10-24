package com.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class TestRunner_BiConsumer {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		/*prop.load(new FileInputStream("config.properties"));
		
		for(Entry<Object,Object> entry : prop.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		prop.forEach((k,v)->System.out.println(k+":"+v));*/
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Testing mini bytes");
		map.put(2, "Like");
		map.put(3, "share");
		map.put(4, "Subscribe");
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		for(Integer key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		
		map.forEach((a,b)->System.out.println(a+":"+b));
		
		map.entrySet().forEach(k->System.out.println(k));
		map.keySet().forEach(k->System.out.println(k+":"+map.get(k)));
	}
}
