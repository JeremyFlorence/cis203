public class Two {

    public static void main (String [] args) {
        Integer [] a = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = new LinkedList<Integer>(a);
        System.out.println("list = " + list);
        Integer [] b = {};
        list = new LinkedList<Integer>(b);
        System.out.println("list = " + list);
    }



}
