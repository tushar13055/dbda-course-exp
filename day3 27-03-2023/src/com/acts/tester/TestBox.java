package com.acts.tester;
import com.acts.Box;

class TestBox {
	public static void main(String[] args) {
		Box b1 = new Box(1,2,4);
		Box b2 = new Box(4);
		Box b4 = new Box(1,2,4);
		Box dummyBox = new Box();
//		boolean status =b1.isEqual(b4);
		System.out.println(dummyBox.getDimenstions());
//		System.out.println(status);
		System.out.println();
		
		System.out.println(b1.isEqual(b4) ? "Same boxes" : "Different boxes");
	}
}