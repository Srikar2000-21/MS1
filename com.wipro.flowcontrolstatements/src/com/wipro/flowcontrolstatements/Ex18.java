package com.wipro.flowcontrolstatements;
public class Ex18 {
public static void main(String args[])
{
	int num = 1221,temp;
	temp=num;
	 int reversed = 0;
     while(num!=0)
     {
   	  int digit = num%10;
   	  reversed =  reversed*10+digit;
   	  num = num /10;
     }
	if(temp==reversed)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not a aplindrome");
	}
}
}
