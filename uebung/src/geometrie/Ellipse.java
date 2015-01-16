package geometrie;

import java.awt.Graphics;
import java.awt.Point;

public class Ellipse extends GObjekt {
	protected double a;
	protected double b;
	protected int aZ;
	protected int bZ;
	
	public Ellipse() {
		super("Ellipse", 1);
		eckpunkte = new Punkt[anzahl];
		eckpunkte[0] = new Punkt(0,0);
		this.a = 1;
		this.b = 1;
	}
	
	public Ellipse(Punkt anf, double a, double b) {
		super("Ellipse", 1);
		eckpunkte = new Punkt[anzahl];
		eckpunkte[0] = new Punkt(anf);
		this.a = a;
		this.b = b;
	}
	
	public Ellipse(Ellipse e) {
		super("Ellipse", 1);
		eckpunkte = new Punkt[anzahl];
		eckpunkte[0] = new Punkt(e.eckpunkte[0]);
		this.a = e.a;
		this.b = e.b;
	} 
	
	public int kontrolle() {
		if(a <= 0 || b <= 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void eingabe() {
		System.out.println("Eingabe fuer Ellipse");
		System.out.println("Koordinaten fuer Anfangspunkt");
		eckpunkte[0].eingabe();
		do {
			System.out.println("Eingabe fuer a");
			a = Hilfe.sc.nextDouble();
			System.out.println("Eingabe fuer b");
			b = Hilfe.sc.nextDouble();
		} while(kontrolle() > 0);
	}
	
	public double umfang() {
		return (22/7)*(3*(a+b)+Math.sqrt((3*a +b)*(a+3*b)));
	}
	
	public double flaeche() {
	return (22/7)*a*b;
	}
	
	public String art() {
		String s;
		if(a == b) {
			s = "Kreis";
		} else {
			s = "Ellipse";
		}
		return s;
	}
	
	public String toString() {
		return "Ellipse mit Anfangspunkt" +eckpunkte[0]+ "Halbachse a" +a+ "Halbachse b" +b;
	}
	
	public void ausgabe() {
		System.out.println(this);
		System.out.println("Der Umfang ist: " +umfang());
		System.out.println("Die Flaeche ist: " +flaeche());
		System.out.println("Die Art ist: " +art());
	}
	
	public boolean equal(GObjekt g) {
		Ellipse e = (Ellipse) g;
		if((Hilfe.equal(this.a,e.a) && Hilfe.equal(this.b, e.b)) ||
		(Hilfe.equal(this.a, e.b) && Hilfe.equal(this.b, e.a))) 
			return true;
		else 
			return false;
	}
	
	public void zeichnen(Graphics g, double masstab) {
		eckpunkteZ = new Point[anzahl];
		for(int i = 0; i < eckpunkteZ.length; i++) {
			eckpunkteZ[i] = new Point((int)(eckpunkte[i].x * masstab), (int)(eckpunkte[i].y * masstab));
		}
		aZ = (int)(a*masstab);
		bZ = (int)(b*masstab);
		g.drawArc(eckpunkteZ[0].x, eckpunkteZ[0].y, 2*aZ, 2*bZ, 0, 360);
	}
	
	public boolean contains(int x, int y) {
		return true;
	}
}
