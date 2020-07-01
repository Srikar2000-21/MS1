package com.wipro.arrays;
import java.util.Scanner;
public class EXE_A13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,temp=0,c=0;
		int[] a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]!=10) {
				temp=a[i];
		a[i]=0;
		a[c]=temp;
		c++;}
			else
				a[i]=0;}
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		

	}

}
