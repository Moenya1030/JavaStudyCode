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
		System.out.println("������Բ�İ뾶");
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
				System.out.println("�����������������");
		}
		System.out.println("Բ�İ뾶Ϊ��" + cir.getRadius());
		System.out.println("Բ�����Ϊ��" + cir.getArea());
		System.out.println("Բ���ܳ�Ϊ��" + cir.getPerm());
		
		Triangle tri=new Triangle();
		System.out.println("�����������α�a");
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
				System.out.println("�����������������");
		}
		System.out.println("�����������α�b");
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
				System.out.println("�����������������");
		}
		System.out.println("�����������α�c");
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
				System.out.println("�����������������");
		}
		System.out.println("�����ε����߷ֱ�Ϊ" + tri.getA() + " " + tri.getB() + " " + tri.getC());
		System.out.println("�����ε����Ϊ"+tri.getArea());
		System.out.println("�����ε��ܳ�Ϊ"+tri.getPerm());
		
		Rectangle rec = new Rectangle();
		System.out.println("��������εĳ�");
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
				System.out.println("�����������������");
		}
		System.out.println("��������εĿ�");
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
				System.out.println("�����������������");
		}
		System.out.println("���εĳ���ֱ�Ϊ" + rec.getA() + " " + rec.getB());
		System.out.println("���ε����Ϊ"+rec.getArea());
		System.out.println("���ε��ܳ�Ϊ"+rec.getPerm());
		}

}
