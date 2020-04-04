
public class DefaultConstructor {

	public DefaultConstructor(){
		this(7);
		System.out.println("inside DefaultConstructor()");
	}
	public DefaultConstructor(int x){
		this("Shashank");
		System.out.println("inside DefaultConstructor(int x)");
	}
	public DefaultConstructor(String x){
		System.out.println("inside DefaultConstructor(String x)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor dc=new DefaultConstructor();

	}

}
