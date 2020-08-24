package com.mypack;

public class CountDigitsInAnNumber 
{
	class A
	{
		void m()
		{
			System.out.println("Hello..");
		}
		private class B
		{
			void m1() 
			{
				System.out.println("ddd");
			}
		}
	}
	
	public static void main(String[] args)
	{
		CountDigitsInAnNumber a = new CountDigitsInAnNumber();
		A b  =	a.new A();
		b.m();
		
		
		A.B n = b.new B();
		n.m1();
	}
}