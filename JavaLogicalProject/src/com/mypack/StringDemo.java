package com.mypack;

import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name:-");
		
		String name = sc.nextLine();
		
		StringBuffer test = new StringBuffer();
		
		//System.out.println(name);
		
		String[] str = name.split(" ");
		
		for (String st : str)
		{
			test.append(st);
			
			if(st.equalsIgnoreCase("is"))
			{
				test.append("    ");
			}
			else
			{
				test.append(" ");
			}
		}
		
		System.out.println(test);
	}
}
