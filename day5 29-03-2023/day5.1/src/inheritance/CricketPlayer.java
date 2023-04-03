package inheritance;

public class CricketPlayer extends  Player{
	private int runs;
	private int graceMarks=15;

//add a ctor to init complete state of the Faculty
	public CricketPlayer(String name, int age,String country,int runs,int graceMarks) {
		super(name, age, country,graceMarks);
		System.out.println("in Cricket ctor");
		//ctor==construtor
		this.runs = runs;
	}
	
	public String getDetails() {
		//method overriding
		return "Player " +super.getDetails() +" "+ runs+" grace marks"+ graceMarks;
 	}
}
