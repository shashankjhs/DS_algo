

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SampleTest {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
	
	char[] ch=str.toCharArray();
	ArrayList<Character> al=new ArrayList<Character>();
	Map<Integer, Character> map = new HashMap<Integer, Character>();
	for(int i=0;i<ch.length;i++)
	{
	   int count=1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
		if(count>=1&&!al.contains(ch[i]))
		{
			
			map.put(count, ch[i]);
			
		}
		al.add(ch[i]);
	}
	
	System.out.println(map.get(find2MaxValue(map.keySet())));

	}
	private static int find2MaxValue(Set<Integer> set) {
		
		Object[] obj = new ArrayList<Integer>(set).toArray();
		int[] arr = new int[obj.length];
		for(int i=0; i<obj.length; i++){
			arr[i]=(int) obj[i];
		}
		
		int first=0,second=0;

		if(arr[0]>arr[1])
		{
			first=arr[0];
			second=arr[1];
		}
		else
		{
			first=arr[1];
			second=arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				second=arr[i];
			}
		}
		return second;
	}
	

}
