package lab3;
import java.util.Random;
//ģ��P103��5.28����StringBuilder��ִ��Ч�ʣ��������޸�
//Ҫ�����ɵ�����ַ�������Ϊ10000���ɴ�дСд��ĸ�Լ����ֹ��ɡ�
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
		System.out.println("����ʱ��Ϊ��" + (endTime - startTime));
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			Random random = new Random();
			int s = random.nextInt(62);
			builder.append(newStr.charAt(s));
		}
		endTime = System.currentTimeMillis();
		System.out.println("����ʱ��Ϊ��" + (endTime - startTime));
	}
}
