package string;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0,count=0;

		try
		{
			for(i=0;;i++)
			{
				char ch=str.charAt(i);
			}
		}
		catch(IndexOutOfBoundsException y)
		{
			System.out.println(i);
		}
	}

}
