package geometrie;

public class ViereckDemo {

	public static void main(String[] args) {
		
		Viereck vr1 = new Viereck();
		Punkt[] punkte = new Punkt[4];
		punkte[0] = new Punkt(0,0);
		punkte[1] = new Punkt(3,0);
		punkte[2] = new Punkt(2,1);
		punkte[3] = new Punkt(1,1);
		Viereck vr2 = new Viereck(punkte);
		Viereck vr3 = new Viereck();
		System.out.println("Eingabe fuer Viereck");
		vr3.eingabe();
		Viereck vr4 = new Viereck(vr3);
		if(vr2.equal(vr1)) {
			System.out.println("Die Vierecke vr1 und vr2 sind gleich");
		} else {
			System.out.println("Die Vierecke sind ungleich");
		}
			
		if(vr3.equal(vr2)) {
			System.out.println("Die Vierecke vr2 und vr3 sind gleich");
		} else {
			System.out.println("Die Vierecke sind ungleich");
		}
		
		if(vr4.equal(vr3)) {
			System.out.println("Die Vierecke vr3 und vr4 sind gleich");
		} else {
			System.out.println("Die Vierecke sind ungleich");
		}
	}
}
