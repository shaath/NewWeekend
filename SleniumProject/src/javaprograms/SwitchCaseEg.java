package javaprograms;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		String course="Manual";
		
		switch (course) 
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "LoadRunner":
			System.out.println("You are selected LoadRunner");
			break;

		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
