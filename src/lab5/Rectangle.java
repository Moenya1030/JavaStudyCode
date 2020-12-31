package lab5;

public class Rectangle implements compute{
	private double a;
	public void setA(double a)
	{
		this.a=a;
	}
	public double getA()
	{
		return this.a;
	}
	private double b;
	public void setB(double b)
	{
		this.b=b;
	}
	public double getB()
	{
		return this.b;
	}
	public double getArea()
	{
		return this.a*this.b;
	}
	public double getPerm()
	{
		return (this.a+this.b)*2;
	}
}
