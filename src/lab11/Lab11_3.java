package lab11;

public class Lab11_3 {
	private Thread ta,tb;
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Lab11_3();

	}
	public Lab11_3() {
		System.out.println("线程a出生");
		ta=new Thread(new Runnable() {
			int count=0;
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				System.out.println("线程a执行");
				while(true) {
					count++;
					try {
						System.out.println("线程a休眠");
						Thread.sleep(100);
						tb.join();
					}catch(Exception e) {
						System.out.println("线程a中断");
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
				// TODO 自动生成的方法存根
				System.out.println("线程b加入");
				while(true) {
					count++;
					if(count==3)
						break;
				}
			}
			
		});
		System.out.println("线程a就绪");
		ta.start();
		tb.start();
		
	}
	
}
