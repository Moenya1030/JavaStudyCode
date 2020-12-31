package lab11;

public class Lab11_2 extends Thread{
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=0; i<10; i++)
			new Lab11_2().start();
	}
	public void run() {
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(this.getId() + "号线程正在运行，当前时间是" + System.nanoTime() + "纳秒");
			}
}
