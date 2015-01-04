package anfang;
import java.util.*;
public class Quadratgleichung1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double a, b, c;
	System.out.println("Geben Sie die Werte a,b,c fuer ax^2 + bx + c = 0 ein:");
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	double disk, t, x1, x2;
	disk = b*b - 4*a*c;
	t = Math.sqrt(disk);
	x1 = (-b - t)/(2*a);
	x2 = (-b + t)/(2*a);
	System.out.println("x1=" +x1);
	System.out.println("x2=" +x2);
	
	
}
}
