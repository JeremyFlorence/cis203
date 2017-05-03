import java.util.*;
import java.io.*;

public class Client {
    public static PrintStream ps = System.out;

    public static void main (String [] args) {
	// test the LinkedList interface to make sure it is working correctly
        testAddSizeGet();
        testIndexOf();
        testRemove();
	testSortND();
	testReverse();
	testReverseIP();
    }

    public static void testAddSizeGet() {
	LinkedList<Integer> l = new LinkedList<Integer>();
        ps.println("Testing add(), size()..");    
        ps.println("l = " + l);
        ps.println("l.size() = " + l.size());

        for (int i = 0; i < 5; i++)
            l.add(i);
        ps.println("l = " + l);
        ps.println("l.size() = " + l.size());
        ps.println();

        ps.println("Testing get()..");    
        ps.println("l.get(2) = " + l.get(2));
        ps.println("l.get(0) = " + l.get(0));
        ps.println("l.get(l.size()-1) = " + l.get(l.size()-1));
        ps.println();

        ps.println("Testing add(i, elt),");    
        l.add(2,999);
        ps.println("l.add(2) = " + l);
        l.add(0,999);
        ps.println("l.add(0,999) = " + l);
        l.add(l.size()-1,8888);
        ps.println("l.add(l.size()-1,8888) = " + l);
        l.add(l.size(), 999);
        ps.println("l.add(size(),999) = " + l);
        ps.println();
    }

    public static void testIndexOf() {
        ps.println("Testing indexOf()...");
        LinkedList<String> l = new LinkedList<String>();
        l.add("dog"); l.add("cat"); l.add("mouse");
        ps.println("l = " + l);
        ps.println("l.indexOf(\"dog\") = " + l.indexOf(new String("dog")));
        ps.println("l.indexOf(\"cat\") = " + l.indexOf(new String("cat")));
        ps.println("l.indexOf(\"mouse\") = " + l.indexOf(new String("mouse")));
        ps.println("l.indexOf(\"horse\") = " + l.indexOf(new String("horse")));
        ps.println();
    }

    public static void testRemove() {
        ps.println("Testing remove()...");
        LinkedList<String> l = new LinkedList<String>();
        l.add("dog"); l.add("cat"); l.add("mouse");
        ps.println("l = " + l);
        l.remove(1);
        ps.println("l.remove(1) = " + l);
        l.remove(l.size()-1);
        ps.println("l.remove(l.size()-1) = " + l);
        l.remove(0);
        ps.println("l.remove(0) = " + l);
        ps.println();
    }

    
    public static void testSortND() {
	LinkedList<Integer> l = new LinkedList<Integer>();
        ps.println("Testing sortND..");    
        ps.println("l = " + l);
        l.sortND();
        ps.println("l after sort = " + l);

        l.add(12);
        ps.println("l = " + l);
        l.sortND();
        ps.println("l after sort = " + l);

        Random rand = new Random();
        for (int i = 0; i < 5; i++)
	    l.add(rand.nextInt(10));
        ps.println("l = " + l);
        l.sortND();
        ps.println("l after sort = " + l);
        ps.println();
    }

    
    public static void testReverse() {
	LinkedList<Integer> l = new LinkedList<Integer>();
        ps.println("Testing reverse...");    
        ps.println("l = " + l);
        l.reverseND();
        ps.println("l after reverse = " + l);

        l.add(0);

        ps.println("l = " + l);
        l.reverseND();
        ps.println("l after reverse = " + l);

        for (int i = 1; i < 5; i++)
	    l.add(i);
        ps.println("l = " + l);
        l.reverseND();
        ps.println("l after reverse = " + l);
        ps.println();
    }

    
    public static void testReverseIP() {
	LinkedList<Integer> l = new LinkedList<Integer>();
        ps.println("Testing reverseIP..");    
        ps.println("l = " + l);
        l.reverseIP();
        ps.println("l after reverseIP = " + l);

        l.add(0);

        ps.println("l = " + l);
        l.reverseIP();
        ps.println("l after reverseIP = " + l);

        for (int i = 1; i < 5; i++)
	    l.add(i);
        ps.println("l = " + l);
        l.reverseIP();
        ps.println("l after reverseIP = " + l);
    }
    
}
