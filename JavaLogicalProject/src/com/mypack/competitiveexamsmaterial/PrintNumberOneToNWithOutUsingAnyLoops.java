package com.mypack.competitiveexamsmaterial;

public class PrintNumberOneToNWithOutUsingAnyLoops 
{
	public static void test(int i)
	{
		if(i <= 10)
		{
			System.out.print(i+" ");
			
			test(i+1);
		}
	}
	
	public static void main(String[] args) 
	{
		test(1);
	}
}
