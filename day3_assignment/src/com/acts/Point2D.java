package com.acts;

public class Point2D {
	private int xCordinate, yCordinate;
	
	public Point2D(int xCordinate, int yCordinate) {
		this.xCordinate = xCordinate;
		this.yCordinate = yCordinate;
	}
	
	public String showCordinates() {
		return ("xCordinate: " + xCordinate + " yCordinate: " + yCordinate);	
	}
	
	public boolean areCordinatesEqual(Point2D point2) {
		return (this.xCordinate == point2.xCordinate) && (this.yCordinate == point2.yCordinate);
	}
}