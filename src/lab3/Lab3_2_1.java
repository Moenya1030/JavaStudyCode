//�������˺ܶ෽����Խ����
//String index out of range: 0

package lab3;
import java.util.Scanner;
public class Lab3_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ַ�����");  
		Scanner input = new Scanner(System.in);
		String instr = input.nextLine();
		int total = 0;
		char str = instr.charAt(0);
//		while (instr != "" || "".equals(instr))
		while (1 > 0) //��������while(1)���ǲ���convert from int to boolean
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
