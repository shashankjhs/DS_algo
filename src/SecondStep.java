
public class SecondStep {
	int i=0;
	public void  func(){

		SecondStep sec=new SecondStep();
        sec.i=2;
		
//		i=25;
		System.out.println("inside func");
//		System.out.println(i);
//		System.out.println(j);
	}
	public static void main(String args[])
	{
        SecondStep sec=new SecondStep();
        sec.i=26;
        System.out.println(sec.i);
        
        SecondStep sec1=sec;
        System.out.println(sec1.i);
        
        sec=new SecondStep();
        System.out.println(sec.i);
        sec.func();
        System.out.println(sec.i);
	}

}
