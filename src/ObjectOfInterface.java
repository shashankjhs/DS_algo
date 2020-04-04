

public class ObjectOfInterface implements CreateInterface {

	public void functionA(){System.out.println("FunctionA");};
	public void  function1(){System.out.println("Function1");};
	public static void main(String[] args) {
		CreateInterface ci=new ObjectOfInterface();
		ci.function1();

	}

}
