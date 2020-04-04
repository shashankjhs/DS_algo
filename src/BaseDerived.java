
class Base
{
public void Bass()
{
	System.out.println("eds");
	}
public void Bass2()
{
	System.out.println("eds");
	}

	}
class Base1 extends Base
{
public void Bass()
{
	System.out.println("1212");
	}
public void Bass1()
{
	System.out.println("1212");
	}
	}

public class BaseDerived  extends Base{
	public static void main(String[] args) {

Base1 base1=new Base1();
base1.Bass();
base1.Bass2();
base1.Bass1();


		
	}

}
