package strings;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		
		String s2=sb.toString();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
			
			
	}

}

