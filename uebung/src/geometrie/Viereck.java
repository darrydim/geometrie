package geometrie;

import java.awt.Graphics;
import java.awt.Point;

public class Viereck extends GObjekt {
	
	public Viereck() {
		super("Viereck", 4);
		eckpunkte = new Punkt[anzahl];
		seiten = new double[anzahl];
		eckpunkte[0] = new Punkt(0,0);
		eckpunkte[1] = new Punkt(1,0);
		eckpunkte[2] = new Punkt(1,1);
		eckpunkte[3] = new Punkt(0,1);
		seitenBerechnung();
	}
	
	public Viereck(Punkt[] eck) {
		super ("Viereck", 4);
		eckpunkte = new Punkt[anzahl];
		seiten = new double[anzahl];
		for(int i=0; i<eck.length; i++) 
			eckpunkte[i] = new Punkt(eck[i]);
		seitenBerechnung();
	}
	
	public Viereck(Viereck vr) {
		super("Viereck", 4);
		eckpunkte = new Punkt[anzahl];
		seiten = new double[anzahl];
		for(int i=0; i<vr.eckpunkte.length; i++ ) {
			eckpunkte[i] = new Punkt(vr.eckpunkte[i]);
			seitenBerechnung();
		}
	}
	
	public int kontrolle() {
		Punkt p1 = eckpunkte[0], p2 = eckpunkte[1], p3 = eckpunkte[2], p4 = eckpunkte[3];
		if(Hilfe.equal(p1.x, p2.x) && Hilfe.equal(p1.y, p2.y)) {
			return 1;
		} else if(Math.abs(Dreieck.flaeche(p1, p2, p3))<Hilfe.EPSILON) {
			return 2;
		} else {
			double fla1, fla2, fla3;
			fla1 = Dreieck.flaeche(p1, p2, p4);
			fla2 = Dreieck.flaeche(p1, p3, p4);
			fla3 = Dreieck.flaeche(p2, p3, p4);
			if((Hilfe.signum(fla1) != Hilfe.signum(fla2)) || 
			(Hilfe.signum(fla1) != Hilfe.signum(fla3))	|| 
			(Hilfe.signum(fla2) != Hilfe.signum(fla3))) {
				return 3;
			} else {
				return 0;
			}
		}
	}
	
	public void eingabe() {
		do {
			System.out.println("Eingabe fuer Dreieck");
			for(int i=0; i<eckpunkte.length; i++) {
				System.out.println("Koordinaten fuer Punkt" +(i+1));
				eckpunkte[i].eingabe();
		}
		if(kontrolle() > 0) {
			System.out.println("Falscher Punkt" +kontrolle());
		}
		} while(kontrolle() > 0);
			seitenBerechnung();
	}
	
	public double umfang() {
		double a = seiten[0], b = seiten[1], c = seiten[2], d = seiten[3];
		double u = a + b + c + d;
		return u;
	}
	
	public double flaeche() {
		Punkt p1 = eckpunkte[0], p2 = eckpunkte[1], p3 = eckpunkte[2], p4 = eckpunkte[3];
		double s1, s2;
		s1 = Dreieck.flaeche(p1, p2, p3);
		s2 = Dreieck.flaeche(p1, p3, p4);
		return s1 + s2;
	}
	
	public String art() {
		Punkt p1 = eckpunkte[0], p2 = eckpunkte[1], p3 = eckpunkte[2], p4 = eckpunkte[3];
		String s;
		if(Gerade.koeffizient(p1, p2) == Gerade.koeffizient(p3, p4) && 
		   Gerade.koeffizient(p1, p4) == Gerade.koeffizient(p2, p3)) {
			s = "parallelogramm";
		} else if(Gerade.koeffizient(p1, p2) == Gerade.koeffizient(p3, p4) || 
				  Gerade.koeffizient(p1, p4) == Gerade.koeffizient(p2, p3)) {
			s = "Trapez";
		}else {
			s = "gewoehnliches Viereck";
		}
		return s;
	}
	
	public boolean equal(GObjekt g) {
		Viereck v = (Viereck)g;
		double a1 = seiten[0], b1 = seiten[1], c1 = seiten[2], d1 = seiten[3];
		double a2 = g.seiten[0], b2 = g.seiten[1], c2 = g.seiten[2], d2 = g.seiten[3];
		if(Hilfe.equal(a1, a2) && Hilfe.equal(b1, b2) && 
		   Hilfe.equal(c1, c2) && Hilfe.equal(d1, d2))
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "A: " + eckpunkte[0] + ", B: " + eckpunkte[1] + ", C: " + eckpunkte[2] + ", D: " + eckpunkte[3];
	}
	
	public void ausgabe() {
		System.out.println(this);
		System.out.println("Umfang des Vierecks: " +umfang());
		System.out.println("Flaeche des Vierecks: " +flaeche());
		System.out.println("Art des Vierecks: " +art());
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

