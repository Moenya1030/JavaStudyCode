package lab5;

import java.util.Scanner; 

interface compute
{
	public double getArea();
	public double getPerm();
}

public class Lab5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir=new Circle();
		System.out.println("请输入圆的半径");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			if(sc.hasNextInt())
			{
				double radius=sc.nextDouble();
				cir.setRadius(radius);;
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("圆的半径为：" + cir.getRadius());
		System.out.println("圆的面积为：" + cir.getArea());
		System.out.println("圆的周长为：" + cir.getPerm());
		
		Triangle tri=new Triangle();
		System.out.println("请输入三角形边a");
		Scanner sc1 = new Scanner(System.in);
		while(true)
		{
			if(sc1.hasNextInt())
			{
				double a=sc1.nextDouble();
				tri.setA(a);
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("请输入三角形边b");
		Scanner sc2 = new Scanner(System.in);
		while(true)
		{
			if(sc2.hasNextInt())
			{
				double b=sc2.nextDouble();
				tri.setB(b);
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("请输入三角形边c");
		Scanner sc3= new Scanner(System.in);
		while(true)
		{
			if(sc3.hasNextInt())
			{
				double c=sc3.nextDouble();
				tri.setC(c);
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("三角形的三边分别为" + tri.getA() + " " + tri.getB() + " " + tri.getC());
		System.out.println("三角形的面积为"+tri.getArea());
		System.out.println("三角形的周长为"+tri.getPerm());
		
		Rectangle rec = new Rectangle();
		System.out.println("请输入矩形的长");
		Scanner sc4 = new Scanner(System.in);
		while(true)
		{
			if(sc4.hasNextInt())
			{
				double a=sc4.nextDouble();
				rec.setA(a);
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("请输入矩形的宽");
		Scanner sc5 = new Scanner(System.in);
		while(true)
		{
			if(sc5.hasNextInt())
			{
				double b=sc5.nextDouble();
				rec.setB(b);
				break;
			}
			else
				System.out.println("输入错误，请重新输入");
		}
		System.out.println("矩形的长宽分别为" + rec.getA() + " " + rec.getB());
		System.out.println("矩形的面积为"+rec.getArea());
		System.out.println("矩形的周长为"+rec.getPerm());
		}

}
