public class Demo6 {

    public static int count = 0;

    public static void main (String [] args) {
         int  n = Integer.parseInt(args[0]);

         countDown3(n);

         System.out.println("n = " + n);
         System.out.println("count = " + count);
    }

       public static void countDown3(int n) {
           int x = n;
           while (x > 0) {
              int y = n;
              while (y > 0) {
                 int z = n;
                 while (z > 0) {
		     count++;
                    z--;
		 }
                 y--;
              }
              x--;
           }
       }


}
