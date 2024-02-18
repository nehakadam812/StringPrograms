package string_;

public class String_2 {
	public static void main(String[] args) {
		String busnum=new String("MH-12");
		String pin= new String("411043");
		//System.out.println(pin);
		
		String ab=busnum+pin;
		   StringBuilder n=new StringBuilder(ab);
			
		     System.out.println(n.delete(pin.length()-1,ab.length() ));
				
	}

}
