/*
  Name: Jeremy Florence
  Course: CIS 203 - Computer Science II
  Assignment: 6
  Due: 3/14/14
*/

// This program reads a file of integers and places them into an array and
// sorts the array using bin sort.
import java.io.*;
import java.util.*;
public class BinSort {
    public static void main(String [] args) throws FileNotFoundException {
	String fileName = args[0];
	Scanner fileInput = new Scanner(new File(fileName));
	int maxDigit = fileInput.nextInt();
	int size = fileInput.nextInt();
	int [] values = readValues(fileInput, size);
	System.out.println("Unsorted: " + Arrays.toString(values));
	values = sort(values, maxDigit);
	System.out.println("Sorted: " + Arrays.toString(values));
    }
    
    // Parameter: fileInput - reads the file of integers.
    // Parameter: size - the number of integers.
    // Returns: an an array of the integers in the file.
    public static int [] readValues(Scanner fileInput, int size) {
	int [] values = new int [size];
	for (int i = 1; i < size; i++) {
	    values[i] = fileInput.nextInt();
	}
	return values;
    }
    
    // Parameter: values - the array of integers from the file.
    // Parameter: maxDigit - the highest number of digits
    // Returns: an array of sorted integers.
    public static int [] sort(int [] values, int maxDigit) {
	ArrayList<Integer> [] bin = getBin();
	int powTen = 10;
	for(int i = 0; i < maxDigit + 1; i++) {
	    for(int v : values) {
		int digit = (v % powTen) / (powTen / 10);
		bin[digit].add(v);
	    }
	    int index = 0;
	    for(int j = 0; j < bin.length; j++) {
		while(bin[j].size() > 0) {
		    values[index] = bin[j].get(0);
		    bin[j].remove(0);
		    index++;
		}
	    }
	    powTen *= 10;
	}
	return values;
    }
    
    // Returns: an empty array of Array Lists of integers.
    public static ArrayList<Integer> [] getBin() {
	ArrayList<Integer> [] bin = (ArrayList<Integer>[]) new ArrayList[10];
	for(int i = 0; i < bin.length; i++) {
	    bin[i] = new ArrayList<Integer>();
	}
	return bin;
    }
}