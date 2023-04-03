package Array;

public class Box {
	private int length, width, height;
	
	Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public String getBoxDimentions() {
		return ("Length: " + this.length + " Width: " + this.width + " Height: " + this.height);
	}
	
	public int getBoxVolume() {
		return this.length * this.width * this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
