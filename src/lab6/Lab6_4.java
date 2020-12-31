package lab6;

import java.util.Scanner;

public class Lab6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Scanner sc= new Scanner(System.in);
		System.out.println("ÊäÈëÒ»¸öÊıßÂ");
		int m = sc.nextInt();
		try {
			student.speak(m);
		}catch(MyException e){
			System.out.println(e.msg);
		}finally {
			System.out.println("°¢°Í°¢°Í°¢°Í°¢°Í°¢°Í°¢°Í");
		}
	}

}
