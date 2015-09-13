package sortingalgorithms;

import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 * Program Filename: 	SortingAlgorithims.java
 * Author: 				Abel, Austin
 * Date: 				September, 2015
 * Description: 		
 *  					
 * Input: 				
 * Output: 				
 * TODO: Add Comments
 * ***W.I.P****
******************************************************************************/

public class SortingAlgorithms {

	public static int[] ArrayOne = new int[20];
	
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
		
		System.out.println("Sorry, Selection Sort could not be found.");
		
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
