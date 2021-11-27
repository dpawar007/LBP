package lbp;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class LBP127 {

	/*Reverse Array Element*/
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	    int n  =obj.nextInt(),i;	 
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(i  = 0 ; i<n ;i++) {
			ll.add(obj.nextInt());
		}
 		System.out.println("List Arrays elements : "+ll);
		ListIterator ltr =ll.listIterator();
		
		while(ltr.hasNext()) {
			ltr.next();
		}		
		 
	    while(ltr.hasPrevious()) {	    		
				 System.out.print(ltr.previous()+ " ");    		  
		    }
	    
		 
}

}
