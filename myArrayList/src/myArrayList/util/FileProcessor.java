package myArrayList.util;
import java.io.*;
import java.util.*;


public class FileProcessor {
	
	private int[] data = new int[50];
	private Scanner x;
	private Formatter x1;
	int i = 0;
	int sum = 0;
	
	public void openInputFile() {
		try {
			x = new Scanner(new File ("C:\\Users\\rikam\\Google Drive\\Summer 2018\\Design Patterns\\projects\\csx42-s18-assign-1--srikame1\\myArrayList\\src\\myArrayList\\util\\input.txt"));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public void readInputFile() {
		
		while(x.hasNext()){
			data[i] = x.nextInt();
			i++;
			
		}
	}
	
	
	
	public void closeInputFile() {
		x.close();
	}
	
	public void printArray() {
		for(int j =0; j<i; j++)
			System.out.println(data[j]);
	}
	
	public void openOutputFile() {
		try {
			x1 = new Formatter("C:\\Users\\rikam\\Google Drive\\Summer 2018\\Design Patterns\\projects\\csx42-s18-assign-1--srikame1\\myArrayList\\src\\myArrayList\\util\\Output.txt");
		}
		catch (Exception e) {
			System.out.println("Error while creating output file");
		}
	}
	
	public void addDataToOutputFIle() {
		for(int j = 0; j<i; j++)
			sum = sum  + data[j];
		x1.format("The sum of all the values in the array list is: %d", sum);
	}
	
	public void closeOutputFile() {
		x1.close();
	}
}
