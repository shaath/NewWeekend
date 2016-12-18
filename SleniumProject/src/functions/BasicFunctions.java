package functions;

public class BasicFunctions {

	public static void main(String[] args) 
	{
		
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		fun.function3();
		
		boolean result=fun.function4();
		System.out.println(result);
		
		
	}

	//static method without returning any value
	
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non Static Method without returning any value
	
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
		
	}
}
