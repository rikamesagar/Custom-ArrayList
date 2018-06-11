package myArrayList.driver;

import myArrayList.util.FileProcessor;

public class Driver 
{

	public static void main(String[] args) 
	{
/*	    // command line validation is missing here. FIXME!
**	    System.out.println("Hello World: " + args[0] + ", " + args[1] + ", " + args[2]);
*/	    
	    FileProcessor fp = new FileProcessor();
	    fp.openFile();
	    fp.readFile();
	    fp.closeFIle();
	    fp.printArray();
	    
	}
	
}
