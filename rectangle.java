
public class rectangle extends shape{
	
	private double side1;
	private double side2;
	
	public rectangle(String n,double s1, double s2)
	{
		super(n);
		side1=s1;
		side2=s2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double area()
	{
		double area = side1*side2;
		return area;
	}
	
	public double perimeter()
	{
		return 2*side1*side2;
	}

}
