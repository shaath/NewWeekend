package functions;

public class ORgHRMTestSuite {

	public static void main(String[] args) 
	{
		FunctionMaster m=new FunctionMaster();
		//LoginTC
 
		 
		 String res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("Admin", "admin");
		 System.out.println("Aplication Login "+res);
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");
		 
		 
		 //Empreg
		 
		 res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("Admin", "admin");
		 System.out.println("Aplication Login "+res);
		 
		 res=m.org_Empreg("Sandeep", "G");
		 System.out.println("Employee registration "+res);
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");
		 
		 //UserReg
		 
		 res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("Admin", "admin");
		 System.out.println("Aplication Login "+res);
		 
		 res=m.org_Userreg("Sandeep G", "SandeepG1223", "SandeepG1223", "SandeepG1223");
		 System.out.println("User registration "+res);
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");
		 
		 //UserLoginTC

		 res=m.org_Launch("http://opensource.demo.orangehrmlive.com");
		 System.out.println("Applicaion LAaunch "+res);
		 
		 res=m.org_Login("SandeepG1223", "SandeepG1223");
		 System.out.println("Aplication Login "+res);
		 
		 
		 res=m.org_Logout();
		 System.out.println("Application Logout "+res);
		 
		 m.org_Close();
		 System.out.println("Application Closed Successfully");

		 
	}

}
