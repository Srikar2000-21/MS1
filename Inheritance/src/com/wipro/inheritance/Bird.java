package com.wipro.inheritance;

public class Bird extends Animal {
public void fly()
{
	System.out.println("Birds can fly");
	
}
public static void main(String args[])
{
    Bird demo =new Bird();
	demo.eat();
	demo.sleep();
	demo.fly();
}
}
