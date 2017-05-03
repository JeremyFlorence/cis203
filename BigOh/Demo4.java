public class Demo4 {

    public static int count = 0;

    public static void main (String [] args) {
         int  n = Integer.parseInt(args[0]);
         countDown(n);

         System.out.println("n = " + n);
         System.out.println("count = " + count);

    }

    public static void countDown(int n) {
           if (n < 0)
              n *= -1;
           while (n > 0) {
	       count++;
              n--;
	   }
    }



}
