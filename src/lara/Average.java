package lara;

import java.util.Scanner;

public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     int num1,num2,num3,avg;
     Scanner sc=new Scanner(System.in);
     num1=Integer.parseInt(sc.next());
     num2=Integer.parseInt(sc.next());
     num3=Integer.parseInt(sc.next());
     avg=(num1+num2+num3)/3;
     System.out.println(avg);
     
	}

}
