/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 2
    Due: 2/7/14
*/

// This is the class for the Wolf object which implements the Critter
// interface.

import java.util.*;

public class Wolf implements Critter {
    // Fields
    int moveCount; //Counts the number of moves.
    
    // Constructor
    public Wolf() {
	moveCount = 0;
    }
    
    // Returns: the char 'W'
    public char getChar() {
	return 'W';
    }
    
    // Paramater: info - an object that gives access to information
    //			about the critter.
    // Returns: an integer representing the direction of the move.
    public int getMove(CritterInfo info) {
	Random rand = new Random();
	int [] directions = {NORTH, EAST, SOUTH, WEST};
	char [] neighbors = {info.getNeighbor(SOUTH), info.getNeighbor(WEST),
			      info.getNeighbor(NORTH), info.getNeighbor(EAST)};
	
	
	// Traverses the directions array
	for (int i = 0; i < directions.length; i++) {
	    
	    // If there is a neighbor, return the opposite direction.
	    if (neighbors [i] != '.') {
		return directions[i];
	    }
	}
	
	// Moves randomly for 10 moves, stays in place for 10 and repeats.
	if (moveCount < 10  || moveCount >= 20) {
	    moveCount++;
	    return directions[rand.nextInt(4)];
	}
	
	moveCount++;
	moveCount %= 20;
	return CENTER;
    }

}

