public class Demo5 {

    public static int count = 0;

    public static void main (String [] args) {
         int  n = Integer.parseInt(args[0]);

         countDown2(n);

         System.out.println("n = " + n);
         System.out.println("count = " + count);

    }

    public static void countDown2(int n) {
           if (n < 0)
              n *= -1;
           while (n > 0) {
	       count++;
	       n /= 2;
	   }
    }

}
