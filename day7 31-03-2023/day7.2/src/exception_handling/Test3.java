package exception_handling;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		int[] data = {10, 20, 30, 40, 50};
//	//	System.out.println(data[5]);
//	//	System.out.println("int value " + Integer.parseInt("abc"));
//		int num = 100;
//		int den = 9;
//		System.out.println("Res " + (num / den));
//		String s = null;
//		System.out.println("char at 0th index" + s.charAt(0));
//		System.out.println("main over");
//	}

		
		System.out.println("main over");
		Thread.sleep(500);
		System.out.println("over main ");
		int a[]={1,2,3,4};
		try {
			System.out.println(a[8]);
			}
		catch(Exception e) {
		 System.out.println("loduuuu gandu padai karle bsdwale "+e.getMessage());           	
		}
}}

//). "The quick brown fox jumps over the lazy dog"

