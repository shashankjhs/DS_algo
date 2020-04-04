package lara;

public class StringCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countXX("xxx"));

	}
	static int countXX(String str) {
		  int count =0;
		  if(str.charAt(1)==' ')
		  System.out.println(str.substring(0, 1));
		  for(int i=0;i<str.length()-1;i++)
		  {
			  System.out.println(str.substring(i,i+2));
		  if(str.substring(i,i+2).equals("xx"))
		  count =count+1;
		  }
		  return count;
		}


}
