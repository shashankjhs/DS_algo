package lara;

public class Amstrong {

	public static void main(String[] args) {
         int sum=0;
		
		int num1=153;
		int num=num1;
		while(num>0)
		{
			int a=num%10;
			sum=sum+a*a*a;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==num1)
		{
			System.out.println("ams");
		}
		else
			System.out.println("not ams");
	}

}
