package inheritance;

public class Player {
	private String name;
	private int age;
	private String country;
	private int graceMarks =10;
	public Player(String name,int age,String country ,int graceMarks)
	{
		System.out.println("in player ctor");
		this.name=name;
		this.country=country;
		this.age=age;
		this.graceMarks=graceMarks;
	}
	//add overloaded def arg less ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//add a method to ret complete details
	public String getDetails()
	{
		return "name : "+this.name +" age : "+this.age+"country: "+this.country;
	}
}