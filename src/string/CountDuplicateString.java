package string;

import java.util.ArrayList;

public class CountDuplicateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String arr[]={"abc","axyz","xyz","abc","axyz","xyz","abc"};
		int len=arr.length;
		ArrayList al=new ArrayList();
		for(int i=0;i<len;i++)
		{
			int count=0;
			for(int j=i+1;j<len;j++)
			{
				if(arr[i].compareTo(arr[j])==0)
				{
					
					count++;
				}
			}
			if(count>0 && !al.contains(arr[i]))
			{
				System.out.println(count+1);
				al.add(arr[i]); 
			}
		}
		
	}

}
