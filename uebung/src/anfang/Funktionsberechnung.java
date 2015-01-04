package anfang;
import java.util.*;
	public class Funktionsberechnung {
		public static void main(String [] args) {	
			Scanner sc = new Scanner (System.in);
			
			double a, xAnf, xEnd, xSchritt;
			System.out.println("Geben Sie ein Anfangswert fuer x!");
			xAnf = sc.nextDouble();
			System.out.println("Geben Sie ein Endwert fuer x!");				
			xEnd = sc.nextDouble();
			System.out.println("Geben Sie einen konstanten Schritt!");
			xSchritt = sc.nextDouble();
			System.out.println("Geben Sie einen Wert fuer a!");
			a = sc.nextDouble();
			sc.close ();
			System.out.println("x" + "      " + "f(x)");
			double x = xAnf;
			while (x<=xEnd) {
				double y = a*x*x + (2*x-4)/(2*x+4)+ x*x*x;
				if (x != -2) {
					System.out.println(x + " " +y); }
				else { 
					System.out.println(x + "nicht definiert"); }
				x = x + xSchritt;
		}
}
}