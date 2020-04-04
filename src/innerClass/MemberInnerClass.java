package innerClass;

public class MemberInnerClass {
	int x;
	class Inner1{
		int i;
		public void function(){
			System.out.println("Inside function of inner1");
			x=25;
			funcouter();
		}
	}
		public void funcouter(){
			x=x+1;
			Inner1 in=new Inner1();
			in.i=25;
			System.out.println(in.i);
		}
		public static void main(String args[])
		{
			MemberInnerClass.Inner1 mi=new MemberInnerClass().new Inner1();
			mi.function();
			
		}
	}


