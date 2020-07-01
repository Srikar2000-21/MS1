package com.wipro.flowcontrolstatements;

public class Ex5 {
	 public static void main (String[] args)
	    {
		 String gender=args[0];
		 int age =Integer.parseInt(args[1]);
		 if(gender.equalsIgnoreCase("Female")) {
			 if(age>=1 && age<=58)
			 {
				 System.out.println("Intrest=8.2");
			 }
			 
		 }
}
}

