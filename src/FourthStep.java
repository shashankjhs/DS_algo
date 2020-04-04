public class FourthStep {

	int i=10;
	ThirdStep ts=new ThirdStep();
	ThirdStep ts1;
	public void function(){
		System.out.println(ts1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    FourthStep fs=new FourthStep();
    System.out.println(fs.ts1);
    System.out.println(fs.i);
    fs.function();
    System.out.println(fs.ts);
    fs.ts.l=12;
    fs.ts.functionA();
	}

}
