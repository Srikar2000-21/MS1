package com.wipro.flowcontrolstatements;
public class Ex15 {
private static int m;
private static int sum;
private static int n;

public static void main(String args[])
		{
	m = 1234;
	sum = 0;
	while(m>0)
	{
		n=m%10;
		sum = sum+n;
		m = m/10;
		
	}

	System.out.println("Sum of Digits:"+sum);	
	
		}
}
