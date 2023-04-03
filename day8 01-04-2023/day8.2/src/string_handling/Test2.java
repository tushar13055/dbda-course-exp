package string_handling;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// important 
		String s1= new String("Hello");
		String s2= new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3=new String("HELLO");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
	}

}
