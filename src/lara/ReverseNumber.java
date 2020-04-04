package lara;

public class ReverseNumber {

	public static void main(String[] args) {

		int revrse=0;
		int num=123456;
		while(num>0)
		{
			int temp=num%10;
//			System.out.print(temp);
			revrse=revrse*10 +temp;
			num=num/10;
		}
		System.out.println(revrse);
	}

}
