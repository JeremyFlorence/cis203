import java.util.*;

public class ArraySearchTree <E extends Comparable<E>> {

    public static  final int SIZE = 10;

    // field
    private E[] tree;
    

    public ArraySearchTree () {
	tree = (E[]) new Comparable[SIZE];
    }

    // post: value added to tree so as to preserve binary search tree
    public void add(E value) {
	add(0, value);
    }

    // post: value added to tree so as to preserve binary search tree
    private void add(int pos, E value) {
        if (pos >= tree.length ) {
            int lengthToUse = Math.max(tree.length, pos);
            ensureCapacity(lengthToUse * 2 + 1);
	    tree[pos] = value;
	} else if (tree[pos] == null) {
	    tree[pos] = value;
	} else if (tree[pos].compareTo(value) >= 0) {
            // add left
	    add(2*pos + 1, value);
        } else {
	    // add right
            add(2*pos + 2, value);
        }
    }


    // returns: true if tree is  sorted
    public boolean isSorted () {
        return isSorted(0);
    }

    private boolean isSorted(int pos) {
        // if we are beyond the end of the tree or at a leaf, it's sorted
        if (pos >= tree.length || tree[pos] == null)
	    return true;
        // if there is a left child from position pos and it is greater than
        // the parent at pos, return false
	if (2*pos + 1 < tree.length && tree[2*pos+1] != null && 
            tree[2*pos+1].compareTo(tree[pos])> 0)
	    return false;
        // if there is a right child from position pos and it is less than
        // the parent at pos, return false
        if (2*pos + 2 < tree.length && tree[2*pos+2] != null &&
            tree[2*pos+2].compareTo(tree[pos]) < 0)
	    return false;
	// otherwise, this tree is sorted as long as its left subtree and
	// right subtree are sorted
	return isSorted(2*pos+1) && isSorted(2*pos+2);
    }


    // returns: representation of binary search tree using an inorder traversal
    public String toString() {
        return inorder(0);
    }

    public String inorder(int pos) {
	if (pos >= tree.length || tree[pos] == null)
	    return "";
	return inorder(2*pos + 1) + " " + tree[pos] + " " +
               inorder(2*pos + 2);
    }


    // post:  array enlarged to 'size' if needed
    private void ensureCapacity(int size) {
        if (size < tree.length)
           return;
        E[] temp = (E[]) new Comparable[size];
        for (int i =0; i < tree.length; i++)
            temp[i] = tree[i];
	tree = temp;
    }
}
