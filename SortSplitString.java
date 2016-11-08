package com.myuniquesortedlist;

public class SortSplitString {
	public String[] sortString(String[] words)
	{
		String[] sortString = words;
		/*Logic to sort the string array alphabetically*/
		for(int j=0; j< sortString.length; j++) 
		 { for (int i=j+1 ; i<sortString.length; i++) 
		   { if(sortString[i].compareToIgnoreCase(sortString[j])<0) 
		     { 
			   String sort= sortString[j]; 
			   sortString[j]= sortString[i]; 
			   sortString[i]=sort; 
		     
		   } 		  
		  }
		 }
		
//              Code to print in same program    		
//		System.out.println("========= Sorted List ============");/*Print the sorted list*/
//		for(int i = 0; i< words.length; i++)
//		{
//			System.out.println(words[i]);
//	   }
		
		//sortString = words;
		return sortString;	
	}

}
