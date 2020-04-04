package sortingAndSearching;

public class SelectionSort {

	public static void main(String args[])
	{
		int arr[]={1,3,8,4,2,5,6};
		for(int i=0;i<arr.length-1;i++)
		{
			int temp=arr[i];
			int loc=i;
			for(int j=loc;j<arr.length;j++)
			{
				if(arr[j]<temp)
				{
					temp=arr[j];
					loc=j;
				}
				
					
			}
			arr[loc]=arr[i];
			arr[i]=temp;
			/*System.out.println("loc "+loc);
			System.out.println("temp "+temp);
			System.out.println("after");
			
			for(int k=0;k<arr.length;k++)
			{
				System.out.println(arr[k]);
			}*/
			
				
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
