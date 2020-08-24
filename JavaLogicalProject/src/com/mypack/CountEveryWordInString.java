package com.mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountEveryWordInString 
{
	public static void main(String[] args) 
	{
		String text = "JavaDeveloper";
		
		char[] ch = text.toCharArray();
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < ch.length; i++) 
		{
			list.add(String.valueOf(ch[i]));
		}
		
		System.out.println(list);
		
		Set<String> uniqueWords = new HashSet<String>(list);
		
		System.out.println(uniqueWords);
		
		for (String word : uniqueWords) 
		{
			System.out.print(word+":"+Collections.frequency(list, word)+", ");
		}
		
	}
}
