package enums;

import java.util.Scanner;

public class TestEnum {
	public static void main(String[] args) {
		for(Color c: Color.values()) {
//			System.out.println(c);
			try(Scanner sc = new Scanner(System.in)) {
				Color chosenColor = Color.valueOf(sc.next());
				System.out.println("You chose " + chosenColor.name());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("hey");
		}
	}
}
