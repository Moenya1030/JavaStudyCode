//∫∫≈µÀ˛
package lab1;

import java.util.Scanner;

public class Lab1_4 {
	static void  hanoi(int n, char from, char temp, char to)
	{
		if (n == 1)
		{
			move(1, from, to);
		}
		else
		{
			hanoi(n-1, from, to, temp);
			move(n, from ,to);
			hanoi(n-1, temp, from, to);
		}
	}
	
	static void move(int n, char from, char to)
	{
		System.out.println(n + "  from " + from + " to " + to);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("«Î ‰»Î≈Ã◊” ˝£∫");  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hanoi(n, 'A', 'B', 'C');
	}

}
