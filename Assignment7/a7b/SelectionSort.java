/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 7b
    Due: 4/4/14
*/

// This is the SelectionSort class which contains a sort() method which will
// sort an array of integers using selection sort.
import java.util.*;

public class SelectionSort implements Sorter {

    // field
    private int [] a;

    // constructor
    public SelectionSort (int [] a) {
	this.a = a;
    }

    // Postcondition: array a is sorted
    public void sort() {
	selectionSort(0);
    }
    
    // Parameter: pos - the position to select for
    // Postcondition: array a is sorted (using selection sort)
    private void selectionSort(int pos) {
	if(pos == this.a.length-1) {
	    return;
	} else {
	    swap(pos, findMinPosition(pos, pos+1));
	    selectionSort(pos+1);
	}
    }
    
    // Parameters: thisPosition - the position in the array we are 
    //				selecting for
    //		   nextPosition - the position after thisPosition
    // Returns: the position in the array (between thisPosition and a.length-1)
    //          where the smallest value is held
    private int findMinPosition(int thisPosition, int nextPosition) {
	if(nextPosition == this.a.length) {
	    return thisPosition;
	} else if(this.a[nextPosition] < this.a[thisPosition]) {
	    return findMinPosition(nextPosition, nextPosition+1);
	} else {
	    return findMinPosition(thisPosition, nextPosition+1);
	}
    }

    // Parameters: i, j - two positions in array a
    // Postcondition: the values at  a[i] with a[j] have been swapped
    public  void swap(int i, int j) {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
    }
}
