package geometrie;
public class Punkt {
	protected double x,y;
	
	public Punkt (){
		x=0; y=0;
	}
	
	public Punkt(double xN, double yN) { 
		x = xN; 
		y = yN; 
	}
	
	public Punkt (Punkt p){
		x=p.x; y=p.y;
	}
	
	public void eingabe() {
		System.out.println("Eingabe fuer einen Punkt");
		System.out.println("Eingabe x=");
		x = Hilfe.sc.nextDouble();
		System.out.println("Eingabe von y");
		y = Hilfe.sc.nextDouble();	
	}
	
	public void move(double delx, double dely) {
		x = x + delx;
		y = y + dely;
	}
	
	public Punkt moveNew(double delx, double dely) {
		double xp = x + delx;
		double yp = y + dely;
		return new Punkt(xp, yp);
	}
	
	public String toString() {
		return "("+ x +", "+ y +")";
	}
	
	public void ausgabe() {
		System.out.println(this);
	}
	
	boolean equal(Punkt z1) {
		if((x==z1.x)&&(y==z1.x))
		return true;
		else
			return false;
	}
}

