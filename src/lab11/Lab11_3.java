package lab11;

public class Lab11_3 {
	private Thread ta,tb;
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Lab11_3();

	}
	public Lab11_3() {
		System.out.println("�߳�a����");
		ta=new Thread(new Runnable() {
			int count=0;
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				System.out.println("�߳�aִ��");
				while(true) {
					count++;
					try {
						System.out.println("�߳�a����");
						Thread.sleep(100);
						tb.join();
					}catch(Exception e) {
						System.out.println("�߳�a�ж�");
						break;
					}
					if(count==3) {
						ta.interrupt();
					}
				}
			}
			
		});
		tb=new Thread(new Runnable() {
			int count=0;
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				System.out.println("�߳�b����");
				while(true) {
					count++;
					if(count==3)
						break;
				}
			}
			
		});
		System.out.println("�߳�a����");
		ta.start();
		tb.start();
		
	}
	
}
