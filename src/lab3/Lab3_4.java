package lab3;
import java.util.Random;
//模仿P103例5.28测试StringBuilder的执行效率，并进行修改
//要求生成的随机字符串长度为10000，由大写小写字母以及数字构成。
public class Lab3_4 {
	
	public static void main(String[] args) {
		String str = "";
		String newStr="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		long startTime = System.currentTimeMillis();	
		for (int i = 0; i < 10000; i++)
		{
			Random random = new Random();
			int s = random.nextInt(62);
			str += newStr.charAt(s);
		}
		System.out.println(str);
		long endTime = System.currentTimeMillis();
		System.out.println("消耗时间为：" + (endTime - startTime));
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			Random random = new Random();
			int s = random.nextInt(62);
			builder.append(newStr.charAt(s));
		}
		endTime = System.currentTimeMillis();
		System.out.println("消耗时间为：" + (endTime - startTime));
	}
}
