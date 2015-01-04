package geometrie;

public class DreieckDemo {
	public static void main(String[] args) {
		Dreieck dr1, dr2, dr3, dr4;
		dr1 = new Dreieck();
		Punkt[] punkte = new Punkt[3];
		punkte[0] = new Punkt(2,0);
		punkte[1] = new Punkt(3,0);
		punkte[2] = new Punkt(4,1);
		dr2 = new Dreieck(punkte);
		dr3 = new Dreieck();
		System.out.println("Eingabe fuer Dreieck");
		dr3.eingabe();
		dr4 = new Dreieck(dr3);
		System.out.println("Ausgabe fuer Objekt 1");
		dr1.ausgabe();
		System.out.println("Ausgabe fuer Objekt 2");
		dr2.ausgabe();
		System.out.println("Ausgabe fuer Objekt 3");
		dr3.ausgabe();
		System.out.println("Ausgabe fuer Objekt 4");
		dr4.ausgabe();
		
		if(dr1.equal(dr2)) {
			System.out.println("Die Dreiecke sind gleich");
		} else {
			System.out.println("Verschiedene Dreiecke");
		}
		
		if(dr2.equal(dr3)) {
			System.out.println("Die Dreiecke sind gleich");
		} else {
			System.out.println("Verschiedene Dreiecke");
		}
		
		if(dr3.equal(dr4)) {
			System.out.println("Die Dreiecke sind gleich");
		} else {
			System.out.println("Verschiedene Dreiecke");
		}
	}
}
