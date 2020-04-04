
class test {

	int i,j;
	void function1()
	{
		System.out.println("inside function1() of Class test");
	}
	void functionA()
	{
		System.out.println("inside functionA() of Class test");
	} 
	

}
class Inheritance extends test{
	int i,k;
	void function1()
	{
		System.out.println("inside function1() of Class Inheritance");
	}
	void function2()
	{
		System.out.println("inside function2() of Class Inheritance");
	}
	public static void main(String args[])
	{
		System.out.println("1245");
		test in=new test();
		test in1=new Inheritance();
	    in1.function1();
	    in1.functionA();
//	    in1.function2();
	}
 }
