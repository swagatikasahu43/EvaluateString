package com.myuniquesortedlist;

//add another comment ****************

public class SplitSourceString {
	public String[] splitString(String sourceString)
	{
		sourceString = sourceString.replaceAll("[^A-Za-z0-9 ]" , "");
		/*Split the file into string array*/
		String[] words = sourceString.split(" ");
		
//		System.out.println("========  Split List ============="); 
//		for(int i = 0; i< words.length; i++)/* Loop to print the split string array
//		{
//			System.out.println(words[i]);
//	   }
		return words;
	}
 
}
