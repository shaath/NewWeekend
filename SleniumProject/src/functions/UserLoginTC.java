package functions;

public class UserLoginTC {

	public static void main(String[] args)
	{
		FunctionMaster m=new FunctionMaster();
		 
		 String res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("Sharath12345", "Sharath12345");
		 System.out.println("Aplication Login "+res);
		 
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");

	}

}
