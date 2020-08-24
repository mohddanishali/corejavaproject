package com.mypack.competitiveexamsmaterial;

import java.util.Scanner;

public class PrintNEvenNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter the any num.......");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) 
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Num is...."+i);
			}
		}
	}
}
