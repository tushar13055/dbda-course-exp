package inheritance;

public abstract class Players {
	private String name;
	private int age;
	private String Country;
	
	public Players(String name, int age,String Country) {
		System.out.println("in Player ctor");
		this.name=name;
		this.age=age;
		this.Country=Country;
	}
	public String toString() {
		return name+" "+age;
	}
	public abstract void play();
	
}
