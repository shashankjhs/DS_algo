package string;

public class StringToCharArray {

	public static void main(String[] args) {

		String str="shashanktripathiksak";
		char s[]=new char[str.length()];
		s=str.toCharArray();
		for(char printstring : s)
		{
			System.out.println(printstring);
		}
	}

}
