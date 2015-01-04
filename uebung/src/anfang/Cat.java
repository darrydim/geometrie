package anfang;

public class Cat {
	protected String name;
	protected String colour;
	
	public Cat(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}
	
	public Cat() {
		this.name = "Kitty";
		this.colour = "gray";
	}
	
	public void miewing() {
		System.out.println("The cat" +this.name+ "says Mieww");
	}
}
