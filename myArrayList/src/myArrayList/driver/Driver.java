package myArrayList.driver;

import java.io.FileNotFoundException;

import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;

public class Driver 
{
	
	
	public static void main(String[] args) throws Exception 
	{
		FileProcessor fp = new FileProcessor();
		MyArrayList mal = new MyArrayList();
		
		
	    String str;
	    
	    while((str = fp.readLine()) != null) {
	    	int element = Integer.parseInt(str);
	    	//System.out.println(element);
	    	mal.insertSorted(element);
	    }
	    
	    mal.displayArr();
	    
	    /*
	    while ((str = fp.readLine()) != null) {
	    	System.out.println(str);
	    }
	    */
	    
	}
	
}
