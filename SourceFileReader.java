package com.myuniquesortedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			SourceFileReader sourceFileReader= new SourceFileReader();
		    String fileContentString = sourceFileReader.readSourceFile();
		   // System.out.println(fileContentString);
		    
		    SplitSourceString sourceString = new SplitSourceString();
		    /*Call to split the file into string array*/
		    String[] resultSplitString = sourceString.splitString(fileContentString);
		    
		    SortSplitString sortString = new SortSplitString();
		    /*Call to get sorted words list*/
		    String[] resultSortString = sortString.sortString(resultSplitString);
		    
            FindUniqueWord uniqueWord=new FindUniqueWord();
            /*Call to get unique words list*/
            String[] resultUniqueString=uniqueWord.getUniqueList(resultSortString);
            
            PrintOutputFile printFile=new PrintOutputFile();
            /*Call to print unique words in text file*/
            try {
				printFile.writeOutput("uniqueoutput.txt",resultUniqueString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		

	}
	
	public String readSourceFile(){
		
		BufferedReader br = null;
		String fileContentString = "";

		try {
			
			/*Read file from source*/
			FileReader myFile = new FileReader("pftest.txt");
			br = new BufferedReader(myFile);
			StringBuffer sb = new StringBuffer();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    fileContentString = sb.toString();
		   // System.out.println(fileContentString);
		     
		    
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileContentString;

	}
}
