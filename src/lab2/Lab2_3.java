package lab2;
/*
这串代码废了。
*/
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入n：");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int total[]=new int[n]; //total数组计数
		for (int i=0;i<n;i++)
		{
			total[i]=0;
		}
		for (int i=0;i<n;i++)
		{
			 arr[i]=new Scanner(System.in).nextInt();  
		}
		
		int start=0;
		int end=0;
		
		for (int i=0;i<n;i++)
		{
			if (i==0)
			{
				if (arr[i]<arr[i+1])
				{
					start=i;
					for (int j=i;j<n;j++)
					{
						if (arr[j+1]>arr[j])
						{
							end=j;
							break;
						}
					}
				}
				else if (arr[i]>arr[i+1])
				{
					for (int j=i;j<n;j++)
					{
						if (arr[j+1]<arr[j])
						{
							end=j;
						}
						break;
					}
				}
				else
				{
					if (arr[i]<arr[i+1] && arr[i-1]<arr[i])
					{
						start=i;
						for (int j=i;j<n;j++)
						{
							if (arr[j+1]>arr[i])
							{
								end=j;
							}
							break;
						}
						
					}
					else if (arr[i]>arr[i+1] && arr[i-1]>arr[i])
					{
						for (int j=i;j<n;j++)
						{
							if (arr[j+1]<arr[i])
							{
								end=j;
							}
							break;
						}	
					}
					break;
				}
			}		
		}
		System.out.println(end-start);
	}

}
