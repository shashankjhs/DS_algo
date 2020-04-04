

class MyThread extends Thread{
    public static void main(String args[]){
 String s="Hello";
 Object o=s;
 if(o.equals(s))
	 {
	 System.out.println("a");
	 
	 }
 else
	 System.out.println("b");
 }
}