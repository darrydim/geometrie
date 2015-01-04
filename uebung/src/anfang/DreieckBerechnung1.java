package anfang;
import java.util.*;
public class DreieckBerechnung1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Geben Sie a,b,c ein!");
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Die Flaeche ist:" + s);
		

	}

}
