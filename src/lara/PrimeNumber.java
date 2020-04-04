package lara;

import java.util.Scanner;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn=new PrimeNumber();
		int number=14;
	    Scanner sc=new Scanner(System.in);
	    int num1=Integer.parseInt(sc.next());
        System.out.println(pn.prime(num1));
	}
	public String prime(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count>0)
			return num+" is not prime";
		else
			return num+" is prime number";
	}

}
