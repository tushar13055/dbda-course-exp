package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {

		Scanner tushar =new Scanner(System.in);
		int a=tushar.nextInt();
		System.out.println((a % 3 == 0) ? "fizz": (a % 5 == 0) ? "buzz" : "Not a multiple of 3 or 5");
		tushar.close();
	}
}