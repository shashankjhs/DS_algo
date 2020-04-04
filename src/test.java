import java.util.Scanner;


public class test {

	/**
	 * @param args
	 */
	static int getLastIndex( int[] arr, int result){
		
		for(int i =0,sum =0; i < arr.length && sum < result; i++){
			sum += arr[i];
			if(sum == result){
				return i;
			}else if(sum > result){
				sum = 0;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++){
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		int lastIndex = getLastIndex(arr,sum);
		int tempIndex = lastIndex;
		while(sum > 0){
			sum -= arr[tempIndex--];
		}
		for(tempIndex++; tempIndex <= lastIndex; tempIndex++){
			System.out.println(arr[tempIndex]);
		}

	}

}
