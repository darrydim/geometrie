package geometrie;

public abstract class GObjekt {
	protected int anzahl;
	protected String name;
	protected Punkt[] eckpunkte;
	protected double[] seiten;
	
	public GObjekt(String name, int anzahl) {
		this.name = name;
		this.anzahl = anzahl;
	}
	
	public abstract void eingabe();
	public abstract int kontrolle();
	public abstract double umfang();
	public abstract double flaeche();
	public abstract String art();
	public abstract void ausgabe();
	public abstract boolean equal(GObjekt g);
	
	public void seitenBerechnung() {
		int i,j;
		for(i=0; i<eckpunkte.length; i++) {
			if(i<eckpunkte.length - 1)
				j = i+1;
			else 
				j = 0;
				seiten[i] = Gerade.abstand(eckpunkte[i], eckpunkte[j]);
		}
	}	
}