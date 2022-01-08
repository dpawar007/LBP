package lbp;
/*
first non-repeated character

Program to find first non-repeated character

input----> a non-empty string from the user
con -----> no
output --> non-repeated character

india ----> n
indian ---> d

Logic:
------
1. read a string s from the user.
2. set unique as true
3. compare each character with remaining all the character.
4. if match found set unique values as false and break;

 */
import java.util.Scanner;

public class LBP93 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s=obj.nextLine();
	        boolean flag;
	        for(int i=0 ;i<s.length();i++){
	            flag=true;
	            for(int j=0;j<s.length();j++){
	                if(i!=j && s.charAt(i)==s.charAt(j)){
	                  flag=false;
	                    break;
	                }
	            }
	            if(flag){
	                System.out.println(s.charAt(i));
	                break;
	            }
	        }
	    }
}
