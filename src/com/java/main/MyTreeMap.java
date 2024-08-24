package com.java.main;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
	
	public static void main(String str []) {
		
		//Creating new sorted collection with name myTreeMap
		Map<Double, String> myTreeMap = new TreeMap<>();
		
		//Adding elements to myTreeMap
		myTreeMap.put(2.0, "MacDonalds");
		myTreeMap.put(6.1, "Burger King");
		myTreeMap.put(4.1, "Subway");
		myTreeMap.put(8.1, "Starbacks");
		
		//Printing myTreeMap to console
		System.out.println(myTreeMap.toString());
		
		//Printing myTreeMap to console nice outlook
		for(Map.Entry<Double, String> entry: myTreeMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
		}	
	}

}
