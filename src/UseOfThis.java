
public class UseOfThis {

	 int i;
	public UseOfThis(int x) {
	this.i=i+1;
	i=i+1;
	System.out.println("in Constructor "+i);
	}
	void function()
	{
		int i=67;
		System.out.println("in function "+i);
		System.out.println("in function "+this.i);
		this.i=this.i+1;
	}
	public static void main(String[] args) {
         UseOfThis uot=new UseOfThis(5);
         System.out.println("in main "+uot.i);
         uot.function();
         System.out.println("in main "+uot.i);

	}

}
