
public class StaticVariable {

	static int i;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StaticVariable sv=new StaticVariable();
       sv.i=10;
       sv.j=20;
       System.out.println(sv.i);
       System.out.println(sv.j);
       
       StaticVariable sv1=new StaticVariable();
       System.out.println(sv1.i);
       System.out.println(sv1.j);
	}

}
