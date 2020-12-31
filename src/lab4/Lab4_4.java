package lab4;

import java.math.BigInteger;
import java.math.*;
import java.util.Random;

//�����������Ȳ�С��20λ�Ĵ������ĺ͡���������һ����������ǰ10�����ӣ�������1�ͱ���
public class Lab4_4 {

	public static BigInteger SqrtByNewton(BigInteger target,BigInteger eps)
	{        
		BigInteger Xa= target;
		BigInteger Xb;        
		do {
			Xb = Xa;
			Xa = Xa.add(target.divide(Xa)).divide(BigInteger.valueOf(2));
			} while (Xa.subtract(Xb).compareTo(eps) > 0 || Xb.subtract(Xa).compareTo(eps) > 0);        
		return Xa;
	}//ţ�ٵ�������ƽ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";
		String str2 = "";
		String str = "1234567890";
		String strr = "123456789";
		//ȷ����λ��Ϊ0
		for (int i = 0; i < ((int)20 + (int)(Math.random() * 10)); i++)//����20-30λ��
		{
			if (i > 0)
			{
				Random random1 = new Random();
				int s1 = random1.nextInt(10);
				str1 += str.charAt(s1);
			}
			else
			{
				Random random = new Random();
				int s = random.nextInt(9);
				str1 += strr.charAt(s);
			}
		}
		for (int i = 0; i < ((int)20 + (int)(Math.random() * 100)); i++)//����21-120λ��
		{
			if (i > 0)
			{
				Random random2 = new Random();
				int b1 =random2.nextInt(10);
				str2 += str.charAt(b1);
			}
			else
			{
				Random random = new Random();
				int b =random.nextInt(9);
				str2 += strr.charAt(b);
			}
		}
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		System.out.println("num1=" + num1 + " " + "num2=" + num2);
	
		BigInteger numAdd = num1.add(num2);
		BigInteger numSub = num1.subtract(num2);
		BigInteger div = num2.divide(num1);
		BigInteger rem = num2.divideAndRemainder(num1)[1];
		System.out.println("�������ĺ�Ϊ" + numAdd);
		System.out.println("���������Ϊ" + numSub);
		System.out.println("num2����num1����" + div + "��" + rem);
		
		long startTime = System.currentTimeMillis();	
		int count = 0;
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(num1) < 0; i = i.add(BigInteger.valueOf(1)))
		{
			if (num1.remainder(i).equals(BigInteger.valueOf(0)))
			{
				count ++;
				System.out.println(num1 + "�ĵ�"  + count + "��������" + i);
				if (count == 10)
				{
					break;
				}
				if (i.equals(SqrtByNewton(num1, BigInteger.valueOf(0))))//��������num1ʱ�˳���Ϊ���������߲���10������
				{
					if (count == 0)
						System.out.println(num1 + "Ϊ����");
					System.out.println("����" + count + "������");
					break;
				}
			}
		}
		long endTime = System.currentTimeMillis();	
		System.out.println("����ʱ��Ϊ" + (endTime - startTime));//���û��10�����ӣ���Ҫ���ܶ�ʱ��
	//����鵽���÷���С����QSɸ��ɶ�ģ����ǲ�̫�ᣬֻ���ñ���ɸ����
	}

}
