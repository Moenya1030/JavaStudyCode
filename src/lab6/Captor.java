package lab6;

public class Captor{
	public double quotient(double x, double y) throws ArithmeticException{
		if(y == 0) {
			throw new ArithmeticException("��������Ϊ0");
		}
		else {
			return x/y;
		}
	}
}