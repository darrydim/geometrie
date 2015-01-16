package geometrie;

public class Vieleck extends GObjekt {
	protected double r;

	public Vieleck(int anzahl) {
		super("Vieleck", anzahl);
		eckpunkte = new Punkt[anzahl];
		this.r = 1;
		
		for(int i = 0; i < anzahl; i++) {
			// x = centerX + r * cos(angle)
			double x = this.r * Math.cos((2 * Math.PI / anzahl) * i);
			// y = centerY + r * sin(angle)
			double y = this.r * Math.sin((2 * Math.PI / anzahl) * i);
			eckpunkte[i] = new Punkt(x, y);
		}
		
		for(int i = 0; i < seiten.length; i++) {
			if (i < (seiten.length - 1)) {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[i + 1]);
			} else {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[0]);
			}
		}
	}

	public Vieleck(int anzahl, double r) {
		super("Vieleck", anzahl);
		this.r = r;
		
		for(int i = 0; i < anzahl; i++) {
			// x = centerX + r * cos(angle)
			double x = this.r * Math.cos((2 * Math.PI / anzahl) * i);
			// y = centerY + r * sin(angle)
			double y = this.r * Math.sin((2 * Math.PI / anzahl) * i);
			eckpunkte[i] = new Punkt(x, y);
		}
		
		for(int i = 0; i < seiten.length; i++) {
			if (i < (seiten.length - 1)) {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[i + 1]);
			} else {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[0]);
			}
		}
	}
	
	public Vieleck(Punkt[] eck) {
		super("Vieleck", eck.length);
		
		this.seiten = new double[anzahl];
		
		for(int i = 0; i < eckpunkte.length; i++) {
			eckpunkte[i] = new Punkt(eck[i]);
		}
		
		for(int i = 0; i < seiten.length; i++) {
			if (i < (seiten.length - 1)) {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[i + 1]);
			} else {
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[0]);
			}
		}
	}
	
	public Vieleck(Vieleck v) {
		super("Vieleck", v.eckpunkte.length);
		this.r = v.r;
		for(int i = 0; i < v.eckpunkte.length; i++) {
			eckpunkte[i] = new Punkt(v.eckpunkte[i]);
		}
	}
	
	public int kontrolle() {
		return 1;
	}
	
	public void eingabe() {
		do {
			System.out.println("Eingabe fuer Vieleck");
			for(int i = 0; i < eckpunkte.length; i++) {
				System.out.println("Koordinaten fuer Punkt " +(i+1));
				eckpunkte[i].eingabe();
			}
			if(kontrolle() > 0) {
				System.out.println("Falscher Punkt" + kontrolle() );
			}
		} while(kontrolle() > 0);
		seitenBerechnung();
	}
	
	public double umfang() {
		double u = 0;
		for(int i = 0; i < seiten.length; i++) {
			u += seiten[i];
		}
		
		return u;
	}
	
	public double flaeche() {
		return 1;
	}
	
	public String art() {
		for(int i = 1; i < seiten.length; i++) {
			if(seiten[0] != seiten[i]) {
				return "gewoenliches " + this.anzahl + "-Eck";
			}
		}

		return "regelmaessiges " + this.anzahl + "-Eck";
	}
	
	public String toString() {
		return "Vieleck mit " +anzahl+ " Ecke";
	}
	
	public void ausgabe() {
		System.out.println(this);
		System.out.println("Umfang des Vielecks: " +umfang());
		System.out.println("Flaeche des Vielecks: " +flaeche());
		System.out.println("Art des Vielecks: " +art());
	}
 }
