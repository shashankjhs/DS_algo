package lara;

class Element
{
	private Element Next;
	private Object data;
	public void add(Object data)
	{
		this.data=data;
	}
	public Object get()
	{
		return data;
	}
	public void setLink(Element Next)
	{
	this.Next=Next;
	}
	public Element getLink()
	{
	return Next;
	}
	}
public class LinkedList {

	private Element back,front;
	public void add(Object data)
	{
		Element element=new Element();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
