package lab3;

import java.util.Scanner;

//输入一串数字表示的QQ号码，
//然后用正则表达式判断其是否符合QQ号码规则:
//	长度为5到11位的数字，并且第一位不能为0。
public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入qq号");
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		String regex = "([1-9]{1})([0-9]{4,10})";
		if (id.matches(regex))
		{
			System.out.println("qq号符合规则");
		}
		else
		{
			System.out.println("qq号不符合规则");
		}
				
	}

}
