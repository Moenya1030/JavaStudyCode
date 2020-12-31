package lab2;
import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
//		int year,month,day;
		int total=0;
		System.out.println("请输入年份：");
		Scanner sc1= new Scanner(System.in);
		int year = sc1.nextInt();
		if (year%4==0 && year%400!=0)
		{
			days[1]++;
		}
		System.out.println("请输入月份：");
		Scanner sc2= new Scanner(System.in);
		int month = sc2.nextInt();
		System.out.println("请输入哪天：");
		Scanner sc3= new Scanner(System.in);
		int day = sc3.nextInt();
		for (int i=0;i<month-1;i++)
		{
			total+=days[i];
		}
		total+=day;
		System.out.println("这一天是这一年的第"+total+"天");
	}

}

