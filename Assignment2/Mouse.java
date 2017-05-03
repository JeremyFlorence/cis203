/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 2
    Due: 2/7/14
*/

// This is the class for the Mouse object which implements the Critter
// interface.
public class Mouse implements Critter {
    //Fields
    int moveCount; // Counts the number of moves.
    
    public Mouse() {
	this.moveCount = 0;
    }
    
    // Returns: the char 'M'
    public char getChar() {
	return 'M';
    }
    
    // Paramater: info - an object that gives access to information
    //			about the critter.
    // Returns: an integer representing the direction of the move.
    public int getMove(CritterInfo info) {
	
	//Alternates moving west or north.
	if (this.moveCount == 0) {
	    this.moveCount = 1;
	    return WEST;
	}
	if (this.moveCount == 1) {
	    this.moveCount = 0;
	    return NORTH;
	}
	return 0;
	
    }
}