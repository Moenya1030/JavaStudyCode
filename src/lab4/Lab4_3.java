package lab4;

import java.util.Arrays;
import java.util.Random;

//����10���1��6֮���������Ϊ�����ӵĽ����ͳ�Ƴ��ֵĸ�������1��2��3��4��5��6��������
//��4��5��6��С��1��2��3�����������������ǵĳ��ִ����Ƿ������ͬ��
public class Lab4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[7] ;
		Arrays.fill(num, 0);
		for (int i = 0; i < 1e6; i++)
		{
			Random rondom = new Random();
			int rom = rondom.nextInt(6) + 1;
			num[rom] ++;
		}
		for (int i = 1; i < 7; i++)
		{
			System.out.println("����" + i + "���ֵĴ���Ϊ" + num[i]);
		}
		Integer big = new Integer(num[4] + num[5] + num[6]);
		Integer small = new Integer(num[1] + num[2] + num[3]);
		System.out.println("�����ֳ��ֵĴ���Ϊ" + big);
		System.out.println("С���ֳ��ֵĴ���Ϊ" + small);
		System.out.println("�����Ƿ������ " + big.equals(small));
	}

}
