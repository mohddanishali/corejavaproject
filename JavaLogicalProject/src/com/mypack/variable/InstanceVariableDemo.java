package com.mypack.variable;

public class InstanceVariableDemo 
{
	int id;
	
	public void m()
	{
		System.out.println(id);
	}
	
	public static void main(String[] args) 
	{
		InstanceVariableDemo instanceVariableDemo = new InstanceVariableDemo();
				instanceVariableDemo.m();
	}
}
