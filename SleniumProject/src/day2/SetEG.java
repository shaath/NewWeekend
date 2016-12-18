package day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEG {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Manual");
		s.add("UFT");
		s.add("Apple");
		s.add("selenium");
		
		System.out.println(s.size());
		
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
		

	}

}
