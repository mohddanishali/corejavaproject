package com.mypack;

import java.util.Scanner;

public class PrintEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the highest number...");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i+" is a Even number");
			}
			
		}
	}
}
