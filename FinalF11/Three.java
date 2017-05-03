import java.util.*;

public class Three {

    public static void main (String [] args) {
        Queue<Integer> que = getRandomQueue(0);
	System.out.println("que = " + que);
	rearrange(que);
	System.out.println("que rearranged = " + que);
        que = getRandomQueue(1);
	System.out.println("que = " + que);
	rearrange(que);
	System.out.println("que rearranged = " + que);
    }

    // put rearrange() here




    public static Queue<Integer> getRandomQueue(int odd) {
	Queue<Integer> que = new java.util.LinkedList<Integer>();
        Random rand = new Random();
        int size = 2 * rand.nextInt(7) + odd;
        for (int i = 0; i < size; i++)
	    que.add(rand.nextInt(100));
	return que;
    }


}
