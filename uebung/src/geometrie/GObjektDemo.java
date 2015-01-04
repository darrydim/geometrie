package geometrie;

public class GObjektDemo {
	
	static GObjekt[] objekte  = new GObjekt[9];
	
	public static void init() {
		Punkt anf = new Punkt(1, 0);
		objekte[0] = new Rechteck(anf, 2, 1.5);
		anf = new Punkt(4, 0);
		objekte[1] = new Rechteck(anf, 2.5, 1.5);
		
		Punkt[] dreieckpunkte = new Punkt[3];
		dreieckpunkte[0] = new Punkt(0, 3);
		dreieckpunkte [1] = new Punkt(1.5, 1.5);
		dreieckpunkte [2] = new Punkt(1, 3);
		
		objekte[2] = new Dreieck(dreieckpunkte);
	}

	public static void main(String[] args) {
	
	}

}
