import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {
	
	 public static void main(String[] args) {
		 int[] arr = new int[4];
		 Scanner tushar = new Scanner(System.in);
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(i >= arr.length / 2) {
				 arr = increaseArraySize(arr);
				 System.out.println(Arrays.toString(arr));
			 }
			 arr[i] = tushar.nextInt();
		 }
		 System.out.println(arr);
	 }
	 
	 public static int[] increaseArraySize(int[] arr) {
		 int[] extendedArray = new int[arr.length * 2];
		 
		 for(int i = 0; i < arr.length; i++) {
			 extendedArray[i] = arr[i];
		 }
		 return extendedArray;
	 }
}
