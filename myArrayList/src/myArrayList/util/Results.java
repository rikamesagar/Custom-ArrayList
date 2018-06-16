package myArrayList.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import myArrayList.MyArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	private File file;
	private BufferedWriter bw;
	
	MyArrayList mal = new MyArrayList();
	
	private String OutputFile = null;
	
	public Results(String OutputFile){
		try {
			this.OutputFile = OutputFile;
			file = new File(OutputFile);
			bw = new BufferedWriter(new FileWriter(OutputFile));
		}
		catch(Exception e){
			System.out.println();
		}
	}
	
	public void writeToFile(String s){
		try {
			bw.write("The sum of all the values in the array list is: "+ s);
			bw.close();
		}
		catch (Exception e) {
			System.out.println("Error Occured: Writing to the file failed");
		}
	}

	public void writeToStdout(String s) {
		System.out.println(s);
//		mal.displayArr();
//	    System.out.println(mal.size());
//	    System.out.println(mal.sum());
//		
//		mal.displayArr();
//	    System.out.println(mal.size());
//	    System.out.println(mal.sum());
//	    System.out.println(mal.indexOf(3));
	    
	    
	}
}
