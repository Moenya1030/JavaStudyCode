package lab1;
import java.util.Scanner;
//ì³²¨ÄÇÆõÊýÁÐ
//F(1)=1£¬F(2)=1, F(n)=F(n - 1)+F(n - 2)£¨n ¡Ý 3£¬n ¡Ê N*£©

public class Lab1_3 {

	static int Fibonacci(int n)
	{
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Fibonacci(n));
	}

}
