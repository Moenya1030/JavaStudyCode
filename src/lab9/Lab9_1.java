package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		System.out.println("请输入你要添加的单词的个数");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("请输入你要添加的单词");
			Scanner sc1 = new Scanner(System.in);
			String str = sc1.next();
			list.add(str);
		}
	
		System.out.println("单词为");
		for(int i=0 ; i<n; i++)
		{
			System.out.println(list.get(i) + " ");
		}
		
		char ch0='y';
		int ch1;
		while(ch0 == 'y')
		{
			System.out.println("请输入你要进行的操作:添加'0',删除'1'");
			Scanner chh = new Scanner(System.in);
			int ch = chh.nextInt();
			if(ch == 0)
			{
				System.out.println("请输入你要添加的单词");
				Scanner scc1 = new Scanner(System.in);
				String strr = scc1.next();
				list.add(strr);
			}
			else if(ch == 1)
			{
				int flag=1;
				System.out.println("请输入你要删除的单词");
				Scanner scc2 = new Scanner(System.in);
				String strr1 = scc2.next();
				for(int i=0; i<1000 ; i++)
				{
					if(list.get(i).equals(strr1))
					{
						flag=0;
						System.out.println("单词已删除");
						list.remove(i);
						break;
					}
				}
				if(flag == 1)
				{
					System.out.println("不存在该单词");
				}
			}
			else
			{
				System.out.println("你怎么不按操作来，byebye");
				break;
			}
			
			System.out.println("单词为");
			for(int i=0 ; i<n; i++)
			{
				System.out.print(list.get(i) + " ");
			}
			
			System.out.println("是否继续，是'y'");
			Scanner ch00 = new Scanner(System.in);
			ch0 = ch00.next().charAt(0);
		}
	}

}
