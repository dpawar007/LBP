package lbp;
import java.util.Scanner;
/*
   Java Program to find the maximum and minimum occurring character in a string
   Algorithm:

1. Start
2. Declare a string
3. Initialize it.
4. Declare an array to store the frequency of the elements.
5. Declare variables for minimum and maximum occurring characters and assign them to 0.
6. Convert the string to a character array.
7. Use two for loops for the same.
8. Use the first for loop to iterate through each character in the string.
9. Select the characters and initialize their corresponding frequency in the frequency array to 1.
10.Use the second for loop to compare the selected character with the rest of the characters present in the string.
11.Again use two for loops to iterate over the frequency array.
12.Use the min and max variable to store the count of minimum and maximum occurring characters in the string.
13.Iterate over the loop and compare the count of each character stored in freq with min and max.
14.If the count stored in freq is less than the value of min, then store that count in the min and corresponding character in minChar.
15.If the count stored in freq is more than the value of max, then store that count in max and corresponding character in maxChar.
16.Now, the minChar will store the minimum occurring character and maxChar will store the maximum occurring character.
17.Print the minimum and maximum occurring characters.
18.Stop

 */
public class LBP60_1 {
	  public static void main(String[] args) 
	   {  
	        //String str = "Example of minimum and maximum Character";
		   System.out.println("Enter the String");
		    Scanner obj = new Scanner(System.in);
		    String str = obj.nextLine();
	        System.out.println("The entered string is: "+str);
	        int[] freq = new int[str.length()];  
	        char minChar = str.charAt(0), maxChar = str.charAt(0);  
	        int i, j, min, max;          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	        //Count each word in given string and store in array freq  
	        for(i = 0; i < string.length; i++) 
	        {  
	            freq[i] = 1;  
	            for(j = i+1; j < string.length; j++) 
	            {  
	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
	                {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	        //Determine minimum and maximum occurring characters  
	        min = max = freq[0];  
	        for(i = 0; i <freq.length; i++) 
	        {  
	            if(min > freq[i] && freq[i] != '0') 
	            {  
	                min = freq[i];  
	                minChar = string[i];  
	            }  
	            
	            if(max < freq[i]) 
	            {  
	                max = freq[i];  
	                maxChar = string[i];  
	            }  
	        }  
	        //Print the minimum and maximum occurring characters  
	        System.out.println("Minimum occurring character: " + minChar);  
	        System.out.println("Maximum occurring character: " + maxChar);  
	    }  
}
