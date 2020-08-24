package com.mypack;

interface MyInterface
{
	public void a();
	public void b();
	public void c();
	public void d();
	public void e();
	public void f();
	
}

abstract class MyAbstract implements MyInterface
{
	@Override
	public void a() 
	{
		System.out.println("a...........print");
	}

	@Override
	public void b() 
	{
		System.out.println("b...........print");
	}

		
}

abstract class MyDemo implements MyInterface
{
	@Override
	public void d() 
	{
		System.out.println("d.....");
		
	}
}

public class AbstracAndInterfaceDemo extends MyAbstract
{
	public static void main(String[] args) {
		AbstracAndInterfaceDemo ab = new AbstracAndInterfaceDemo();
		ab.a();
		ab.b();
		ab.c();
	}
	
	
	@Override
	public void c() 
	{
	System.out.println(1+1);	
	}

	@Override
	public void d() 
	{
		
	}

	@Override
	public void e() 
	{
		
	}

	@Override
	public void f() 
	{
		
	}

}
