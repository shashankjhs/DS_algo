	package dataStructure;

public class Queue {
      int capacity=4;
      int arr[]=new int[capacity];
      int top=-1;
      int rear=0;
      public void push(int element)
      {
    	  if(top<=capacity-1)
    	  {
    		  top++;
    		  arr[top]=element;
    		  System.out.println("Element " +element +" pushed in queue");
    		  display();
    	  }
    	  else
    	  {
    		  System.out.println("Queue is overflow");
    	  }
      }
      
      public void pop()
      {
    	  if(top>=rear)
    	  {
    		 
    		 rear++;
    		 System.out.println("Pop done");
    		  display();
    	  }
    	  
    	  else
    	  {
    		  System.out.println("Queue is underflow");
    	  }
      }
	public void display()
	{
		  if (top >= rear) {
			   System.out.println("Elements in Queue : ");
			   for (int i = rear; i <= top; i++) {
			    System.out.println(arr[i]);
			   }
		  }
	}
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.pop();
		queue.push(23);
		  queue.push(2);
		  queue.push(73);
		  queue.push(21);
		  queue.pop();
		  queue.pop();
		  queue.pop();
		  queue.pop();
		

	}

}
