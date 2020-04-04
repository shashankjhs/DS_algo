
class InheritanceExample1 {

int i;
void function(){
	System.out.println(i);
}
}
public class InheritanceExample extends InheritanceExample1 {

	int j=0;
	void function(){
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		InheritanceExample ie=new InheritanceExample();
		ie.i=20;
		ie.j=30;
		ie.function();
//		ie.function();
		InheritanceExample1 ie1=new InheritanceExample1();
		ie1.function();
	}

}
