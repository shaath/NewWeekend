package functions;

public class UserRegTC {

	public static void main(String[] args) 
	{
		FunctionMaster m=new FunctionMaster();
		 
		 String res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("Admin", "admin");
		 System.out.println("Aplication Login "+res);
		 
		 res=m.org_Userreg("Sharath Chandra", "Sharath12345", "Sharath12345", "Sharath12345");
		 System.out.println("User registration "+res);
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");

	}

}
