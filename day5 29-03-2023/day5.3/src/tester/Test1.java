package tester;
import java.util.Scanner;
import inheritance.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	
	Person[] participants=new Person[sc.nextInt()];
	boolean exit=false;
	int counter=0;
	while(!exit) {
		System.out.println("1 register student 2 register facluty 3 display all deatils 4 display specific 0 exit");
	switch(sc.nextInt()) {
	case 1: 
		System.out.println("enter fname,lname age roll no couse  fees marks");
		participants[counter++]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
		break;
	case 2: 
		participants[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
		break;
	case 3: 
		for(Person p:participants)
			System.out.println(p);
			
		break;
	case 4: 
		int index=sc.nextInt()-1;
		System.out.println("specific participant detatails ");
		System.out.println(participants[index]);
		break;
	case 0: 
		exit=true;
		break;
	}
	}
}}
