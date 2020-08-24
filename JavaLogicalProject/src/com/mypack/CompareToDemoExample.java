package com.mypack;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareToDemoExample
{
	public static void main(String[] args)
	{
		TreeSet treeSet = new TreeSet(new MyComparator());
				treeSet.add("Danish");
				treeSet.add("Faraz");
				treeSet.add("Faiq");
				treeSet.add("Faraz");
				
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
		
		//return -s1.compareTo(s2);
	}
	
}