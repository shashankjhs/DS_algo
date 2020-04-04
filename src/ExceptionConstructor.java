class A {
	A() throws Exception{
		System.out.println("In class a constructor");
	}
}
public class ExceptionConstructor extends A {

	ExceptionConstructor() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			ExceptionConstructor ec=new ExceptionConstructor(); 
		}
		catch(Exception w)
		{
			System.out.println(w);
		}
	}

}
