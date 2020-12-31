package lab5;

public class Rectangle {
	private double length;
	private double width;
	Rectangle()
	{
		this.length=0;
		this.width=0;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getArea()
	{
		return this.length*this.width;
	}
}
