package Array;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size  array: ");
		double[] data = new double[sc.nextInt()];
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("Enter array element");
			data[i] = sc.nextDouble();
		}
		
		for(double d: data) {
			System.out.println(d);
		}
	}

}
