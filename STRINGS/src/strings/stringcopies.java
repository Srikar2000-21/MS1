package strings;

import java.util.Scanner;

public class stringcopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int l =s1.length();
		for(int i=0;i<s1.length();i++)
			System.out.print(s1.substring(0,2));
	}

}

