package Test1;
import java.util.Scanner;
import inheritance.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of player to register ");
	Players[] p1 = new Players[sc.nextInt()];
	boolean exit=false;
	int counter=0;
	
	while(!exit) {
		System.out.println("1 register FootBall 2 register crickeyplayer 3 display all deatils 4 display specific 0 exit");
	switch(sc.nextInt()) {
	case 1: 
		if (counter < p1.length) {
		System.out.println("enter fname,lname age roll no couse  fees marks");
		p1[counter++] = new FootBall(sc.next(),sc.nextInt(),sc.next(), sc.nextInt(),sc.nextInt());
		break;
		}
		else {
			System.out.println("event full");
		}
		
	case 2: 
		if (counter < p1.length) {
		p1[counter++]=new CricketPlayer(sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		break;}
		else {
			System.out.println("event full");
		}
		
		
	case 3: 
		for (Players p : p1)
			if (p != null)
				p.play();
		
		break;
	case 4: 
		System.out.println("enter player no");
		int index=sc.nextInt()-1;
		System.out.println("specific participant detatails ");
		System.out.println(p1[index]);
		break;
	case 0: 
		exit=true;
		break;
	}
	}
}}