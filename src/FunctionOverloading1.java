
public class FunctionOverloading1 {
	/*
	void function(int x,int y){
		System.out.println("Inside function int int  "+x+"   "+y);
	}
	void function(int x,float y){
		System.out.println("Inside function int float "+x+"   "+y);
	}
	void function(float x,int y){
		System.out.println("Inside function  float int"+x+"   "+y);
	}*/
	void function(float x,float y){
		System.out.println("Inside function  float float"+x+"   "+y);
	}
	/*
	void function(long x){
		System.out.println("Inside function long "+x);
	}
	void function(double x){
		System.out.println("Inside function double "+x);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading1 fo=new FunctionOverloading1();
        int a=6;
        float b=7.8f;
        double c=4.3;
        fo.function(a,a);
       /* fo.function(b,a);
        fo.function(a,a);*/
        fo.function(b,b);
	}

}
