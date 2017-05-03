/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 2
    Due: 2/7/14
*/

// This is the class for the Bird object which implements the Critter
// interface.
import java.util.*;

public class Bird implements Critter {
    
    // Returns: the char 'B'
    public char getChar() {
	return 'B';
    }
    
    // Paramater: info - an object that gives access to information
    //			about the critter.
    // Returns: an integer representing the direction of the move.
    public int getMove(CritterInfo info) {
	Random rand = new Random();
	int [] directions = {SOUTH, NORTH, WEST, EAST};
	return directions [rand.nextInt(4)];
    }
}