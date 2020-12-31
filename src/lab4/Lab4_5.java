package lab4;
//乘积C的第i行第j列的元素C[i][j] 等于矩阵A的第i行的元素与矩阵B的第j列对应元素乘积之和。
public class Lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr1 ={{1,2,3,4},{2,3,4,5}};
	    int[][] intArr2 ={{1,2},{3,4},{5,6},{7,8}}; 
	    int[][] arr = new int[2][2];
	    int total = 0;
	    for (int i = 0; i < 2; i++)
	    {
	    	for (int j = 0; j < 2; j++)
	    	{
	    			for (int k = 0; k < 4; k++)
	    			{
	    				total += intArr1[i][k] * intArr2[k][j];
	    			}
	    			arr[i][j] += total;
	    			total = 0;
	    	}
	    }
	    
	    for (int i = 0; i < 2; i++)
	    {
	    	for (int j = 0; j < 2; j++)
	    	{
	    		System.out.print(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	}

}
