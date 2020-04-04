
public class SampleConstructor {

	int i,j;
	public SampleConstructor() {
	System.out.println("Inside constructor");
	i=5;
	j=10;
	
	}
	void SampleConstructor() {
		System.out.println("Inside constructor");
		i=5;
		j=10;
		
		}
	void function(){
		System.out.println("Inside function");
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		SampleConstructor sc=new SampleConstructor();
		SampleConstructor sc1=new SampleConstructor();

		sc1.function();
		sc1.SampleConstructor();
	}

}
