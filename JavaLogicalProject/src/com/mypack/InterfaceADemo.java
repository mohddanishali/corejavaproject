package com.mypack;

interface Axis
{
	void mt();
	
	int x = 10; 
}

abstract class A
{
	protected void m()
	{
		return ;
	}
}

public class InterfaceADemo extends A implements Axis
{

	@Override
	public void mt() 
	{
		System.out.println("InterfaceADemo...........calling");
	}
	
	public static void main(String[] args) 
	{
		InterfaceADemo interfaceADemo = new InterfaceADemo();
		interfaceADemo.mt();
		System.out.println(x);
		
	}
	
}
