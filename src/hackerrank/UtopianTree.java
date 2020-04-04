package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner in = new Scanner(System.in);
	        int t;
	        t= in.nextInt();
	        int result=1;
	        for (int i=0;i<t;i++)
	            {
	        int n;
	        n= in.nextInt();
	            if(n==0)
	                {
	                result=1;
	 System.out.println(result);
	 result=1;
	            }
	                
	            else
	                {
	                for(int j=0;j<n/2;j++)
	                    {
	                    result =result *2;
	                    result =result +1;
	                }
	                if(n%2!=0)
	                {
	                    
	                    result =result *2;
	                }
	                System.out.println(result);
	                result=1;
	            }
	            }
	        }
	        
	        
	    }