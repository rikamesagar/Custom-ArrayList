package myArrayList.util;
import java.io.*;
import java.util.*;


public class FileProcessor {
	
	private int[] data = new int[50];
	private Scanner x;
	int i = 0;
	
	public void openFile() {
		try {
			x = new Scanner(new File ("C:\\Users\\rikam\\Google Drive\\Summer 2018\\Design Patterns\\projects\\csx42-s18-assign-1--srikame1\\myArrayList\\src\\myArrayList\\util\\input.txt"));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public void readFile() {
		
		while(x.hasNext()){
			data[i] = x.nextInt();
			i++;
		}
	}
	
	public void closeFIle() {
		x.close();
	}
	
	public void printArray() {
		for(int j =0; j<i; j++)
			System.out.println(data[j]);
	}
	
}
