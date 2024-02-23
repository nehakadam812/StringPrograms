package string_;

public class AllStringMethods {
	
	public static void main(String[] args) {
		String s=new String("Hello");
		
		//Return the length of the string 
		int a=s.length();
		System.out.println(a);
		
		//Return the character at the specific index
		char c=s.charAt(2);
		System.out.println(c);
		
		//concatenates the specific string
		 String conc=s.concat("by");
		 System.out.println(conc);
		 
		 //Compress the current string with the specified object
		  String ex="by";
		  if(s.equals(ex)) {
			  System.out.println("yes");
		  }
		  else {
			  System.out.println("No");
		  }

	/*
	    //Compress the current string with the specified string
	 if(s.endsWith("Hello"))
	
	 {
		  System.out.println("yes");
	  }
	  else {
		  System.out.println("No");
	  }
	 
	 */
		  
	
	 
	 
	 
	 
	
	}
}


