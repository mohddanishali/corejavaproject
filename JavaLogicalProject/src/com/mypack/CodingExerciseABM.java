package com.mypack;

import java.util.Scanner;

public class CodingExerciseABM 
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
        int num = Integer.parseInt(str);
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println(factorial);
	   }
}
