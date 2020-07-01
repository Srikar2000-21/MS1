package com.wipro.arrays;
import java.util.Scanner;
public class EXE_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,sum=0,avg=0;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
			sum+=a[i];
		avg=sum/size;
		System.out.println("The sum of given array is "+ sum);
		System.out.println("The average of given array is "+ avg);
		
	}

}

