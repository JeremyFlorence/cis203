/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 9
    Due: 4/24/14
*/

// This is the MergeSort class which constructs a MergeSort object.
// The sort() method will perform a merge sort on an array of integers.
import java.util.*;

public class MergeSort implements Sorter {
    private Stack<Pair> pairs;		// Stores the parameters
    private int[] a;			// The array of integers to sort
    
    // Constructor
    // Parameter: numbers - the array of integers to sort.
    // Returns: a MergeSort object
    public MergeSort(int[] numbers) {
	pairs = new Stack<Pair>();
	this.a = numbers;
    }
    
    // Postcondition: The array is sorted.
    public void sort() {
	int n = a.length;
	int pos = 0;
	buildStack(pos,n);
	
	while(!pairs.isEmpty()) {
	    Pair temp1 = this.pairs.pop();
	    if(pairs.isEmpty()) {
		break;
	    }
	    Pair temp2 = this.pairs.peek();
	    n = temp2.n - temp1.n;
	    pos = temp1.first + temp1.n;
	    if (temp1.first == temp2.first) {
		buildStack(pos, n);
	    }
	    pos = temp2.first;
	    int n1 = temp1.first - temp2.first;
	    int n2 = temp1.n;
	    merge(pos, n1, n2);
	}
    }
    
    // Parameter: pos - the starting position to sort from.
    // Parameter: n - the amount of items to sort.
    private void buildStack(int pos,int n) {
	while(n != 0) {
	    this.pairs.push(new Pair(pos,n));
	    n /= 2;
	}
    }
    
    // Merge the sorted halves
    // Precondition: data has at least n1 + n2 components starting at
    //    a[first]. The first  n1 elements (from a[first] to 
    //    a[first + n1 - 1] are sorted from smallest 
    //    to largest, and the last n2 (from a[first + n1] to 
    //    a[first + n1 + n2 - 1]) are also sorted from smallest to largest. 
    // Postcondition: Starting at a[first], n1 + n2 elements of data
    //    have been rearranged to be sorted from smallest to largest.
    private  void merge(int first, int n1, int n2)  {

	Integer[] temp = new Integer[n1+n2];

	// Number copied to temp
	int copied = 0;
	// Number copied from the first half of a 
	int copied1 = 0;
	// Number copied from the second half of a
	int copied2 = 0; 

	// Merge elements, copying from two halves of a to the
	// temporary array.
	while ((copied1 < n1) && (copied2 < n2))      {
	    if (a[first + copied1] <a[first + n1 + copied2]) { 
		temp[copied] = a[first + copied1];
		copied++;
		copied1++;
	    }
	    else {
	      temp[copied] = a[first + n1 + copied2];
	      copied++;
	      copied2++;
	    }
	}

	// Copy any remaining entries in the left and right subarrays.
	while (copied1 < n1) {
	  temp[copied] = a[first + copied1];
	  copied++;
	  copied1++;
	}

	while (copied2 < n2) {
	  temp[copied] = a[first + n1 + copied2];
	  copied++;
	  copied2++;
	}

	// Copy from temp back to the real array.
	for (int i = 0; i < n1+n2; i++) {
	  a[first + i] = temp[i];
	}
    }
}