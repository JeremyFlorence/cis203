/*
    Name: Jeremy Florence
    Course: CIS 203 - Computer Science II
    Assignment: 7
    Due: 3/21/14
*/

import java.util.*;
import java.io.*;

// This program constructs an Anagram object which contains a map of all
// anagrammatic words as field. It also contatins a method find which
// returns the list of all of a words anagrams.
public class Anagram {
    // Fields
    HashMap<String, ArrayList<String>> anagrams; // maps all anagrams to a 
						  // sorted string
    
    // Parameter: fileName - the name of the file to scan
    // Returns: an anagram object.
    public Anagram(String fileName) {
	try {
	    File f = new File(fileName);
	    Scanner fileScan = new Scanner(f);
	    anagrams = new HashMap<String, ArrayList<String>>();
	    
	    while(fileScan.hasNext()) {
		String word = fileScan.next();
		char [] letters = toArray(word);
		Arrays.sort(letters);
		String s = "";
		for(int i = 0; i < letters.length; i++) {
		    s += letters[i];
		}
		
		if (this.anagrams.containsKey(s)) {
		    this.anagrams.get(s).add(word);
		} else {
		    ArrayList<String> list = new ArrayList<String>();
		    this.anagrams.put(s, list);
		    this.anagrams.get(s).add(word);
		}
	    }
	} catch (FileNotFoundException e) {
	    System.out.println(e);
	    System.exit(0);
	}
    }
    
    // Parameter: word - the word entered at the console to find anagrams of.
    // Returns: the list of anagrams to a word.
    public ArrayList<String> find(String word) {
	char [] letters = toArray(word);
	Arrays.sort(letters);
	String s = "";
	for(int i = 0; i < letters.length; i++) {
	    s += letters[i];
	}
	return anagrams.get(s);
	
    }
    
    // Parameter: word - the word entered at the console.
    // Returns: an array of characters in the word.
    private char[] toArray(String word) {
	char [] letters = new char[word.length()];
	for(int i = 0; i < word.length(); i++) {
	    letters [i] = word.charAt(i);
	}
	return letters;
    }
}