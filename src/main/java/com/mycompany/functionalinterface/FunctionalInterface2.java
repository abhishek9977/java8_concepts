package com.mycompany.functionalinterface;

@FunctionalInterface
public interface FunctionalInterface2 
{
	
	void display();
	
	default void show()
	{
		System.out.println("hello");
	}

	public static void show1()
	{
		System.out.println("static method");
	}
}
