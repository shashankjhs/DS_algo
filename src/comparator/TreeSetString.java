package comparator;

import java.util.TreeSet;

public class TreeSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      TreeSet t=new TreeSet(new CoparatorForString());
      t.add("A");
      t.add(new StringBuffer("DD"));
      t.add("BH");
      t.add(new StringBuffer("LO"));
      t.add("A");
      t.add("NJAH");
      t.add("POL");
      System.out.println(t);

	}

}
