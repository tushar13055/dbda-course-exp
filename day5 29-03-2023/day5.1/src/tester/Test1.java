package tester;

import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
		//below is e.g. of direct referening 
		//when type of ref is same as type of instance :direct referecing
		Student s1 = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);
		//Faculty f1=new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");
		System.out.println(s1.toString());
		System.out.println(s1);
		Person p;
		p=s1;
		//upcasting :javac does it implictly : Student is a person:extends
//		System.out.println(f1.getDetails());
		System.out.println(p);
	}

}
