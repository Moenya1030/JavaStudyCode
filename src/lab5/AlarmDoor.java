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
			System.out.println("��û�أ�");
		else
			System.out.println("�Ź��ˣ�");
	}
	private boolean flag=false;
	public void door()
	{
		System.out.println("����һ����");
	}
	public void open()
	{
		if(!flag)
			System.out.println("����");
		else
			System.out.println("���Ǵ򿪵�");
		flag=true;
	}
	public void close()
	{
		if(flag)
			System.out.println("����");
		else
			System.out.println("���ǹ��ŵ�");
		flag=false;
	}
}