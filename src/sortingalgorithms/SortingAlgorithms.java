package sortingalgorithms;

import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 * Program Filename: 	SortingAlgorithims.java
 * Author: 				Abel, Austin
 * Date: 				September, 2015
 * Description: TEST		
 *  					
 * Input: 				
 * Output: 				
 * TODO: Add Comments
 * ***W.I.P****
******************************************************************************/

public class SortingAlgorithms {

	public static int[] ArrayOne = new int[3];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rndm = new Random();
		
		for (int i = 0; i < ArrayOne.length; i++) {
				
			ArrayOne[i] = rndm.nextInt(100) + 1;
		}
		
		/* TODO Comment */
		System.out.println("1. Bubble Sort \n2. Selection Sort "
				+ "\n3. Insertion Sort \nEnter your selection:");
			int InOne = sc.nextInt();
			
		if (InOne == 1) {
			
			BubbleSort();
			
		} else if (InOne == 2) {
			
			SelectionSort();
			
		} else if (InOne == 3) {
			
			InsertionSort();
			
		}
		
		
		
	}

/******************************************************************************
 * Method: 		BubbleSort 					
 * Description: 		
 *  			
 * Parameters:		
 * Pre-Conditions: 				
 * Post-Conditions: 				
******************************************************************************/
	public static void BubbleSort (){
		boolean Check = true;
		int Temp;
		boolean Organized;
		
		for (int i = 0; i < ArrayOne.length; i++) {
			
			System.out.print(" " + ArrayOne[i]);
			
		}
		
		System.out.println("\n --------------------------------------"
				+ "------------------");
		
		do {
			
			Organized = true;
			
			for (int i = 0; i < ArrayOne.length - 1; i++) {
				
				if (ArrayOne[i] > ArrayOne[i + 1]) {
					
					Temp = ArrayOne[i];
					ArrayOne[i] = ArrayOne[i + 1];
					ArrayOne[i + 1] = Temp;
					
					Organized = false;
					
				}
			}
				
				if (Organized == true) {
					
					Check = false;
					
					
				}		
			
		} while (Check  == true);
		
		for (int i = 0; i < ArrayOne.length; i++) {
			
			System.out.print(" " + ArrayOne[i]);
			
		}
		
	}
/******************************************************************************
 * Method: 		SelectionSort 					
 * Description: 		
 *  			
 * Parameters:		
 * Pre-Conditions: 				
 * Post-Conditions: 				
******************************************************************************/	
	public static void SelectionSort () {
		int Temp = 0;
		
		for (int i = 0; i < ArrayOne.length; i++) {
			
			System.out.print(" " + ArrayOne[i]);
			
		}
		
		System.out.println("");
		
		/* a[0] to a[n-1] is the array to sort */
		int i;
		int j;
		int iMin;

		/* advance the position through the entire array */
		/*   (could do j < n-1 because single element is also min element) */
		for (j = 0; j < ArrayOne.length-1; j++) {
		    /* find the min element in the unsorted a[j .. n-1] */

		    /* assume the min is the first element */
		    iMin = j;
		    /* test against elements after j to find the smallest */
		    for (i = j + 1; i < ArrayOne.length; i++) {
		        /* if this element is less, then it is the new minimum */
		        if (ArrayOne[i] < ArrayOne[iMin]) {
		            /* found new minimum; remember its index */
		            iMin = i;
		        }
		    }

		    if(iMin != j) {
		        ArrayOne[iMin] = Temp;
		        
		        ArrayOne[iMin] = ArrayOne[j];
		        
		        ArrayOne[j] = Temp;
		    }

		}
		
		for (int i1 = 0; i1 < ArrayOne.length; i1++) {
			
			System.out.print(" " + ArrayOne[i1]);
			
		}
		
	}
	
/******************************************************************************
 * Method: 		InsertionSort 					
 * Description: 		
 *  			
 * Parameters:		
 * Pre-Conditions: 				
 * Post-Conditions: 				
******************************************************************************/
	public static void InsertionSort () {
		
		System.out.println("Sorry, Insertion Sort could not be found.");
		int v = 1;
		
		if (v < 2) {
			System.out.println("Christ.");
		}
		
	}
	
/******************************************************************************
 * Method: 		TryAgain 					
 * Description: 		
 *  			
 * Parameters:		
 * Pre-Conditions: 				
 * Post-Conditions: 				
******************************************************************************/
	public static void TryAgain () {
		
		
		
	}
	
}
