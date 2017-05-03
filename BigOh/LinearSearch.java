import java.io.*;
import java.util.*;

public class LinearSearch {

    public static int count = 0;
    
    public static void main (String [] args) throws Exception {

         int  n = Integer.parseInt(args[0]);
	 int[] a = new int[n];

         // fill with random values between 0 and 100
         Random rand = new Random();
	 for (int i = 0; i < a.length; i++)
	     a[i] = rand.nextInt(100);

         // search for something not in array a
         int result = linearSearch(a, 861);

         System.out.println("n = " + n);
         System.out.println("count = " + count);
    }



    public static int linearSearch(int[] a, int target) {
        return linearSearch(a, target, 0);
    }


    // Recursive helper to implement search behavior.
    private static int linearSearch(int[] a, int target,
                                    int pos) {
        if (pos >= a.length)
             return -1;         // target not found
     
 	count++;
         if (a[pos] == target)
	     return pos;


         // search the next position
         return linearSearch(a, target, pos+1);
    }



}
