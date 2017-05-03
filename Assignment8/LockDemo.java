public class LockDemo {
    public static void main(String [] args) {
	CombinationLock lock = new CombinationLock();
	lock.turn(false,4);
	lock.turn(true, 8);
	lock.turn(false,16);
    }
}