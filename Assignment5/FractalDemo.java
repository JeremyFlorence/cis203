public class FractalDemo {
    public static void main (String [] args) {
	Fractal f = new Fractal(Integer.parseInt(args[0]));
	System.out.print(f);
    }
}