package strings;
import java.util.Scanner;
public class withoutspc1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		char k;
		int z=0;
		for(int i=0;i<s1.length();i++)
		{
	      k=s1.charAt(i);
		if(k=='*'|| k=='-') {
			z=i;
		break;}
		}
		System.out.println(s1.substring(0,z-1)+s1.substring(z+2));
			
			
			
		}	

}
