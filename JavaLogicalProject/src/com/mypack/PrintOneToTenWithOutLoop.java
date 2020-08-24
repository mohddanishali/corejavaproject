package com.mypack;

public class PrintOneToTenWithOutLoop 
{
	
	public static void m(int i)
	{
		if(i <= 10)
		{
			System.out.print(i+" \t");
			m(i+1);
		}
	}
		public static void main(String[] args)
	{
		m(1);
	}
}
