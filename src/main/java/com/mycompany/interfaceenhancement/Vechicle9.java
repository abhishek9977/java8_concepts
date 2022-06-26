package com.mycompany.interfaceenhancement;

import javax.swing.DefaultBoundedRangeModel;

public interface Vechicle9 
{
	
	void show();
	
	void show1();
	
	 default void show2()
	{
		System.out.println("hello");
	}

	 public static void show3()
	 {
		 System.out.println("static method");
	 }
}
