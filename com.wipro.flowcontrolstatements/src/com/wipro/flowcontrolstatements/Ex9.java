package com.wipro.flowcontrolstatements;

class Ex9 { 
	public static void main(String[] args) {
		int number=0;
	number = Integer.parseInt  ("Enter any number equal to or between 1-12 to display the month");
    if ((number < 1)&&(number > 12)) {
        System.out.println("You have entered an invalid month number");
    } 
    else 
    {
    	System.out.println("You have entered an valid month number");
	}  	
	}
}
