package anfang;

import java.util.*;

public class DreieckBerechnung2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Geben Sie a,b,c ein!");
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double p = (a+b+c)/2;
		if((a>0) && (b>0) && (c>0) && (a+b>c) && (b+c>a) && (a+c>b)) {
			double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Die Flaeche ist:" + s);
		}

	}
}