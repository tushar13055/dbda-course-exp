package string_handling;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hello12345");
		System.out.println(s);
		System.out.println(s.substring(3,6));
		System.out.println(s.contains("123") ? "yes" : "no");
		
		
		
		
		System.out.println(s.charAt(0)+ " "+s.charAt(s.length()-1));
		System.out.println();
	}

}