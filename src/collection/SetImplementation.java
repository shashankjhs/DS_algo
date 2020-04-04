package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<StringBuffer> set=new TreeSet<StringBuffer>();
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("B"));
		set.add(new StringBuffer("C"));
		set.add(new StringBuffer("D"));
		set.add(new StringBuffer("E"));
		set.add(new StringBuffer("F"));
		set.add(new StringBuffer("G"));
		
	/*	set.add(new StringBuffer("A").toString());
		set.add(new StringBuffer("B").toString());
		set.add(new StringBuffer("C").toString());
		set.add(new StringBuffer("D").toString());
		set.add(new StringBuffer("E").toString());
		set.add(new StringBuffer("F").toString());
		set.add(new StringBuffer("G").toString());
*/		System.out.println(set);
	}

}
