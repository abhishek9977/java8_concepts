package com.mycompany.functionalinterface;

public class UseInterface 
{

	public static void main(String args[])
	{
		
	
	FunctionalInterface2 f1 = () ->
	{
		System.out.println("hello");
	};
	 
	f1.display();
	
	FunctionalInterface2 f2 = () ->
	{
		System.out.println("bye");
	};
	 
	f2.display();
}
}
