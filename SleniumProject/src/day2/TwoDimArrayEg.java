package day2;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
	  
		 Object[][] x=new Object[2][3];
		 
		 //Finding the length of the row
		 
		 System.out.println("Rows Length "+x.length);
		 
		 //Finding the length of the columns
		 
		 System.out.println("Columns length "+x[0].length);
		 
		 //Writing the data into an array
		 
		 x[1][1]="Selenium";
		 x[0][2]="QEdge";
		 
		 //Reading the data from an array
		 
		 for (int i = 0; i < x.length; i++)
		 {
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
				
			}
		 }
		 
		 
		 

	}

}
