package lab3;

import java.util.Scanner;

//����һ�����ֱ�ʾ��QQ���룬
//Ȼ����������ʽ�ж����Ƿ����QQ�������:
//	����Ϊ5��11λ�����֣����ҵ�һλ����Ϊ0��
public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������qq��");
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		String regex = "([1-9]{1})([0-9]{4,10})";
		if (id.matches(regex))
		{
			System.out.println("qq�ŷ��Ϲ���");
		}
		else
		{
			System.out.println("qq�Ų����Ϲ���");
		}
				
	}

}
