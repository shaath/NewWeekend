package javaprograms;

import java.util.Scanner;

public class NestedIFEg {

	public static void main(String[] args)
	{
//		int a=200000;
//		int b=50000;
//		int c=6000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Vaalue");
		int a=sc.nextInt();
		
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		
		System.out.println("Enter C Value");
		int c=sc.nextInt();
		
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > c & b> a) 
		{
			System.out.println("B is Greater ");
		}
		else
		{
			System.out.println("C is Greter");
		}

	}

}
