package lbp;

import java.util.Scanner;

/*
Student Rewarded

You are given a string representing an attendance record for a student. 
The record only contains the following three characters: 'A' : Absent. 'L' : Late. 'P' : Present. 
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

input ------> a string from the user
con --------> non empty string
output -----> Yes or No

PPP ----> Yes
PAP ----> Yes
PAA ----> No
APA ----> No
PPL ----> Yes
LPL ----> Yes
PLL ----> Yes
LLL ----> No
LPAPLPLL ---> Yes
LPAPLLL ----> No

 */
public class LBP100 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s=obj.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                c++;
        }
        if(c>1 || s.contains("LLL"))
            System.out.println("No");
        else
            System.out.println("Yes");
   }
}
