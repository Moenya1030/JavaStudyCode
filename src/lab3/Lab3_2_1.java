//这里试了很多方法都越界了
//String index out of range: 0

package lab3;
import java.util.Scanner;
public class Lab3_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串：");  
		Scanner input = new Scanner(System.in);
		String instr = input.nextLine();
		int total = 0;
		char str = instr.charAt(0);
//		while (instr != "" || "".equals(instr))
		while (1 > 0) //这里想用while(1)可是不能convert from int to boolean
		{
			if (instr.length() > 0)
			{
				for (int i = 0; i < instr.length(); i++)
				{
					if (str == instr.charAt(i))
					{
						total += 1;
					}
				}
				System.out.println(str + " " + total);
				total = 0;
				instr = instr.replace(String.valueOf(str), "");
				str = instr.charAt(0);
			}
			else
			{
				break;
			}
		}
		
	}

}
