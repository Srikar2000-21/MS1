package com.wipro.arrays;
import java.util.Scanner;
public class EXE_A11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		int k=0;
		for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==1||a[i]==4)
				k++;
		}
		if(k!=a.length)
				System.out.println("false");
			else
				System.out.println("true");
				

	}

}
