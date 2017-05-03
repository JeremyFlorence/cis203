public class LockClient {

    public static void main (String [] args) {
        CombinationLock cl = new CombinationLock();
	cl.turn(false, 4);
	cl.turn(true, 8);
	cl.turn(true, 7);
	cl.turn(true, 8);
	cl.turn(false, 39);

    }
}
