package lab6;

public class Student {
	public void speak(int m) throws MyException{
		if(m>1000)
		{
			throw new MyException("求求你了，数字不要超过1000可以吗");
		}
	}
}
