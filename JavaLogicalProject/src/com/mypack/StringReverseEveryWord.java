package com.mypack;

import java.util.Scanner;

public class StringReverseEveryWord
{
	public static void main(String[] args)
	{
		String st = "My Name is Danish";
		
		String[] sp = st.split(" ");
		
		for (String sf : sp)
		{
			char[] ch = sf.toCharArray();
			
			for (int i = ch.length-1; i >= 0; i--)
			{
				System.out.print(ch[i]);
			}
			
			System.out.print(" ");
		}
	}
}
