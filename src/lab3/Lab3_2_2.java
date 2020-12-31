package lab3;

import java.util.Scanner;

public class Lab3_2_2 {
	public static void main(String[] args) {
		//输入字符串并将字母均转化为大写
		System.out.println("请输入字符串");
		Scanner sc = new Scanner(System.in);
		String instr = sc.nextLine();
		instr = instr.toUpperCase();

		char charArray[] = new char[instr.length()]; 
		int total[] = new int[instr.length()]; 
		for(int i = 0;  i < instr.length(); i++)
		{
			total[i] = 1;
		}

		for(int i = 0;  i < instr.length(); i++)
		{
			charArray[i] = instr.charAt(i);
			for(int j = 0;  j < i;  j++)
			{
				if(charArray[i] == charArray[j])
				{
					total[j] ++;
					total[i] = 0;
					break;
				}
			}
		}
		
		for(int a=0; a < instr.length(); a++)
		{
			if(total[a] > 0) 
			{
				System.out.print(charArray[a] + " " + total[a] + "\n");
			}		
		}
	}

}
