package comparator;

import java.util.Comparator;

public class MyComparator implements Comparator{

	 public int compare(Object obj1,Object obj2)
	 {
		 Integer int1=(Integer)obj1;
		 Integer int2=(Integer)obj2;
		 if(int1 >int2)
			 return -1;
		 else 
			 if(int1<int2)
		 return +1;
			 else
		 return 0;
		 
		 //return int1.compareTo(int2); //do sorting in ascending as done in default
		 
		 //return -int1.compareTo(int2); //do sorting in Descending order
		 
		 //return int2.compareTo(int1); //do sorting in Descending order
		 
		 //return int2.compareTo(int1); //do sorting in ascending as done in default
		 
		 
		 //return +1; //Get result as insertion order
		 
		 //return +1; //Get result reverse of insertion order
		 
		 //return 0;
	 }
}
