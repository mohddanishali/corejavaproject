package com.mypack.CollectionsClassProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassAddAllMethod
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		
			list.add("A");
			list.add("V");
			list.add("H");
			list.add("W");
			
		System.out.println("Initial collection value: "+list);
		
		Collections.addAll(list, 1,9,3,5);
		
	      System.out.println("Final collection value: "+list);

			
	}
}
