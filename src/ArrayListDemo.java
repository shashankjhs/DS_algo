import java.util.ArrayList;


public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ArrayList<Object> al=new ArrayList<Object>();
    	char c;
    	int i;
    	c = 'A';	// 1
    	i = c;	//2
    	c = (char) (i + 1);	//3
    	c++;	
        al.add("IND");
        al.add("USA");
        al.add("NZ");
        al.add("EURO");
        al.add("UK");
        al.add("AUS");
        al.add("PAK");
        al.add("CHN");
        al.add("RUS");
        System.out.println("Size of arraylist "+al.size());
        System.out.println("Contents of the list "+al);
        //converting array list to array
        Object s[]=al.toArray();
        for(int i=0;i<al.size();i++)
        {
        	String sh=(String) s[i];
        	System.out.println(s[i]);
        }
        
        
	}

}
 