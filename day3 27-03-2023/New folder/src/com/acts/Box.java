package com.acts;

public class Box {
	private int length, width, height;
	
	public Box(int length, int width, int height) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
	
	public String getDimenstions() {
		return ("Length: " + length + " Width: " + width + " Height: " + height);
	}
}