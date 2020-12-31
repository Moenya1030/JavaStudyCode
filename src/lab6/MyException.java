package lab6;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public MyException (String errMsg)
	{
		msg=errMsg;
	}
	public String getMsg()
	{
		return msg;
	}
}
