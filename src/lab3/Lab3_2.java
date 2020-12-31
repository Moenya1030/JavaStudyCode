//The method replace(char, char) in the type String is not applicable for the arguments (char, String)

package lab3;
import java.util.Scanner;
//统计从对键盘输入的一大段内容中所有不同符号的个数（可能字母数字或其他符号，其中字母不分大小写）。
public class Lab3_2 {

	static void totalStr(String str)
	{
		int len = str.length();
		if (len > 0)
		{
			int total = 1;
			char start = str.charAt(0);
			for (int i = 1; i < len; i++)
			{
				if (start == str.charAt(i))
				{
					total += 1;
				}
			}
			System.out.println(start + " " + total);
			total = 1;
			String regex = String.valueOf(start);
			str = str.replaceAll(regex,  "");
			totalStr(str);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串：");  
		Scanner input = new Scanner(System.in);
		String instr = input.nextLine();
		totalStr(instr);
		}
	}

