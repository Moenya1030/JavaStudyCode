package lab6;

public class ArithmeticException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public ArithmeticException(String errMsg)
	{
		msg=errMsg;
	}
	public String getMsg()
	{
		return msg;
	}
}