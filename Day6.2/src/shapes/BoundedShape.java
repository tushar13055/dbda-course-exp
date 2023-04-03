package shapes;

// if we have abstract method we need o add an abstract class, otherwwise we'll get an javac error69
public abstract class BoundedShape {
	private int x,y;
	
	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//over-ride toString, inherited from Object class, to replace hashcode verson by actuall details
	@Override
	public String toString() {
		return "x = " + x + " y = " + y;
	}
	
//	add a method to return computed area
	// abstract method declaration
	public abstract double area();
}
