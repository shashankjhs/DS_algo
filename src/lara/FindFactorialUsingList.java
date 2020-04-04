package lara;

import java.util.ArrayList;
import java.util.List;

public class FindFactorialUsingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		 ArrayList a1=new ArrayList();
		int num=120;
		for(int i=1;i<(num/2)+1;i++)
		{
			if(num%i==0)
			{
				a1.add(i);
			}
				
//		}
//		for (ArrayList a: a1) {
//			System.out.println(a);
//			
//		}
			
		}
		System.out.println(a1);
		}

}
