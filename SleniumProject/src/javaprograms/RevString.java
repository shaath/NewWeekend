package javaprograms;

public class RevString {

	public static void main(String[] args)
	{
		String R="";
		
	    String O="Dad";
	    
	    int len=O.length();
	    
	    System.out.println(len);
	    
//	    System.out.println(O.charAt(2));
	    
	    for (int i = len-1 ; i >= 0; i--)
	    {
//			System.out.print(O.charAt(i));
			R=R+O.charAt(i);
			
		}
	    System.out.println(R);
	    
	    if (O.equalsIgnoreCase(R)) 
	    {
			System.out.println("Given String is polindrome");
		}
	    else
	    {
	    	System.out.println("Given String is not a polindrome");
	    }

	}

}
