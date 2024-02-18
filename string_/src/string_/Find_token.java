package string_;

import java.util.Scanner;

public class Find_token {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		String []arr=new String[5];
		
		arr[0]="https//www.amazon.in.token csrf:1024";
		arr[1]="https//www.flipcart.in.token csrf:124";
		arr[2]="https//www.Myntra.in.token csrf:1028";
		arr[3]="https//www.Snapcart.in.token csrf:1358";
		arr[4]="https//www.amazon.in.token csrf:148";
		
	
		if(arr[0].contains("csrf")) {
		int a=arr[0].charAt(arr[0].length()-1);
		//System.out.println(a);
			char u='_';
			String value="";
			 for(int i=1;true; i++) {
				 char v=arr[0].charAt(arr[0].length()-i);
				 if(v!=u)
				 {
					System.out.println(v); 
					value+=v;
				 }
				 else { 
					 break;
				 }
				 System.out.println(value);
				 int a1=Integer.valueOf(value);
				 System.out.println(a1);
			 }
		    
		}
			
		
		
		
	}

}
