package lab11;

public class Lab11_2 extends Thread{
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0; i<10; i++)
			new Lab11_2().start();
	}
	public void run() {
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(this.getId() + "���߳��������У���ǰʱ����" + System.nanoTime() + "����");
			}
}
