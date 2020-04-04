package string;

public class ReverseString {

	public static void main(String[] args) {

		String abc="shashank";
		char[] ab=new char[abc.length()];
		int count =0;
		for(int i=abc.length()-1;i>=0;i--)
		{
			ab[count]=abc.charAt(i);
//			System.out.println(abc.charAt(i));
			count++;
		}
		String ac=new String(ab);
		System.out.println(ac);
		
	}

}
