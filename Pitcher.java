
/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/12/2016
 *  Assignment:	Programming Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The Pitcher class inherits from the player class. It has:
 *  				- all inherited values of Player class, Strings: names, addresses, 
 *  				phone numbers; chars: batting hand and throwing hand; int: Years; 
 *  				and had an additional String role variable.
 *  				- One constructor that initializes each of the instance variables
 *  				inherited from Player class and the role variable.
 *  			It has two methods:
 *  				- a programmer defined toString() method, that outputs player
 *  					information in a readable format, extending the information
 *  					provided in Player toString() method.
 *  				- an update() method that increases the player's year playing via
 *  					inheritance, and a possible update to switch role to opposite
 * 						value.
 *  				
 *  		Function: Provide a record for a Pitcher in Baseball, that gives
 *  				Pitcher specific information including role.
 */

public class Pitcher extends Player{
	
	final public String STARTER = "Starter"; 
	final public String RELIEVER = "Reliever";
	
	String role; // Pitcher Role: Starter or Reliever
	
	// Constructor calls Player constructor and adds role information
	Pitcher(String Name, String Address, String Phone, char Bats, char Throws, 
			int Years, char Role){
		
		super(Name, Address, Phone, Bats, Throws, Years);
		
		if (Role == 's' || Role == 'S')
			role = STARTER;
		else
			role = RELIEVER;
	}
	
	// Programmer provided toString method that calls parent class toString method
	// and adds role information as output.
	public String toString(){
		String result = super.toString();
		result += "\n\tPitcher: " + role;
		return result;
	}
	
	// Method updates the Player's year and asks user if role has changed; 
	// if so, it switches to the opposite role.
	public void update () {
		super.update();
		System.out.print("\nHas " + name + "'s role changed? (Y or N) ");
		
		// Take user input from main's Scanner, to check for change 'y' or 'Y'
		char change = Team.input.next().charAt(0);
		
		// If change in role, alter to opposite role 
		if ((change == 'y') || (change == 'Y')){
			if (role == STARTER) // if starter, make reliever
				role = RELIEVER;
			else
				role = STARTER; // else if reliever, make starter
		}
		System.out.println();
	}

}
