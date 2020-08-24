package com.mypack.variable;

public class InstanceVariableArrayDefine 
{
	public static void main(String[] args) 
	{
		int arr1[] = { 11, 22, 33 }; 
        int arr2[] = { 11, 22, 33, 44, 55 }; 
        int ptr[]; 
        
        ptr = arr1; 
        arr1 = arr2; 
        arr2 = ptr; 
        
        for (int i : arr1) 
        {
        	System.out.print(i + " ");
		}
        
        System.out.println();
        
        System.out.println(arr2.length);
        System.out.println(arr1.length);
	}
}
