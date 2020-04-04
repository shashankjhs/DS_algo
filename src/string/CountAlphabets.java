package string;

import java.util.ArrayList;

public class CountAlphabets {

	public static void main(String[] args) {

		String str="shashank";
		int len=str.length();
		char st[]=new char[len];
		st=str.toCharArray();
		ArrayList repeat=new ArrayList();
	     for(int i=0;i<len;i++)
	     {
	    	 int count=1;
	    	 for(int j=i+1;j<len;j++)
	    	 {
	    		 if(st[i]==st[j])
	    		 {
	    			 
	    			 count++;
	    		 }
	    	 }
	    	 if(count>=1  && repeat.contains(st[i]))
	    	 System.out.println(st[i] +":"+ count);
	    	 repeat.add(st[i]);
	     }
	}

}

