package string_;
import java.util.Scanner;

public class String_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String first_name=sc.next();
		//System.out.println(first_name.hashCode());
		System.out.println("last name");
		String last_name=sc.next();
		//System.out.println(last_name.hashCode());
		//String first_name=first_name + last_name;
		
		
		first_name=first_name.concat(last_name);
	
		System.out.println(first_name);
		
		char a=first_name.charAt(0);
		System.out.println(a);
		
		
		
		
		
	}

}
