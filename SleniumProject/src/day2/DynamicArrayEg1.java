package day2;

public class DynamicArrayEg1 {

	public static void main(String[] args) 
	{
		Object[] x=new Object[10];

		//Finding the length of the array
		
		System.out.println(x.length);
		
		//Write the data into array
		
		x[5]="Selenium";
		
		x[7]=40000;
		
		x[5]="Sharath";
		
 
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
		
		
		
	}

}
