package lab6;


public class Lab6_2_2 {
	
public static class CarTest implements Car
{
	public void run()
	{
		class innerCarTest
		{
			public innerCarTest() {
			}
			void run()
			{
				System.out.println("run run run");
			}
			void carRun()
			{
				System.out.println("car run run run");
			}
		}
		innerCarTest inner = new innerCarTest();
		System.out.println("run");
		inner.run();
		inner.carRun();
	}
	public void carRun()
	{
		System.out.println("car run");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTest car1 = new CarTest();
		car1.run();
		car1.carRun();
	}

}
