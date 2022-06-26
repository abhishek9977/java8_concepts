package com.mycompany.interfaceenhancement;

public class Hero implements Vechicle9 
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}
	
	public void result()
	{
		Hero h=new Hero();
		h.show2();
	}
	
	public void staticMethod()
	{
		Vechicle9.show3();
	}

}
