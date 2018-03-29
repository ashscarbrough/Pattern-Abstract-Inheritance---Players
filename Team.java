
/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/12/2016
 *  Assignment:	Programming Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The Team class houses the main method to test the Player class and 
 *  			it's derived classes (MinorLeaguer, Regular, Pitcher).  The Player
 *  			class and subclasses are housed as and array in a the container 
 *  			class Personnel.
 *  				- has a static Scanner object shared among classes to take user
 *  				input data
 *  				
 *  		Function: This program creates a new Personnel list containing Players
 *  			and subtypes.  It outputs each record to the screen, updates player
 *  			records for the next year, and prints the updated records to the 
 *  			screen again.
 */

import java.util.Scanner;

public class Team {
	
	// Static scanner will be used for other classes to take input
	static Scanner input = new Scanner (System.in); 
	
	public static void main (String [] args){
		
		// Creates a new Personnel List
		Personnel baseballPlayers = new Personnel ();
		
		// Print player records
		baseballPlayers.printRecord();
		
		// Update player records
		baseballPlayers.teamUpdate();
	
		// Print updated player records
		baseballPlayers.printRecord();
	}
}
