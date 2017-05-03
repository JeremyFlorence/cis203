public class Demo3 {

    public static int count = 0;

    public static void main (String [] args) {
         int  n = Integer.parseInt(args[0]);

         int [] data = new int [n];
         for (int i = 0; i < n; i++)
	     data[i] = 5;

         booBoo(data, -1);

         System.out.println("n = " + n);
         System.out.println("count = " + count);
    }

    public static  boolean isIn (int [] array, int value) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
	    count++;
	    if (array[i] == value)
		return true;
	}
        return false;
    }

     public static void booBoo (int [] array, int value) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
	    if (isIn (array,value))  {
		count++;
	       array[i] = array[i];
	    }
	}
     }


}
