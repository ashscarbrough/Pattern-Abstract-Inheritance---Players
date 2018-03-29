
/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/12/2016
 *  Assignment:	Programming Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The Player class is an abstract class that serves as a foundation
 *  			for subclasses (MinorLeaguer, Regular, and Pitcher classes).  It has:
 *  				- two static constant chars for Left and Right Hand indicators
 *  				- instance variables, Strings: names, addresses, phone numbers;
 *  					chars: batting hand and throwing hand; int: Years playing
 *  				- One constructor that initializes each of the instance variables
 *  					provided by another class.
 *  			It has two methods:
 *  				- a programmer defined toString() method, that outputs player
 *  					information in a readable format
 *  				- an update() method that increases the player's year playing
 *  				
 *  		Function: Player class serves as an abstract class inherited by the MinorLeaguer, 
 *  			Regular, and Pitcher subclasses.  It initializes all player variables and can
 *  			print each record in a readable format, & updates the player year via increment
 */

public abstract class Player {
	
	public final static char RHAND = 'R';
	public final static char LHAND = 'L';
	
	String name;
	String address;
	String phoneNumber;
	char bats;
	char throwingArm;
	int yearInOrganization;
	
	// Constructor initializes basic player information
	Player(String Name, String Address, String Phone, char Bats, char Throws, int Years){
		name = Name;
		address = Address;
		phoneNumber = Phone;
		bats = Bats;
		throwingArm = Throws;
		yearInOrganization = Years;
	}

	// Programmer defined toString method that outputs player record as string
	public String toString() {
		return(name + "\n\t" + address +"\n\t" + phoneNumber + "\n\tBats: " + bats + 
				"\tThrows: " + throwingArm + "\tYears Playing: " + yearInOrganization);
	}
	
	// Update method to increase player year in organization
	public void update() {
		yearInOrganization++;  //increment
	}
}