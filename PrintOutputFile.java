package com.myuniquesortedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintOutputFile {

	public void writeOutput (String filename, String []stringToWrite) throws IOException{
		  BufferedWriter outputFile = null;
		  outputFile = new BufferedWriter(new FileWriter(filename));
		  for (int i = 0; i < stringToWrite.length&&stringToWrite[i]!=null; i++) {
		  
		    outputFile.write(stringToWrite[i]+"");
		    outputFile.newLine();
		  }
		  outputFile.flush();  
		  outputFile.close();  
		}
}
