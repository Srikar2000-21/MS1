package strings;
import java.util.Scanner;
public class stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	if(Character.isUpperCase(s1.charAt(0))&& Character.isUpperCase(s2.charAt(0)))
		System.out.println((s1+" "+s2).toLowerCase());
	else
		System.out.println((s1+s2).toLowerCase());

	}

}

