
public class LinearSearch {
	public static void main(String[] args) {

		int[] arr={1,2,4,5,1,0,2,1,8,4,3,1,6,9};
		int a=1;
		int loc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			loc=i;
		}
		System.out.println(loc);
	}

}
