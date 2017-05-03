/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 9
    Due: 4/24/14
*/

// This is the QuickSort class. It constructs a QuickSort object and contains
// a sort() method which will perform a Quick Sort on an array of integers.
import java.util.*;

public class QuickSort implements Sorter {
    private Stack<Pair> pairs;		// The stack of parameters
    private int[] a;			// The array of integers to sort
    
    // Constructor
    // Parameter: numbers - the array of integers to sort
    // Returns: a QuickSort object
    public QuickSort(int [] numbers) {
	this.a = numbers;
	this.pairs = new Stack<Pair>();
    }
    
    // Postcondition: the array is sorted
    public void sort() {
	int n = this.a.length;
	int mid;
	pairs.push(new Pair(0,n));
	while(!pairs.isEmpty()) {
	    Pair temp = pairs.pop();
	    mid = partition(temp.first, temp.n);
	    if (mid - temp.first > 1) {
		pairs.push(new Pair(temp.first, mid - temp.first));
	    }
	    if (n - mid > 1) {
		pairs.push(new Pair(mid + 1, (n - mid) - 1));
	    }
	}
    }
    
    // Parameters: first - first position  in the position (also the pivot)
    //             n - number of values to partition
    // Postcondition: a[first]-a[pivotIndex-1] <= a[pivotIndex] 
    //                a[pivotIndex] < a[pivotIndex+1]-a[first + n]
    private  int partition(int first, int n)  {
	int pivotIndex = first;
	int last = first + n - 1;
	int pivotValue = a[first++];
	while (first <= last) {
	    while (first <= last && a[first] <= pivotValue)
		first++;
	    while (last >= first && a[last] > pivotValue)
		last--;
	    if (first < last) 
		swap(first, last);
	}
	swap(pivotIndex, last);
	return last;
    }

    public  void swap(int i, int j) {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
    }
}