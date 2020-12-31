package lab6;

import java.util.Scanner;

//编写用于演示异常处理机制try-catch-finally的代码。
//在此程序中，当一个数字除以0时，将引发ArithmeticException异常，引发的异常被catch捕获。


public class Lab6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入x和y的值");
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
			System.out.println("发生了预知外的错误呢");
		}finally {
			System.out.println("阿巴阿巴阿巴 ");
		}
		
	}

}
