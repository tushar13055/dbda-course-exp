import java.util.*;

class Tecaner {

	public static void main(String[] args) {
		//make an instance of an scanner
		
		Scanner tushar = new Scanner(System.in);
		// print an msg to take input of a number
		System.out.println("number de");
		// scan /take a number from user
		int i =tushar.nextInt();
		int j =tushar.nextInt();
		// write an for loop to print numbers
		
		while (i<j) {
			System.out.println("Number " + (i++));
			System.out.print("Number " + (i));
		}
			
			
		
		tushar.close();
		
	}
}
