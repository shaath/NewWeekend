package day2;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> x=new ArrayList<String>();
		
		
		//Writing the data into an arraylist
		
		x.add("Selenium");
		x.add("Manual");
		x.add("UFT");
		
		x.add(1, "QEdge");
		
		//Finding the length of the arraylist
		System.out.println(x.size());
		
		//Reading the data from the arraylist
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
		}
		
		
		
		
		
		
				

	}

}
