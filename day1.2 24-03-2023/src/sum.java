import java.util.Scanner;

class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(addTwoNumbers(num1, num2));
		
		sc.close();
	}
	
	private static int addTwoNumbers(int num1, int num2) {
		return num1 * num2;
	}
}
