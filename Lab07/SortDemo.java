import java.util.*;

public class SortDemo {

    public static void main (String [] args) {
        int n = Integer.parseInt(args[0]);
        int [] a = new int[n];

	for (int i = 0; i <n ; i++) {
            a[i] = (int) (Math.random() * n);
	}

        System.out.println(Arrays.toString(a));
        System.out.println("Sort using Bubble Sort");
        Sorter sorter = new BubbleSort(a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
    }

}
