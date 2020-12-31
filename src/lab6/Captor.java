package lab6;

public class Captor{
	public double quotient(double x, double y) throws ArithmeticException{
		if(y == 0) {
			throw new ArithmeticException("除数不能为0");
		}
		else {
			return x/y;
		}
	}
}