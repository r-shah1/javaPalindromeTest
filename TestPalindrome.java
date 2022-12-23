//TestPalindrome.java
//Program that returns true if a given array is a palindrome using recursion
//By Ruhul Shah

import java.util.ArrayList;
import java.util.Scanner;

public class TestPalindrome {
	 public static void main(String args[]) {
	     Scanner scanInput = new Scanner(System.in);
	     System.out.println("Enter any word or sentence: ");
	     String strUserInput = scanInput.nextLine();
	     
		 //convert user input into arraylist
		 ArrayList<String> arrlstUserInput = new ArrayList<String>();
		 arrlstUserInput.add(strUserInput);
		 
		 //call method isPalindrome on arraylist and print
		 if (isPalindrome(arrlstToString(arrlstUserInput)))
			 System.out.println("'" + strUserInput + "'" + " IS a palindrome!");
		 else
			 System.out.println("'" + strUserInput + "'" + " is NOT a palindrome.");
	 }//end main method
	 
	//method to convert arraylist to string, remove all commas/spaces and change to lower case
	 public static String arrlstToString (ArrayList<String> p) {
		 String strArrList = String.join("", p)
									.replaceAll("\\s", "")
									.toLowerCase();
		 System.out.println("ORIGINAL ARRAY LIST: " + p);
		 System.out.println("CONVERTED STRING: " + strArrList);
		 System.out.println("");
		 return strArrList;
	 }//end method convertArrayList
	 
	 //method that uses recursion to check if given string is a palindrome
	 public static boolean isPalindrome (String str) { 
	     //Base case: If string has 0 or 1 character return true to stop
		 if(str.length() == 0 || str.length() == 1)
	       return true; 
	        
	     //If string has multiple characters
	     //Check whether first and last characters are same or not
		 if(str.charAt(0) == str.charAt(str.length()-1))
	       return isPalindrome(str.substring(1, str.length()-1)); //recursive call
	    
	     //else return false
		 return false;
	 }//end method isPalindrome	 	 
}
