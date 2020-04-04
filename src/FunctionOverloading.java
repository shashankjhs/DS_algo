
public class FunctionOverloading {

	void function(){
		System.out.println("Inside function");
	}
	void function(int x){
		System.out.println("Inside function  "+x);
	}
	void function(int x,int y){
		System.out.println("Inside function  "+x+"  "+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading fo=new FunctionOverloading();
		fo.function(5);
		fo.function(2,1);
	}

}
