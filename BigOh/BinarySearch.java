import java.io.*;
import java.util.*;

public class BinarySearch {

    public static int count = 0;
    
    public static void main (String [] args) throws Exception {


         int  n = Integer.parseInt(args[0]);
	 int[] a = new int[n];

	 // we need a sorted array
        for (int i =0; i < n; i++)
            a[i] = i;

	// now search for something not in the array
        int result = binarySearch(a, n+100);

         System.out.println("n = " + n);
         System.out.println("count = " + count);

    }


    public static int binarySearch(int[] a, int target) {
        return binarySearch(a, target, 0, a.length - 1);
    }


    // Recursive helper to implement search behavior.
    private static int binarySearch(int[] a, int target,
                                    int min, int max) {
         if (min > max) 
             return -1;         // target not found
     

         int mid = (min + max) / 2;
	 count++;

         if (a[mid] == target)
	     return mid;


         if (a[mid] < target)          // too small; go right
            return binarySearch(a, target, mid + 1, max);

         // too large, go left
         return binarySearch(a, target, min, mid - 1);
    }


}
