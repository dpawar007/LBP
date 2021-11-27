package lbp;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LBP125 {

	/*Implement a program to update an element in the given array*/
	/*
	input ---> size,array element and element to be updated (old ele & New ele)
	con   ---> size <100
	output---> return array after updating
	
	eg.
	5
	1 2 3 4 5
	3
	9
	
	output: 1 2 9 4 5
  */
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	   //int n  =obj.nextInt(),i;
		int n  =obj.nextInt();
	    int i;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(i  = 0 ; i<n ;i++) {
			ll.add(obj.nextInt());
		}
		System.out.println("List Arrays elements : "+ll);
		System.out.println("Enter Element old element");
		 int oe= obj.nextInt();
		 System.out.println("Enter Element New element");
		 int ne= obj.nextInt();
		 
		 //to remove an element 
		 ListIterator ltr =ll.listIterator();		 
		 while(ltr.hasNext()) {
			 if((Integer)ltr.next() == oe) {
				 ltr.set(ne);
			 }
		 }
			/* for(Object o:ll.toArray()) {				 
				 System.out.println((Integer)0+"");
			 }*/
		 System.out.println("New List");
			 while(ltr.hasNext()) {				  
				 System.out.print(ltr.next()+ " ");
		    }
		 }		
	}

