package dataStructure;

public class Stack {
 int StackArray[];
int top;
int maxsize;
	public void push(int number)
	{
		if(isfull())
		StackArray[++top]=number;
		else
			System.out.println("stack is full");
	}
	
	public int pop(int number)
	{
		
		return StackArray[top--]; 
	}
	
	public int peek()
	{
		return StackArray[top];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public boolean isfull()
	{
		if(top>=maxsize-1)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.maxsize=5;
		stack.top=-1;
		stack.StackArray=new int[stack.maxsize];
		stack.push(10);
		stack.push(20);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		
 
		//stack.push(12);
		System.out.println(stack.StackArray.length);
		System.out.println(stack.StackArray[0]);
		System.out.println(stack.StackArray[1]);
		System.out.println(stack.StackArray[2]);
		System.out.println(stack.StackArray[3]);
		System.out.println(stack.StackArray[4]);
		System.out.println(stack.StackArray[5]);
		
		
        
	}

}
