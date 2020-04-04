package sortingAndSearching;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,4,8,1,7,3};
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0  && temp<arr[j] )
			{
				arr[j+1]=arr[j];
				--j;
			}
			System.out.println("after for loop");
			for(int k=0;k<arr.length;k++)
			{
				System.out.println(arr[k]);
			}
			
			arr[j+1]=temp;
		}
		System.out.println("after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
