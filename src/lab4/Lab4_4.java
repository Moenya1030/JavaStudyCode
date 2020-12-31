package lab4;

import java.math.BigInteger;
import java.math.*;
import java.util.Random;

//计算两个长度不小于20位的大整数的和、差，并计算第一个大整数的前10个因子（不包括1和本身）
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
	}//牛顿迭代法求平方根
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";
		String str2 = "";
		String str = "1234567890";
		String strr = "123456789";
		//确定首位不为0
		for (int i = 0; i < ((int)20 + (int)(Math.random() * 10)); i++)//生成20-30位数
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
		for (int i = 0; i < ((int)20 + (int)(Math.random() * 100)); i++)//生成21-120位数
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
		System.out.println("两个数的和为" + numAdd);
		System.out.println("两个数差和为" + numSub);
		System.out.println("num2除以num1等于" + div + "余" + rem);
		
		long startTime = System.currentTimeMillis();	
		int count = 0;
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(num1) < 0; i = i.add(BigInteger.valueOf(1)))
		{
			if (num1.remainder(i).equals(BigInteger.valueOf(0)))
			{
				count ++;
				System.out.println(num1 + "的第"  + count + "个因子是" + i);
				if (count == 10)
				{
					break;
				}
				if (i.equals(SqrtByNewton(num1, BigInteger.valueOf(0))))//当遍历到num1时退出，为素数；或者不够10个因子
				{
					if (count == 0)
						System.out.println(num1 + "为素数");
					System.out.println("共有" + count + "个因子");
					break;
				}
			}
		}
		long endTime = System.currentTimeMillis();	
		System.out.println("花费时间为" + (endTime - startTime));//如果没有10个因子，就要花很多时间
	//这里查到了用费马小定理、QS筛法啥的，可是不太会，只能用暴力筛法了
	}

}
