package com.child;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo 
{
	
	public static <T extends Comparable<T>> int findMinIndex(final List<T> xs) 
	{
	    int minIndex;
	    if (xs.isEmpty()) {
	        minIndex = -1;
	    } else {
	        final ListIterator<T> itr = xs.listIterator();
	        T min = itr.next(); // first element as the current minimum
	        minIndex = itr.previousIndex();
	        while (itr.hasNext()) {
	            final T curr = itr.next();
	            if (curr.compareTo(min) < 0) {
	                min = curr;
	                minIndex = itr.previousIndex();
	            }
	        }
	    }
	    return minIndex;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
				list.add(null);
				list.add(74);
				list.add(null);
				list.add(35);
				list.add(null);
				list.add(98);
				list.add(null);
				list.add(5);
				list.add(null);
				list.add(null);
				list.add(52);
		
		System.out.println(list);
		
		findMinIndex(list);
		
		
	}
	
}
