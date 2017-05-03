public class Figure {
    public static void main(String [] args) {
	figure(Integer.parseInt(args[0]), 0);
    }
    
    
    public static void figure(int level, int padding) {
      
      // base case	
	if(level == 0) {
	    String padded = "";
	    for(int i = 0; i < padding; i++)
		padded += " ";
	    System.out.println(padded + "*");
	} else {
	    figure((level - 1), padding);
	    printStars((int)Math.pow(2, level), padding);
	    figure((level -1), padding + (int)Math.pow(2, (level-1)));
	}
    }
    
    private static void printStars(int num, int padding){
      for(int i = 0; i < padding; i++) {
	    System.out.print(" ");
      }
      for(int i = 0; i < num; i++) {
	  System.out.print("*");
      }
      System.out.println();
    }
}