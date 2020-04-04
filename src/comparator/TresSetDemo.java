package comparator;

import java.util.TreeSet;

public class TresSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyComparator mycomparator=new MyComparator();
      TreeSet t=new TreeSet(mycomparator);
      t.add(10);
      t.add(0);
      t.add(15);
      t.add(20);
      t.add(20);
      System.out.println("treeset "+t);

	}

}
