
public class Faculty extends Person {
	private int trainingExperience ;
	private String domain;
	private String firstName;
	private String lastName;
	private int age;

	public Faculty(String firstName, String lastName, int age, int trainingExperience,String domain){
		super(firstName, lastName, age);
		
		this.trainingExperience=trainingExperience;
		this.domain=domain;
		
	}
}
