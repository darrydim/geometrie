package anfang;
import java.util.*;
public class Quadratgleichung2 {
	public static final double EPSILON = 1.0e-4;
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		double a, b, c;
		System.out.println ("Geben Sie die Werte a,b,c fuer ax^2 + bx + c = 0 ein:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close ();
		if(a==0) {
			if(b==0) {
				if(c==0) 
					System.out.println ("Viele Werte");
			else System.out.println ("Keine Werte");
		}else {double x1;
		x1 = (-c/b);
		System.out.println ("x1=" +x1);}}
	else {double disk;
	disk = b*b - 4*a*c;
	if(Math.abs(disk) > 0);
	if(disk < 0){
		System.out.println("Imaginaere Werte!");}
	else {double t, x2, x3;
	t = Math.sqrt(disk);
	x2 = (-b - t)/(2*a);
	x3 = (-b + t)/(2*a);
	System.out.println ("x1=" +x2);
	System.out.println ("x2=" +x3); }
	}
}
}
