package com.ISHAS;

public class Dog extends Animal{
/*This class will have a is relationship with Animal and will have a has a relationship with Collar*/
	Collar col=new Collar();
	
	void dogcode(){

	col.collar();	
	System.out.print("Inside Dog code");
	}
	
}
