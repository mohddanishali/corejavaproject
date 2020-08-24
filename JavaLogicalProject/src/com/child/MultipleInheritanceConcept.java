package com.child;


interface X
{
	default void x()
	{
		System.out.println("X is calling...");
	}
}

interface A
{
	void a();
	
}

interface B
{
	static void b()
	{
		System.out.println("B is calling...");
	}
}


public class MultipleInheritanceConcept implements X, A
{

	@Override
	public void a() 
	{
		System.out.println("A is calling...");
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritanceConcept multipleInheritanceConcept = new MultipleInheritanceConcept();
		
		multipleInheritanceConcept.a();
		
		multipleInheritanceConcept.x();
		
		B.b();
	}

}
