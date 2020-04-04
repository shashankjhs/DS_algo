
public class StaticBlock {
	int i;
	StaticBlock()
	{
		System.out.println("Inside the construstor");
	}
	static 
	{
		System.out.println("Inside th static block");
	}
	{
		System.out.println("inside not static block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		StaticBlock sb=new StaticBlock();
		

	}

}
