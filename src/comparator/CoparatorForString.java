package comparator;

import java.util.Comparator;

public class CoparatorForString implements Comparator{

	/**
	 * @param args
	 */
      public int compare(Object obj1,Object obj2)
      {
      
    	  String s1=obj1.toString();
    	  String s2=obj2.toString();
    	  int len1=s1.length();
    	  int len2=s2.length();
    	  if(len1 >len2)
    		  return 1;
    	  else if(len1 <len2)
    		  return -1;
    	  else 
    		 return s1.compareTo(s2);
    	  
      }

}
