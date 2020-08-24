package com.mypack.variable;

public class StaticVariableDemo1 
{
	static int i = 1;
	
	public static void main(String[] args)
	{
		int i = 1;
		
		for(StaticVariableDemo1.i = 1; StaticVariableDemo1.i < 10; StaticVariableDemo1.i++)
		{
			i = i + 2;
			
			System.out.println(i);
		}
	}
}
