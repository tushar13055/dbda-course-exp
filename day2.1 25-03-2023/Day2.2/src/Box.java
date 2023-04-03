public class Box {
	private double width, height, depth;
	
	Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	String getDimentions() {
		return ("Height: " + height  + " Width: " + width + " Depth: " + depth);
	}
	
	double getVolume() {
		return height * width * depth;
	}
}