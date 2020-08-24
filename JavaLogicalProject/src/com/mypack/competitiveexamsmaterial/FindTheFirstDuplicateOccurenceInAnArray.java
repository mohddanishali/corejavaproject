package com.mypack.competitiveexamsmaterial;

public class FindTheFirstDuplicateOccurenceInAnArray 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,5,4,8,5,2,6,1,10,35,6,7,5};
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
