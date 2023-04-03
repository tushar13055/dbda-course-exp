package inheritance;

public class Faculty extends Person {
	private int trainingExp;
	private String domain;

//add a ctor to init complete state of the Faculty
	public Faculty(String firstName, String lastName, int age, int exp, String domain) {
		super(firstName, lastName, age);
		System.out.println("in faculty ctor");
		trainingExp = exp;
		this.domain = domain;
	}

	// overriding form of the method : to get complete details of faculty
	public String toString() {
		return "Faculty " + super.toString() 
		+ " exp in years " + trainingExp + " expert in " + domain;
	}
	
	public String teach() {
		return getLastName() + " teaches " + domain + " training exp: " + trainingExp;
	}

}
