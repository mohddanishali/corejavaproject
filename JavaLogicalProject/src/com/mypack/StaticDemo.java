package com.mypack;

class Temp1
{
	static int x = 0;

}

public class StaticDemo
{
	public static void main(String[] args) 
	{
		Temp1  temp1 = new Temp1();
		Temp1 temp2 = new Temp1();
			temp1.x++;
			temp2.x++;
		
		System.out.println(temp1.x = 10+(temp1.x++));
		System.out.println(temp2.x);
	}
}
