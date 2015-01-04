package geometrie;

public class GeradeDemo {
	public static void main(String[] args) {
		Gerade gera1, gera2, gera3, gera4;
		gera1 = new Gerade();
		Punkt t1 = new Punkt(0,0);
		Punkt t2 = new Punkt(2.3, 3.4);
		gera2 = new Gerade(t1, t2);
		gera3 = new Gerade();
		System.out.println();
		System.out.println("Eingabe fue Objekt 3");
		gera3.eingabe();
		gera4 = new Gerade(gera3);
		System.out.println();
		System.out.println("Ausgabe fuer Objekt 1:");
		gera1.ausgabe();
		System.out.println();
		System.out.println("Ausgabe fuer Objekt 2");
		gera2.ausgabe();
		System.out.println();
		System.out.println("Ausgabe fuer Objekt 3");
		gera3.ausgabe();
		System.out.println();
		System.out.println("Ausgabe fuer Objekt 4");
		gera4.ausgabe();
		System.out.println();
		Punkt z1 = new Punkt(2, 3);
		Punkt z2 = new Punkt(5, 6);
		double ab = Gerade.abstand(z1, z2);
		double ko = Gerade.koeffizient(z1, z2);
		System.out.println("Der Abstand zwischen den Punkten" +z1+ "und" +z2+ "ist" +ab);
		System.out.println("Der Koeffizient der Gerade, definiert bei den Punkten" +z1+ "und" +z2+ "ist" +ko);
		
	}
}
