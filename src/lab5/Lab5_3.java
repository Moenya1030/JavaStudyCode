package lab5;
//编写一个包含final变量、final static变量、final方法等知识的综合案例


final class circle
{
	final double PI=3.14159;
	private double radius;
	circle()
	{
		this.radius=1;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea(double radius)
	{
		return PI*radius*radius;
	}
}
public class Lab5_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cir=new circle();
		cir.setRadius(3);
		System.out.println(cir.getRadius());
		System.out.println(cir.getArea(cir.getRadius()));
		cir.setRadius(4);
		System.out.println(cir.getRadius());
		System.out.println(cir.getArea(cir.getRadius()+1));
		final double PI=3.14;
		System.out.println(PI);
		System.out.println(cir.PI);
		//cir.PI=3;The final field circle.PI cannot be assigned
		//PI=3.142;The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
		
	}

}
