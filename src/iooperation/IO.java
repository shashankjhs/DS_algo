package iooperation;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) {

    System.out.println(System.getProperty("user.dir"));
    System.out.println(new Exception().getSuppressed()[1]);
    System.out.println(new Exception().getStackTrace().());
    System.out.println(new Exception().getStackTrace()[3].getClassName());
    System.out.println(new Exception().getStackTrace()[1].getMethodName());
    System.out.println(new Exception().getStackTrace()[2].getMethodName());
    System.out.println(new Exception().getStackTrace()[3].getMethodName());
    
    
/*		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("Enter the string");
	    try {
			String s1=br.readLine();
			FileOutputStream fos=new FileOutputStream("E://file2.txt",true);
			byte ba[]=s1.getBytes();
			fos.write(ba);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/	    
	
	}
}