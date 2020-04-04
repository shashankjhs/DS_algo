
public class SecondHighestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int arr[]={5,9,8,1,3,4,10,5};
    /* int temp=0;
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(arr[i]<arr[j])
    		  
    			 temp=arr[j];
    		 
    	 }
     }*/
     System.out.println(find2MaxValue(arr));
	}
	
	
	private static int find2MaxValue(int[] arr) {
		// TODO Auto-generated method stub
		int first=0,second=0;
//		int n1=arr[0];
//		int n2=arr[1];
		if(arr[0]>arr[1])
		{
			first=arr[0];
			second=arr[1];
		}
		else
		{
			first=arr[1];
			second=arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				second=arr[i];
			}
		}
		return second;
	}
	}
