package lab6;

import java.util.Scanner;

//��д������ʾ�쳣�������try-catch-finally�Ĵ��롣
//�ڴ˳����У���һ�����ֳ���0ʱ��������ArithmeticException�쳣���������쳣��catch����


public class Lab6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������x��y��ֵ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		Captor captor = new Captor();
		try {
			double result = captor.quotient(x, y);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println(e.msg);
		}
		catch(Exception e) {
			System.out.println("������Ԥ֪��Ĵ�����");
		}finally {
			System.out.println("���Ͱ��Ͱ��� ");
		}
		
	}

}
