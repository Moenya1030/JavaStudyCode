package lab2;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		for (int i=1;i<1001;i++)
		{
			for (int j=1;j<i-1;j++)
			{
				if (i%j==0)
					total+=j;
			}
			if (total==i)
			{
				System.out.print(i);
				System.out.print(' ');
			}
			total=0;
		}
	}
}
