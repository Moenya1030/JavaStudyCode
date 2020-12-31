package lab5;

interface alarm
{
	void alarming();
}

public  class AlarmDoor extends door 
implements alarm{
	public void alarming()
	{
		if(flag)
			System.out.println("门没关！");
		else
			System.out.println("门关了！");
	}
	private boolean flag=false;
	public void door()
	{
		System.out.println("这是一扇门");
	}
	public void open()
	{
		if(!flag)
			System.out.println("开门");
		else
			System.out.println("门是打开的");
		flag=true;
	}
	public void close()
	{
		if(flag)
			System.out.println("关门");
		else
			System.out.println("门是关着的");
		flag=false;
	}
}