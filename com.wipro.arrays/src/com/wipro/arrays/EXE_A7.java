package com.wipro.arrays;
import java.util.Scanner;

public class EXE_A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,temp=0,j,k;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					for(k=j;k<size-1;k++)
						a[k]=a[k+1];
					size--;
				
				j--;
			}
				
	}

}
		
	
for(i=0;i<size;i++)
	System.out.print(a[i] + " ");
}
}

