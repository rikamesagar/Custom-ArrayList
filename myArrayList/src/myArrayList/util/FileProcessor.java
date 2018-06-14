package myArrayList.util;
import java.io.*;


public class FileProcessor {
	
	public File file;
	public BufferedReader br;
	
	public String InputFile = null;
	public String OutputFile = null;
	
	public FileProcessor() throws Exception {
//		file = new File("C:\\Users\\rikam\\Google Drive\\Summer 2018\\Design Patterns\\projects\\csx42-s18-assign-1--srikame1\\myArrayList\\src\\myArrayList\\util\\input.txt");
		file = new File(InputFile);
		br = new BufferedReader(new FileReader(file));
	}
	
	public String readLine() {
		try {
			return br.readLine();
		}
		catch (Exception e) {
			return "Error Occured";
		}
	}
	
	public void closeInputFile() {
	
	}
}
