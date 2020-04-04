
public class ObjectTypeReturn {
    static int x;
	ThirdStep getA(){
		ThirdStep ts=null;
		ts=new ThirdStep();
		return(ts);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectTypeReturn ort=new ObjectTypeReturn();
		ThirdStep ts1=ort.getA();
		//or we can use below statement
		ort.getA();
		System.out.println(ort.getA());
		System.out.println(ts1);
		ort.x=2;
		ts1.functionA();
		ort.getA().functionA();

	}

}
