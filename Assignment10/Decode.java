/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 10
    Due: 5/7/14
*/

// This program takes a file named coded.txt which has a message in morse code
// and decodes it.
import java.util.*;
import java.io.*;

public class Decode {
    public static void main(String [] args) throws FileNotFoundException {
	Scanner fileScan = new Scanner(new File("coded.txt"));
	ArrayList<String> codes = getCodes(fileScan);
	PrintStream output = new PrintStream(new File("decoded.txt"));
	decode(codes, output);
    }
    
    // Parameter: fileScan - the scanner that reads the file.
    // Returns: an ArrayList of strings which represent the codes.
    public static ArrayList<String> getCodes(Scanner fileScan) {
	ArrayList<String> temp = new ArrayList<String>();
	while(fileScan.hasNextLine()) {
	    String line = fileScan.nextLine() + "|";
	    int pos = 0;
	    for(int i = 0; i < line.length(); i++) {
		char ch = line.charAt(i);
		if(ch == '|') {
		    temp.add(line.substring(pos,i));
		    pos = i + 1;
		    continue;
		}
		if(ch == ' ') {
		    temp.add(line.substring(pos,i));
		    temp.add("" + ch);
		    pos = i + 1;
		}
	    }
	    if (fileScan.hasNextLine()) {
		temp.add("" + '\n');
	    }
	}
	return temp;
    }
    
    // Parameter: codes - the list of strings that represent morse code
    // Parameter: output - prints the translated code to decoded.txt
    // Postcondition: the translated code is printed to decoded.txt
    public static void decode(ArrayList<String> codes, PrintStream output) {
      for(int i = 0; i < codes.size(); i++) {
	    String s = codes.get(i);
	    if(s.startsWith(".") || s.startsWith("-")) {
		output.print(MorseCode.getLetter(s));
	    } else {
		output.print(s);
	    }
	}
    }
    
}