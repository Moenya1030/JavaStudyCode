package lab2;
//Ҫ���ܹ�����û����˺š�������������˻����ȸ�����Ϣ
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
	
	public void deposite(double money) //���
	{
		if (money > 0)
			accBalance += money;
		else
		{
			System.out.println("лл����ȡ��");
			accBalance -= money;
		}
			
	}

	public void withdraw(double money) //ȡ��
	{
		if (money > 0 && accBalance > 0)
			accBalance -= money;
		else
			System.out.println("��ûǮ������������");
	}
}
