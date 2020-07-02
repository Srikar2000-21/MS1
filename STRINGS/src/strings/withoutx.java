package strings;
import java.util.Scanner;
public class withoutx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int k=s1.length();
		if(s1.charAt(0)=='x'&&s1.charAt(k-1)=='x')
			
		
			System.out.println(s1.substring(1,k-1));
		else if(s1.charAt(0)=='x')
		System.out.println(s1.substring(1));
		else if(s1.charAt(k-1)=='x')
			System.out.println(s1.substring(0,k-1));
			
			else
				System.out.println(s1);
			}

}
