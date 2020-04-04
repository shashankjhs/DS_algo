

public class StringCocantenation {

	String s="abcde";
	int i=1;
	int j=25;
	public void functionA(){
		System.out.println(s+i+j);
		System.out.println(i+s+j);
		System.out.println(i+j+s);
	}
	public static void main(String[] args) {

		StringCocantenation sc=new StringCocantenation();
		sc.functionA();
		
	}

}
