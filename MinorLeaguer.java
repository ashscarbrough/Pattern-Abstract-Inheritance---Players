
/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/12/2016
 *  Assignment:	Programming Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The MinorLeaguer class inherits from the player class. It has:
 *  				- all inherited values of Player class, Strings: names, addresses, 
 *  				phone numbers; chars: batting hand and throwing hand; int: Years; 
 *  				and had an additional String "affliateName" variable.
 *  				- One constructor that initializes each of the instance variables
 *  				inherited from Player class and the single affliateName variable.
 *  			It has two methods:
 *  				- a programmer defined toString() method, that outputs player
 *  					information in a readable format, extending the information
 *  					provided in Player toString() method.
 *  				- an update() method that increases the player's year playing via
 *  					inheritance, and a possible update to affiliate.
 *  				
 *  		Function: Provide a record for a Minor League Baseball Player, that gives
 *  				Minor Leaguer information including affiliate name.
 */

public class MinorLeaguer extends Player{
	
	String affiliateName;  // Minor League specific value for affiliate 
	
	// Constructor calls Player constructor and adds affiliate name
	MinorLeaguer (String Name, String Address, String Phone, char Bats, char Throws, 
			int Years, String affiliate){
		
		super (Name, Address, Phone, Bats, Throws, Years);
		affiliateName = affiliate;
	}
	
	// Programmer provided toString method that calls parent class toString method
	// and adds affiliate information as output.
	public String toString(){
		String result = super.toString();
		result += "\n\tMinor League, Affiliate: " + affiliateName;
		return result;
	}
	
	// Method updates the Player's year and asks user if affiliate has changed; 
	// if so, it asks for the new affliate's name., taking it as input.
	public void update () {
		super.update();
		System.out.print("\nHas " + name + "'s affilate changed? (Y or N) ");
		
		// Take user input from main's Scanner, to check for change 'y' or 'Y'
		char change = Team.input.next().charAt(0);
		
		// If affiliate changed, take user input for new affiliate name
		if ((change == 'y') || (change == 'Y')){
			System.out.print("\nEnter affiliate's name: ");
			Team.input.nextLine();  // Clear Buffer
			affiliateName = Team.input.nextLine();
		}
		System.out.println();
	}
}
