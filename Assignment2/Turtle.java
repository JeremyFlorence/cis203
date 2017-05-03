/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 2
    Due: 2/7/14
*/

// This is the class for the Turtle object which implements the Critter
// interface.

public class Turtle implements Critter {
    
    // Fields
    int moveCount; // Counts the number of moves.
    int direction; // Stores the direction.
    
    // Constructor
    public Turtle () {
	moveCount = 1;
	direction = 0;
    }
    // Returns: the char 'T'
    public char getChar() {
	return 'T';
    }
    
    // Paramater: info - an object that gives access to information
    //			about the critter.
    // Returns: an integer representing the direction of the move.
    public int getMove(CritterInfo info) {
	int [] directions = {SOUTH, WEST, NORTH, EAST};
	
	// Changes the direction every 5 moves so that
	// the turtle moves in a clockwisebox.
	this.direction = (this.moveCount-1) / 5;
	this.moveCount++;
	if(this.moveCount > 20) {
	    this.moveCount = 1;
	}
	return directions [this.direction];
    }
}