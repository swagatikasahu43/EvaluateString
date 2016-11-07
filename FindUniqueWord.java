package com.myuniquesortedlist;

public class FindUniqueWord {
	
	public String[] getUniqueList(String[] sortString){
		
		
		String[] uniqueWords= new String[sortString.length];
		uniqueWords[0]=sortString[0];
		String tempWord="";
		int index=1;
		/*Logic to find Unique words in a string array*/
		for(int i=0;i<sortString.length;i++)
		{
			if(i!=sortString.length-1){
			tempWord=sortString[i+1];
			if(!sortString[i].equalsIgnoreCase(tempWord)){
				uniqueWords[index]=tempWord;
				index++;
			}
			}else if(!uniqueWords[index-1].equalsIgnoreCase(sortString[i])){
				uniqueWords[i]=sortString[i];
			}
		}
		
//		/*Print the Unique word list*/
		System.out.println("========  Unique List =============");
		for(int i = 0; i< uniqueWords.length&& i<index; i++)
		{
			System.out.println(uniqueWords[i]);
	   }
		
		return uniqueWords;
	}
	

}
