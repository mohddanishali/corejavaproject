package com.mypack.variable;

public class InVariableCanBeUseUnderScore
{
	float z = 6__4_5.24__5f;
	
	static int x = 10_11;
	static double y = 10_89.74_5;
	
	public static void main(String[] args) 
	{
		InVariableCanBeUseUnderScore v = new InVariableCanBeUseUnderScore();
		
				System.out.println(v.z+10);
		
		x = x + 1;
		
		System.out.println(x+" "+y);
	}
}
