package com.mypack.javaconceptoftheday;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String st = "My name is Danish Ali";
		
		char[] ch = st.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--)         // 1st way to reverse a string by using toCharArray() of String Class
		{
			System.out.print(ch[i]);
		}
		
		System.out.print(" ");
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer(st);      // 2nd way to reverse a string by using reverse() of StringBuffer Class
		sb.reverse();
		
		System.out.println(sb);
	}
}
