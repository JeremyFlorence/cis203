/*
    Name: Jeremy Florence
    Course: cIS 203 - Computer Science II
    Assignment: 7b
    Due: 4/4/14
*/

// This is the class for Insertion Sort. It contains a method sort which will
// sort an array using insertion sort.
import java.util.*;

public class InsertionSort implements Sorter {

    // field
    private int [] a;

    public InsertionSort (int [] a) {
	this.a = a;
    }


    // Postcondition: array a is sorted
    public void sort() {
	insertionSort(0);
    }
    
    // Postcondition: array a is sorted (using insertion sort)
    private void insertionSort(int pos) {
	if(pos == this.a.length) {
	    return;
	} else {
	    int temp = this.a[pos];
	    this.a[findPosition(temp, pos)] = temp;
	    insertionSort(pos+1);
	}
    }
    
    // Paremeters: value - to insert
    //		   currentPosition - the current position of the 'value' in
    //		   			the array.
    // Returns: position to insert 'value' in the array
    // Postcondition: everything from a[currentPosition] to a[return value]
    //			shifted one position to the right in array a.
    private int findPosition(int value, int currentPosition) {
	if(currentPosition == 0) {
	    return currentPosition;
	} else if(this.a[currentPosition -1] <= value) {
	    return currentPosition;
	} else {
	    int temp = this.a[currentPosition];
	    this.a[currentPosition] = this.a[currentPosition-1];
	    this.a[currentPosition-1] = temp;
	    return findPosition(value, currentPosition-1);
	}
    }
}
