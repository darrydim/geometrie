package geometrie;

import java.awt.Graphics;
import java.awt.Point;

public class Dreieck extends GObjekt {
	
	public Dreieck() {
		super("Dreieck", 3);
		eckpunkte = new Punkt[anzahl];
		eckpunkte [0] = new Punkt(0, 0);
		eckpunkte [1] = new Punkt(1, 0);
		eckpunkte [2] = new Punkt(0, 1);
		seiten = new double [anzahl];
		seitenBerechnung();
	}
	
	public Dreieck(Punkt[] eck) {
		super("Dreieck", 3);
		eckpunkte = new Punkt[anzahl];
		seiten = new double[anzahl];
		for(int i=0; i<eck.length; i++) {
			eckpunkte[i] = new Punkt(eck[i]);
		}
		seitenBerechnung();
	}
	
	public Dreieck(Dreieck dr) {
		super("Dreieck", 3);
		eckpunkte = new Punkt[anzahl];
		seiten = new double[anzahl];
		for(int i=0; i<dr.eckpunkte.length; i++) 
			eckpunkte[i] = new Punkt(dr.eckpunkte[i]);
		seitenBerechnung();
	}
	
	public int kontrolle() {
		Punkt p1 = eckpunkte[0], p2 = eckpunkte[1], p3 = eckpunkte[2];
		if(Hilfe.equal(p1.x, p2.x) && (Hilfe.equal(p1.y, p2.y)))
			return 1;
		else if(Math.abs(flaeche(p1, p2, p3))<Hilfe.EPSILON)
			return 2;
		else 
			return 0;
	}
	
	public void eingabe() {
		do {
			System.out.println("Eingabe fuer Dreieck");
			for(int i = 0; i<eckpunkte.length; i++) {
				System.out.println("Koordinaten fuer Punkt" +(i+1));
				eckpunkte[i].eingabe();
			}
			if(kontrolle() > 0)
				System.out.println("Falscher Punkt" +kontrolle() );
		} while(kontrolle() > 0);
		seitenBerechnung();
	}
	
	public double umfang() {
		double a = seiten[0], b = seiten[1], c = seiten[2];
		double u = a + b + c;
		return u;
	}
	
	public double flaeche() {
		double a = seiten[0], b = seiten[1], c = seiten[2];
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p - a)*(p - b)*(p - c));
	}
	
	public static double flaeche(Punkt t1, Punkt t2, Punkt t3) {
		double m = t1.x*(t2.y - t3.y) + t2.x*(t3.y - t1.y) + t3.x*(t1.y - t2.y); 
		return 0.5*m;
	}
	
	public String art() {
		String s;
		double a = seiten[0], b = seiten[1], c = seiten [2];
		if(Hilfe.equal(a,b) && Hilfe.equal(b,c)) 
			s = " gleichseitig ";
		else if(Hilfe.equal(a,b) || Hilfe.equal(b,c) || Hilfe.equal(a, c))
			s = " gleichboeckig ";
		else 
			s = " ungleichseitig ";
		
		if(Hilfe.equal(maxWinkel(), Math.PI/2))
			s = s + " rechtwinklig ";
		else 
			s = s + " unrechtwinklig ";
		return s;
	} 
	
	public boolean equal(GObjekt g) {
		Dreieck dr = (Dreieck)g;
		double a1 = seiten[0], b1 = seiten[1], c1 = seiten[2];
		double a2 = dr.seiten[0], b2 = dr.seiten[1], c2 = dr.seiten[2];
		if(Hilfe.equal(a1, a2) && Hilfe.equal(b1, b2) && Hilfe.equal(c1, c2))
			return true;
		else
			return false;
	}
	
	public static double winkel(double a, double b, double c) {
		double winkel = Math.acos((b*b + c*c - a*a)/2);
		return winkel;
	}
	public double maxWinkel() {
		double a = seiten[0], b = seiten[1], c = seiten[2];
		double alpha = winkel(a, b, c);
		double beta = winkel(b, c, a);
		double gamma = winkel(c, a, b);
		double max = 0;
		if (alpha > max) {
			max = alpha;
		} 
		
		if(beta > max) {
			max = beta;
		}
		
		if(gamma > max) {
			max = gamma;
		}
		
		return max;
	}
	
	public String toString() {
		return("Dreieck mit " +eckpunkte[0]+ " " +eckpunkte[1]+ " " +eckpunkte[2]);
	}
	
	public void ausgabe() {
		System.out.println(this);		
		System.out.println("Umfang des Dreiecks" +umfang());
		System.out.println("Flaeche des Dreiecks" +flaeche());
		System.out.println("Art des Dreiecks" +art());
	}
	
	public void zeichnen(Graphics g, double masstab) {
		eckpunkteZ = new Point[anzahl];
		for(int i = 0; i < eckpunkteZ.length; i++) {
			eckpunkteZ[i] = new Point((int)(eckpunkte[i].x * masstab), (int)(eckpunkte[i].y * masstab));
		}
		
		int mx[], my[];
		mx = new int[eckpunkteZ.length];
		my = new int[eckpunkteZ.length];
		for(int i = 0; i < eckpunkteZ.length; i++) {
			mx[i] = eckpunkteZ[i].x;
			my[i] = eckpunkteZ[i].y;
		}
		
		g.drawPolygon(mx, my, eckpunkteZ.length);
	}
	
	public boolean contains(int x, int y) {
		return true;
	}
}