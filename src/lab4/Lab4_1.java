package lab4;
//矩阵转置

import java.util.Scanner;
public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行和列");
		int line = sc.nextInt();
		int row = sc.nextInt();
		int matrix[][] = new int[line][row];
		System.out.println("请输入数据");
		for (int i = 0; i < line; i ++)
		{
			for (int j = 0; j < row; j ++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		int matrix1[][] = new int[row][line];
		for (int i = 0; i < row; i ++)
		{
			for (int j = 0; j < line; j ++)
			{
				matrix1[i][j] = matrix[j][i];
			}
		}
		
		for (int i = 0; i < row; i ++)
		{
			for (int j = 0; j < line; j ++)
			{
				System.out.print(matrix1[i][j]);
			}
			System.out.println();
		}
	}

}
