package lab5;

public class Triangle implements compute{
	private double a,b,c;
	public void setA(double a)
	{
		this.a=a;
	}
	public double getA()
	{
		return this.a;
	}
	public void setB(double b)
	{
		this.b=b;
	}
	public double getB()
	{
		return this.b;
	}
	public void setC(double c)
	{
		this.c=c;
	}
	public double getC()
	{
		return this.c;
	}
	public boolean ifTriangle(double a,double b,double c)
	{
		if(a+b>c || a+c>b || b+c>a)
		{
			System.out.println("构成三角形");
			return true;
		}
		else
		{
			System.out.println("不构成三角形");
			return false;
		}
	}
	public double getArea()
	{
		double p=(this.a+this.b+this.c)/2;
		return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
	}
	public double getPerm()
	{
		return this.a+this.b+this.c;
	}
}
