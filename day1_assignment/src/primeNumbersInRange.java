import java.util.Scanner;

class PrimeNumbersInRange {
	public static void main(String args[]) {
		Scanner tushar = new Scanner(System.in);
		
		System.out.println("Enter range start");
		int start = tushar.nextInt();
		
		System.out.println("Enter range end");
		int end = tushar.nextInt();
		
		int i = 2;
		boolean flag = false;
		
		while(start <= end) {
			// prime number found
			if(start == i) {
				System.out.println(i);
			}
			flag = false;
			
			// not a prime number, continue checking with other number
			if((start % i) == 0) {
				start++;
				i = 2;
				flag = true;
			}
			
			if(flag == false) {
				i++;
				flag = false;
			}
		}
		tushar.close();
	}
}
