package com.mypack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(101, "A");
		
		System.out.println(hashMap.hashCode());
		
		hashMap.put(102, "B");
		
		System.out.println(hashMap.hashCode());
		
		hashMap.put(101, "V");
		
		
		
		
		System.out.println(hashMap.hashCode());
		
//		hashMap.put("T", "C");
//		hashMap.put(102, "D");
//		hashMap.put(104, "E");
		
	   	System.out.println(hashMap);
		
//        Set<Map.Entry<String,Integer>> s = hashMap.entrySet(); 
//        
//        for (Entry<String, Integer> entry : s) 
//        {
//			System.out.println(entry.getKey());
//		}

		
	}
}
