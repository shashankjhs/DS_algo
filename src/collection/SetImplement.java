package collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<=100;i++)
		{
		set.add(i);
		set.remove(i);
		}
		System.out.println(set.size());
	}

}
