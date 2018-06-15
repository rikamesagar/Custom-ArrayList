package myArrayList.driver;

import myArrayList.MyArrayList;
import myArrayList.util.FileDisplayInterface;
import myArrayList.util.FileProcessor;

public class Driver 
{
	
	
	public static void main(String[] args) throws Exception 
	{
		if (args.length==0)
		{
			System.out.println("Files not found");
			System.exit(0);
		}
		
		FileProcessor fp = new FileProcessor(args[0]);
		FileDisplayInterface fdi = new FileDisplayInterface(args[1]);
		MyArrayList mal = new MyArrayList();
		
	    String str;
	    
	    while((str = fp.readLine()) != null) {
	    	//System.out.println(str);
	    	//System.out.println(args[0]);
	    	int element = Integer.parseInt(str);
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
	    String SumString = Integer.toString(mal.sum());
	    fdi.writeToFile(SumString);
	}
}
