package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		System.out.println("��������Ҫ��ӵĵ��ʵĸ���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("��������Ҫ��ӵĵ���");
			Scanner sc1 = new Scanner(System.in);
			String str = sc1.next();
			list.add(str);
		}
	
		System.out.println("����Ϊ");
		for(int i=0 ; i<n; i++)
		{
			System.out.println(list.get(i) + " ");
		}
		
		char ch0='y';
		int ch1;
		while(ch0 == 'y')
		{
			System.out.println("��������Ҫ���еĲ���:���'0',ɾ��'1'");
			Scanner chh = new Scanner(System.in);
			int ch = chh.nextInt();
			if(ch == 0)
			{
				System.out.println("��������Ҫ��ӵĵ���");
				Scanner scc1 = new Scanner(System.in);
				String strr = scc1.next();
				list.add(strr);
			}
			else if(ch == 1)
			{
				int flag=1;
				System.out.println("��������Ҫɾ���ĵ���");
				Scanner scc2 = new Scanner(System.in);
				String strr1 = scc2.next();
				for(int i=0; i<1000 ; i++)
				{
					if(list.get(i).equals(strr1))
					{
						flag=0;
						System.out.println("������ɾ��");
						list.remove(i);
						break;
					}
				}
				if(flag == 1)
				{
					System.out.println("�����ڸõ���");
				}
			}
			else
			{
				System.out.println("����ô������������byebye");
				break;
			}
			
			System.out.println("����Ϊ");
			for(int i=0 ; i<n; i++)
			{
				System.out.print(list.get(i) + " ");
			}
			
			System.out.println("�Ƿ��������'y'");
			Scanner ch00 = new Scanner(System.in);
			ch0 = ch00.next().charAt(0);
		}
	}

}
