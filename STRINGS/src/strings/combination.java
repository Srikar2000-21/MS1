package strings;
import java.util.Scanner;
public class combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int k=0;
		//System.out.println(s1.charAt(0));
		if(s1.length()>s2.length()) {
		for(int i=0;i<s2.length();i++)
		{
			
		
			System.out.print(s1.charAt(i));
		
			System.out.print(s2.charAt(i));
			k=i;}
		System.out.print(s1.substring(k));
		
		
	
		}
		else if(s2.length()>s1.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				
			
				System.out.print(s1.charAt(i));
			
				System.out.print(s2.charAt(i));
				k=i;
				}
			
			System.out.print(s2.substring(k));
		
			}
		else if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				
			
				System.out.print(s1.charAt(i));
			
				System.out.print(s2.charAt(i));
			}
		}
		
	}

}
