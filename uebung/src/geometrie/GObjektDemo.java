package geometrie;

public class GObjektDemo {
	
	static GObjekt[] objekte  = new GObjekt[9];
	
	public static void init() {
		Punkt anf = new Punkt(1, 0);
		objekte[0] = new Rechteck(anf, 2, 1.5);
		
		anf = new Punkt(4, 0);
		objekte[1] = new Rechteck(anf, 2.5, 1.5);
		
		anf = new Punkt(3, 3);
		objekte[2] = new Rechteck(anf, 1, 2);
		
		Punkt[] dreieckpunkte = new Punkt[3];
		dreieckpunkte[0] = new Punkt(0, 3);
		dreieckpunkte [1] = new Punkt(1, 1.5);
		dreieckpunkte [2] = new Punkt(1, 3);
		
		objekte[3] = new Dreieck(dreieckpunkte);
		
		Punkt[] eckpunkte = new Punkt[3];
		eckpunkte[0] = new Punkt(3, 1.5);
		eckpunkte[1] = new Punkt(2, 3);
		eckpunkte[2] = new Punkt(3, 3);
		
		objekte[4] = new Dreieck(eckpunkte);
		
		Punkt[] viereckpunkte = new Punkt[4];
		viereckpunkte[0] = new Punkt(4, 1.5);
		viereckpunkte[1] = new Punkt(6.5, 1.5);
		viereckpunkte[2] = new Punkt(5, 3);
		viereckpunkte[3] = new Punkt(5.5, 3);
		
		objekte[5] = new Viereck(viereckpunkte);
		
		Punkt ellipse = new Punkt(1.5, 4);
		objekte[6] = new Ellipse(ellipse, 1, 1);
		
		ellipse = new Punkt(5, 4);
		objekte[7] = new Ellipse(ellipse, 1, 1);
		
		ellipse = new Punkt(5, 6);
		objekte[8] = new Ellipse(ellipse, 2, 1);
		
	}

	public static void main(String[] args) {
		init();
		double gesamtF = 0;
		
		for(int i = 0; i < objekte.length; i++) {
			gesamtF+= objekte[i].flaeche();
			
		}	System.out.println("Die Gesamtflaeche ist " +gesamtF);
	}
	
	public void ausgabe() {
		System.out.println(this);
	}

}
