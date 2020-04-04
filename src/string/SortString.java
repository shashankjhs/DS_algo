package string;

class SortString
{
	public static void main(String args[])
	{
		String[] array={"juijg","tgfrd","mnjk","asda"};
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				
				if(array[i].charAt(0)>array[j].charAt(0))
				{
				String	temp=array[i];
				array[i]=array[j];
				array[j]=temp;
					
				}
			}
			
		}
		for(String str: array)
		{
			System.out.println(str);
		}
	}
	}