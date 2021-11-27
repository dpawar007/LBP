package lbp;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LBP126 {
 /*Same as LBP125 diffrence is need to check index value*/
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		    int n  =obj.nextInt(),i;
		/*	int n  =obj.nextInt();
      	    int i;*/
			LinkedList<Integer> ll = new LinkedList<Integer>();
			for(i  = 0 ; i<n ;i++) {
				ll.add(obj.nextInt());
			}
	 		System.out.println("List Arrays elements : "+ll);
			System.out.println("Enter Index of Element old element");
			 int loc= obj.nextInt();
			 System.out.println("Enter Element New element");
			 int ne= obj.nextInt();
			 
			 //to remove an element
			 ll.set(loc, ne);
			 ListIterator ltr =ll.listIterator();	
			 System.out.println("New List");
			  while(ltr.hasNext()) {					 
					 System.out.print(ltr.next()+ " ");
			    }
			 
	}

}
