package com.acts.tester;

import com.acts.Point2D;
import java.util.Scanner;

class TestCordinates {
	public static void main(String[] args) {
		Scanner tushar = new Scanner(System.in);
		
//		int xCordinate, int yCordinate;
		
//		System.out.println("Enter xCordinate: ");
//		xCordinate = tushar.nextInt();
//		System.out.println("Enter yCordinate: ");
//		yCordinate = tushar.nextInt();
//		
		Point2D point1 = new Point2D(tushar.nextInt(), tushar.nextInt());
		Point2D point2 = new Point2D(tushar.nextInt(), tushar.nextInt());
		
		System.out.println(point1.areCordinatesEqual(point2));
		tushar.close();
	}
}