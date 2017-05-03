import java.util.*;

public class TestSort {
    public static void main(String [] args) {
	int [] numbers = {12, 7, 13, 19, 2, 8, 17, 22, 4 ,15};
	System.out.println("The unsorted array: ");
	System.out.println(numbers);
	
	System.out.println("Sorting using merge sort...");
        Sorter sorter = new MergeSort(numbers);
        sorter.sort();
        System.out.println("The sorted array: ");
        System.out.println(Arrays.toString(numbers));
    }
}