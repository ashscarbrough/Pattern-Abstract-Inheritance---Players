
/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/12/2016
 *  Assignment:	Programming Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The Regular class inherits from the player class. It has:
 *  				- all inherited values of Player class, Strings: names, addresses, 
 *  				phone numbers; chars: batting hand and throwing hand; int: Years; 
 *  				and had an additional String "fieldingPosition" variable.
 *  				- One constructor that initializes each of the instance variables
 *  				inherited from Player class and the single fieldingPosition variable.
 *  			It has two methods:
 *  				- a programmer defined toString() method, that outputs player
 *  					information in a readable format, extending the information
 *  					provided in Player toString() method.
 *  				- an update() method that increases the player's year playing via
 *  					inheritance, and a possible update to field position.
 *  				
 *  		Function: Provide a record for a Regular Baseball Player, that gives
 *  				Regular Player information including position information.
 */

public class Regular extends Player{
	
	String fieldingPosition;
	
	// Constructor calls Player constructor and adds fieldingPosition
	Regular (String Name, String Address, String Phone, char Bats, char Throws, int Years,
				String position){
		
		super (Name, Address, Phone, Bats, Throws, Years);
		fieldingPosition = position;
	}

	// Programmer provided toString method that calls parent class toString method
	// and adds position information as output.
	public String toString(){
		String result = super.toString();
		result += "\n\tField position: " + fieldingPosition;
		return result;
	}
	
	// Method updates the Player's year and asks user if position has changed; 
	// if so, it asks for the new position, taking it as input.
	public void update () {
		super.update();
		System.out.print("\nHas " + name + "'s position changed? (Y or N) ");
		
		// Take user input from main's Scanner, to check for change 'y' or 'Y'
		char change = Team.input.next().charAt(0);
		
		// If position changed, take user input for new position
		if ((change == 'y') || (change == 'Y')){
			System.out.print("\nEnter player's new position: ");
			Team.input.nextLine(); // Clear Buffer
			fieldingPosition = Team.input.nextLine();
		}
		System.out.println();
	}
}
