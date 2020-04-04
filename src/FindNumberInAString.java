import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindNumberInAString {
/*
	public void findnumber(String s)
	{
		int num;
		int len=s.length();
		for(int i=0;i<len;i++)
		{

			num=(int)s.charAt(i);
//			System.out.println(num);
			if(num >= 48 && num<=57)
			{
			System.out.println(s.charAt(i));		
			}
		}
	}*/
	public static void main(String[] args) {

	/*	
		FindNumberInAString find=new FindNumberInAString();
		find.findnumber(s);
		
	*/	
		String s="45jjij84";String exp="\\d";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
		
		
	}

}
