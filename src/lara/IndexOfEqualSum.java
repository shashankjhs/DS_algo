package lara;

public class IndexOfEqualSum {

	
	public static void main(String[] args) {

		System.out.println(checkSum());
	}

	private static int checkSum() {
        int arr[]={1,2,3,6,4,1,1};
        int index=0;
        int number=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum1=0;
			int sum2=0;
			for(int j=0;j<i;j++)
			{
				sum1=sum1+arr[j];
			}
			for(int j=i+1;j<arr.length;j++)
			{
				sum2=sum2+arr[j];
			}
			if(sum1==arr[i] && sum2==arr[i] )
			{
				index=i;
				number=arr[i];
		
			}
		}
		return index;
		
		
	}

}
