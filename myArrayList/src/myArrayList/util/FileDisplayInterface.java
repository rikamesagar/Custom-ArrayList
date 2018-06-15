package myArrayList.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDisplayInterface {
	
	private File file;
	private BufferedWriter bw;
	
	private String OutputFile = null;
	
	public FileDisplayInterface(String OutputFile) throws Exception {
		this.OutputFile = OutputFile;
		file = new File(OutputFile);
		bw = new BufferedWriter(new FileWriter(OutputFile));
	}
	
	public void writeToFile(String s) throws IOException {
		bw.write("The sum of all the values in the array list is: "+ s);
		bw.close();
	}
}
