package geometrie;

public class Rechteck extends GObjekt {
	protected int anzahl = 1;
	protected Punkt[] eckpunkte = new Punkt[anzahl];
	protected double br;
	protected double ho;
	
	public Rechteck() {
		super("Rechteck", 1);
		eckpunkte[0] = new Punkt(0,0);
		this.br = 1;
		this.ho = 1;
	}
	
	public Rechteck(Punkt anfangsPunkt, double br, double ho) {
		super("Rechteck", 1);
		eckpunkte[0] = new Punkt(anfangsPunkt);
		this.br = br;
		this.ho = ho;
	}
	
	public Rechteck(Rechteck r) {
		super("Rechteck",1);
		eckpunkte[0] = new Punkt(r.eckpunkte[0]);
		this.br = r.br;
		this.br = r.br;	
	}
	
	public int kontrolle() {
		if(br <= 0) {
			return 1;
		} else if(ho <= 0) {
			return 2;
		} else {
			return 0;
		}
	}
	
	public void eingabe() {
		System.out.println("Eingabe fuer Anfangspunkt");
		eckpunkte[0].eingabe();
		do {
		System.out.println("Breite=");
		br = Hilfe.sc.nextDouble();
		System.out.println("Hoehe=");
		ho = Hilfe.sc.nextDouble();
		if(kontrolle() > 0) {
			System.out.println("Falsche Werte");
		}
		} while(kontrolle() > 0);
	}
	
	public double umfang() {
		return 2*br + 2*ho;
	}
	
	public double flaeche() {
		double fl = br*ho;
		return fl;
	}
	
	public String art() {
		String s;
		if(br == ho) {
			s = "Quadrat";
		} else {
			s = "Rechteck";
		}
		return s;
	}
	
	public String toString() {
		return "Die Koordinaten des Anfangspunktes sind " +eckpunkte[0]+ "Die Breite ist " +br+ "Die Hoehe ist " +ho;
	}
	
	public void ausgabe() {
		System.out.println(this);
		System.out.println("Flaeche= " +flaeche());
		System.out.println("Umfang= " +umfang());
		System.out.println("Art des Vierecks: " +art());
	}
	
	public boolean equal(GObjekt g) {
		Rechteck r = (Rechteck) g;
		if((Hilfe.equal(this.br, r.br) && Hilfe.equal(this.ho, r.ho)) ||
		   (Hilfe.equal(this.br, r.ho) && Hilfe.equal(this.ho, r.br))) {
			return true;
		} else {
			return false;
		}
	}
	
}