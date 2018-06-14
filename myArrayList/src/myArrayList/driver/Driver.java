package myArrayList.driver;

import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;

public class Driver 
{
	
	
	public static void main(String[] args) throws Exception 
	{
		if (args.length==0)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		FileProcessor fp = new FileProcessor();
		MyArrayList mal = new MyArrayList();
		
		fp.InputFile = args[0];
		
	    String str;
	    
	    while((str = fp.readLine()) != null) {
	    	int element = Integer.parseInt(str);
	    	//System.out.println(element);
	    	mal.insertSorted(element);
	    }
	    
	    mal.displayArr();
	    System.out.println(mal.size());
	    System.out.println(mal.sum());
	    mal.removeValue(23);
	    mal.displayArr();
	    System.out.println(mal.size());
	    System.out.println(mal.sum());
	    System.out.println(mal.indexOf(3));
	    /*
	    while ((str = fp.readLine()) != null) {
	    	System.out.println(str);
	    }
	    */
	    
	}
	
}
