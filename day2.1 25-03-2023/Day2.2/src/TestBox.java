import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tushar = new Scanner(System.in);
		Box box = new Box(1.1, 2, 3.1);
		Box newBox = new Box(124.12, 24.214, 2.2);
		System.out.println(newBox.getVolume());
		System.out.println(newBox.getDimentions());
		Box b2=box;
		box = null;
		//System.out.println(box.getDimentions());
		System.out.println(b2.getDimentions());
		
		tushar.close();
	} 
}