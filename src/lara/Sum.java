package lara;

import java.util.Scanner;

public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       int num1,num2,sum;
       Scanner sc=new Scanner(System.in);
       num1=Integer.parseInt(sc.next());
       num2=Integer.parseInt(sc.next());
       sum=num1+num2;
       System.out.println(sum);
	}

}
