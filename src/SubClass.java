


class SuperClass  {

 int i,j;
 public SuperClass() {

	 System.out.println("inside SuperClass() of SuperClass");
 }

}

public class SubClass  extends SuperClass{
	int i,j;
	 public SubClass() {

		 System.out.println("inside SubClass() of SubClass");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc=new SubClass();

	}

}
