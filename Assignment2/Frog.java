/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 2
    Due: 2/7/14
*/

// This is the class for the Frog object which implements the Critter
// interface.

import java.util.*;

public class Frog implements Critter {
    //Fields
    int moveCount; // Counts the number of moves.
    int direction; // Stores the direction.
    
    //Constructor
    public Frog() {
	this.moveCount = 0;
	this.direction = 0;
    }
  
    // Returns: the char 'F'
    public char getChar() {
	return 'F';
    }
    
    // Paramater: info - an object that gives access to information
    //			about the critter.
    // Returns: an integer representing the direction of the move.
    public int getMove(CritterInfo info) {
	Random rand = new Random();
	int [] directions = {SOUTH, NORTH, WEST, EAST};
	
	// A random direction is chosen every 3 turns.
	if (this.moveCount > 0) {
	    this.moveCount--;
	} else {
	    this.direction = rand.nextInt(4);
	    this.moveCount = 2;
	}
	return directions [this.direction];
    }
}