import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Sample {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String string1=sc.next();
		HashMap<Character,Integer> hashmap=new HashMap<>(); 

		for(int i=0;i<string1.length();i++)
		{
			int count=0;
			for(int j=0;j<string1.length();j++)
			{
				if(string1.charAt(i)==string1.charAt(j))
				{
					count++;
				}
				}
			hashmap.put(string1.charAt(i), count);
			
		}
		SortedSet<Integer> s=new TreeSet();
		

		for(int i=0;i<string1.length();i++)
		{
			
			s.add(hashmap.get(string1.charAt(i)));
			
			
		}
		
		System.out.println();
		Iterator iterator=s.iterator();
		int num=0;
		while(iterator.hasNext())
		{
		 	num=(int) iterator.next();
		 	if(iterator.hasNext())
			System.out.println(iterator.next());
		}
		
		char ch='1';
		for (Map.Entry<Character, Integer> e : hashmap.entrySet()) {
		    if(e.getValue()==num)
		    {
		    	ch=e.getKey();
		    }
		   
		}
		System.out.println(ch);	
		
	}

}
