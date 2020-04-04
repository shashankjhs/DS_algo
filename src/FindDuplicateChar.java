
public class FindDuplicateChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  int loc=0;
		String name=new String("pradeepee");
		for(int i=0;i<name.length();i++)
		{
//			System.out.println(i);
			char was=name.charAt(i);
			for(int j=i+1;j<name.length();j++)
			{
				
				if(was==name.charAt(j) && i>=1)
				{ 
					
					if(loc==i)
					{
						loc=j;
					}
					else
					{
					System.out.println(was);
					loc=j;
					}
					
				}
				if(was==name.charAt(j) && i==0)
				{
					System.out.println(was);
					loc=j;
				}
				
			}
		}
	}

}
