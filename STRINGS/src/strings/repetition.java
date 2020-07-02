package strings;
import java.util.Scanner;
public class repetition {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(s1.substring(s1.length()-3));
	}

}
