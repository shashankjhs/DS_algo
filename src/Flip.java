
public class Flip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[]={1,0,1,0,1,1,0,0,0,0,1};
		int count=0;
		int count1=0;
		int loc=0,firstloc=0;
		int loc1=0,firstloc1=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
				if(count==0)
					firstloc=i;
				count++;
				loc=i;
				
			}
			else if(array[i]==1)
			{
				if(count1==0)
					firstloc1=i;
				count1++;
				loc1=i;
				
			} 
			
		}
		System.out.println(firstloc1);
		System.out.println(loc1);
	   
		System.out.println(firstloc);
		System.out.println(loc);
	   System.out.println(count);
	   System.out.println(array.length-count);
	   
	   
	}

}
