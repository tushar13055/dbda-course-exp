package exceptionhandling;

import java.util.Scanner;

import static utils.ValidationRules.validateSpeed;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter complete name");
//			System.out.println("Hello" + sc.nextLine());
//			Thread.sleep(1000);
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over...");

	}

}
