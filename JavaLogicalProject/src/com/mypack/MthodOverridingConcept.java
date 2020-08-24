package com.mypack;

class Demo
{
	public void mt(int a)
	{
		System.out.println("calling Demo class....");
	}
}
class Temp extends Demo
{
	public void mt(int a)
	{
		System.out.println("calling Temp class....");
	}
}

public class MthodOverridingConcept extends Temp
{
	public static void main(String[] args) 
	{
		Demo demo = new Temp();
		demo.mt(2);
	}
}