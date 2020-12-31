package lab2;

import java.util.Scanner;

public class Lab2_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Scanner input= new Scanner(System.in);
		System.out.println("请输入n：");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++)
		{
			 arr[i]=input.nextInt();  
		}
		
		int max=1,min=1;
		int sumUp=1;
		int sumDown=1;//一个计递增，另一个递减
		for (int i=1;i<n;i++)
		{
			if (arr[i]>arr[i-1])
			{
				sumUp++;
			}
			else 
			{
				if (sumUp>max)
				{
					max=sumUp;
					sumUp=1;
				}
			}
			if (arr[i]<arr[i-1])
			{
				sumDown++;
			}
			else
			{
				if (sumDown>min)
				{
					min=sumDown;
					sumDown=1;
				}
			}
		}
		
		if (max>min)
		{
			System.out.println(max);
		}
		else
		{
			System.out.println(min);
		}
	}
}
