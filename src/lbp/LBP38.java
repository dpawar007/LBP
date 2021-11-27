package lbp;

import java.util.Scanner;

/*
LBP38

A company launched a new text editor that allows users to enter english letters, numbers and white spaces only. If a user attempts to enter any other type of characters, it is counted as miss.
Given a String text, write an algorithm to help the developer detect the number of misses by a given user in the given input.

input --------> String
constraint ---> non-empty string
output -------> number of misses

Logic:
------
1. read a str from the user.
2. fect char by char.
3. if char is alphabet,digit and white space continue
4. else counter++
5. print counter.

 */
public class LBP38 {

	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         String s = obj.nextLine();
         int counter = 0;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)>=65 && s.charAt(i)<=90) 
                  continue;
              else if(s.charAt(i)>=97 && s.charAt(i)<=122) 
                  continue;
              else if(s.charAt(i)>=48 && s.charAt(i)<=57) 
                  continue;
              else if (s.charAt(i)==32)
                  continue;
              else 
                  counter++;             
              
          }
        System.out.println(counter);
    }
}
