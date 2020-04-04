
class SuperClass1

{
int a,b;
public SuperClass1(int x) {
a=x;
System.out.println("Inside SuperClass(Int i)");
}
}
public class SuperClassWithArgument extends SuperClass1{
	SuperClassWithArgument(){
		super(6);
		System.out.println("sdfsdf");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassWithArgument scwa=new SuperClassWithArgument();
	}

}
