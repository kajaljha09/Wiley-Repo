
public class Circle {
	int radius;
	double area;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public double calculateArea() {
		area=Math.PI*Math.pow(radius,2);
		return area;
	}

}
