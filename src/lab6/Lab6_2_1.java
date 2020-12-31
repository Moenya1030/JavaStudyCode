package lab6;

interface Car{
	void run();
}



public class Lab6_2_1 {
	
public static class CarTest implements Car
{
	public void run()
	{
		System.out.println("run");
	}
	public void carRun()
	{
		System.out.println("car run");
	}
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
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTest car = new CarTest();
		CarTest car1 = new CarTest();
		car1.run();
		car1.carRun();
		CarTest.innerCarTest innerCar = car.new innerCarTest();
		innerCar.run();
		innerCar.carRun();
	}

}
