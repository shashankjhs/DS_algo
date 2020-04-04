package sortingAndSearching;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[]={5,4,8,1,0,15,1,2,12,32,32,43,54,12,1,76,23,9,12,58,65,10,11,55,88,33,77,985};
		sort(arr);
		
	}

	private static void sort(int[] arr) {

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
