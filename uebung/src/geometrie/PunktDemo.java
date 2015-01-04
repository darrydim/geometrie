package geometrie;

public class PunktDemo {
	public static void main(String[] args) {
		Punkt p1, p2, p3, p4, p5, p6;
		p1 = new Punkt();
		p2 = new Punkt(2,2);
		p3 = new Punkt();
		System.out.println("Objekt 3:");
		p3.eingabe();
		p4 = new Punkt(p3);
		p5 = p2.moveNew(1,1);
		p2.move(3,4);
		p6 = p2;
		System.out.println("Objekt 1:");
		p1.ausgabe();
		System.out.println("Objekt 2:");
	}

}
