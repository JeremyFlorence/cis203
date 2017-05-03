import java.util.*;

public class BubbleSort implements Sorter {

    // field
    private int [] a;
    private int comparisons;
    private int moves;

    public BubbleSort (int [] a) {
	this.a = a;
    }


     // Rearranges the elements of a into sorted order using
     // the selection sort algorithm.
    public  void sort() {
        // i keeps track of last two positions we are bubbling out to
        for (int i = a.length -2 ; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
		this.comparisons++;
		if ( a [j] > a[j+1] ){
		    swap (j, j+1);
		}
	    }
            System.out.println(Arrays.toString(a));
	}
	System.out.println(this.comparisons);
	System.out.println(this.moves);
    }
    
    // Swaps a[i] with a[j].
    public  void swap(int i, int j) {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
	   this.moves += 3;
    }
}
