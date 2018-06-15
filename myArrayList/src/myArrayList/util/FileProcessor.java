package myArrayList.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileProcessor {
	
	private File file;
	private BufferedReader br;
	
	private String InputFile = null;
	
	public FileProcessor(String InputFile) throws Exception {
		this.InputFile = InputFile;
		file = new File(InputFile);
		br = new BufferedReader(new FileReader(InputFile));
	}
	
	public String readLine() {
		try {
			return br.readLine();
		}
		catch (Exception e) {
			return "Error Occured";
		}
	}
}