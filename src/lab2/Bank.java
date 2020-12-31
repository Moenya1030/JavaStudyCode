package lab2;
//要求能够存放用户的账号、姓名、密码和账户余额等个人信息
public class Bank {
	private long id;
	private String name;
	private long pwd;
	private double accBalance;
	
	public Bank() {}

	public long getID()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public long pwd()
	{
		return this.pwd;
	}
	
	public double getAccBalance()
	{
		return this.accBalance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setID(long id)
	{
		this.id = id;
	}
	
	public void setPwd(long pwd)
	{
		this.pwd = pwd;
	}
	
	public void setAccBalance()
	{
		this.accBalance = 0;
	}
	
	public void deposite(double money) //存款
	{
		if (money > 0)
			accBalance += money;
		else
		{
			System.out.println("谢谢您的取款");
			accBalance -= money;
		}
			
	}

	public void withdraw(double money) //取款
	{
		if (money > 0 && accBalance > 0)
			accBalance -= money;
		else
			System.out.println("您没钱啦！！！！！");
	}
}
