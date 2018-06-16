package myArrayList.driver;

import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class Driver 
{
	
	
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("Input and Output Files not found");
			System.exit(0);
		}
		
		FileProcessor fp = new FileProcessor(args[0]);
		Results rs = new Results(args[1]);
		MyArrayList mal = new MyArrayList();
		MyArrayListTest malt = new MyArrayListTest();
		
	    String str;
	    
	    while((str = fp.readLine()) != null) {
	    	int element = 0;
	    	try {
	    		element = Integer.parseInt(str);
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error Occured: The value is not an integer");
	    	}
	    	mal.insertSorted(element);
	    }
	    
	    String SumString = Integer.toString(mal.sum());
	    
	    rs.writeToFile(SumString);
	    //rs.writeToStdout(Integer.toString(mal.size()));
	    //rs.writeToStdout(Integer.toString(mal.sum()));
	    
	//    String TestString = Object.toString(malt.testMe(mal , rs));
	//    rs.writeToFile();
	}
}