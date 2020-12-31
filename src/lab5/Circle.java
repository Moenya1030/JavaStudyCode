package lab5;

public class Circle implements compute{
	private double radius;
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	public double getPerm()
	{
		return 2*Math.PI*this.radius;
	}
}
