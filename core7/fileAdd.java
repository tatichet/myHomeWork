package core7;

import java.io.*;

public class fileAdd {

	public static void main(String[] args) {
	
		fileOperatoions("/src/core7/txt.txt", "/src/core7/txt_new.txt");
	}
	public static void fileOperatoions(String inputPath, String outputPath) {
		File file = new File(inputPath);
		try {
			FileReader fileReader = new FileReader(file);
			int data = fileReader.read();
			FileWriter fileWriter = new FileWriter(outputPath);
			
			while (data !=-1) {
				fileWriter.write(data);;
				System.out.print((char)data);
				data = fileReader.read();
			}
			fileWriter.close();
			fileReader.close();	
	  }catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}
}
  public static void fileLinesOpetations() { 
	  
	  public static void inputStreamOperations() {
  }
  }

