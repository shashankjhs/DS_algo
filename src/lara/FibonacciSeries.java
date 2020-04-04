package lara;

public class FibonacciSeries {

	public static void main(String[] args) {

		int len=10;
		printFibonacci(len);
	}

	private static void printFibonacci(int len) {
        int k=0,j=1;
        int sum=0;
        System.out.print(k);
        System.out.print(j);
		for(int i=2;i<len;i++)
		{
			sum=k+j;
			System.out.print(sum);
			k=j;
			j=sum;
		}
	}

}
