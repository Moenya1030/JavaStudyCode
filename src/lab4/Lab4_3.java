package lab4;

import java.util.Arrays;
import java.util.Random;

//生成10万个1到6之间的整数作为扔骰子的结果，统计出现的各个数字1、2、3、4、5、6的数量，
//大（4、5、6）小（1、2、3）的数量，分析它们的出现次数是否大致相同。
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
			System.out.println("数字" + i + "出现的次数为" + num[i]);
		}
		Integer big = new Integer(num[4] + num[5] + num[6]);
		Integer small = new Integer(num[1] + num[2] + num[3]);
		System.out.println("大数字出现的次数为" + big);
		System.out.println("小数字出现的次数为" + small);
		System.out.println("它们是否相等呢 " + big.equals(small));
	}

}
