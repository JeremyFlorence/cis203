import java.util.*;

public class Client {

    public static void main (String [] args) {
	ArraySearchTree<String> t =  new ArraySearchTree<String>();
	Random rand = new Random(1234);
        for (int i = 0; i < 9; i++) {
            String newCow = "cow " + rand.nextInt(100);
            System.out.println("adding " + newCow);
	    t.add(newCow);
	}
	System.out.println(t);
	System.out.println(t.isSorted());

	//        testContains(t);
	//	testIsEmpty(t);
	//	testMin(t);
	//	testRemove(t);
    }
    /*
    public static void testContains(ArraySearchTree<String> t) {
	System.out.println("\nTesting contains()");
	Random rand = new Random(1234);        
        for (int i = 0; i < 9; i++) {
            String newCow = "cow " + rand.nextInt(100);
            System.out.println("contains " + newCow + "? " + 
			       t.contains(newCow));
	}
	System.out.println();
        rand = new Random(1234);        
        for (int i = 0; i < 9; i++) {
            String newCow = "cow " + (rand.nextInt(100) + 2);
            System.out.println("contains " + newCow + "? " + 
			       t.contains(newCow));
	}

    }

    public static void testIsEmpty(ArraySearchTree<String> t) {
	System.out.println("\nTesting isEmpty()");
	System.out.println("Tree t should NOT be empty: " + t.isEmpty());
	System.out.println("The empty tree should be empty: " + 
			   new ArraySearchTree<Character>().isEmpty());

    }

    public static void testMin(ArraySearchTree<String> t) {
	System.out.println("\nTesting min()");
	System.out.println("Min should be cow 10 and is " + t.min());
        t = new ArraySearchTree<String>();
	t.add("h");
	t.add("g");
	t.add("f");
	t.add("e");
	System.out.println("Min should be e and is " + t.min());
        try {
	    new ArraySearchTree<Integer>().min();
	} catch (IllegalStateException e) {
	    System.out.println(e + " CAUGHT");
	}
    }

    public static void testRemove(ArraySearchTree<String> t) {
	System.out.println("\nTesting remove()");
	Random rand = new Random(1234);        
	while (!t.isEmpty()) {
            String newCow = "cow " + rand.nextInt(100);
	    System.out.println("removing " + newCow);
	    t.remove(newCow);
	    System.out.println("Tree still sorted? " + t.isSorted());
	    } 

    }
    */
}
