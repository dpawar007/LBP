package lbp;

import java.util.Scanner;

public class LBP92 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        char s1= obj.next().charAt(0);   
        int j=1;         
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s1){
            System.out.print(j++);              
            }else{
              System.out.print(s.charAt(i));
            }
       }
         
    }
}
