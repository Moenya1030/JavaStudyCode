package lab11;
import java.net.URL;
import java.awt.Container;
import javax.swing.*;
import java.util.Random;

public class Lab11_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingAndThread sat =  new SwingAndThread();
		sat.start();
	}

}
class SwingAndThread extends Thread{
	private JFrame jf=new JFrame();
	private JLabel jl[]=new JLabel[40];
	private int x[]=new int[40]; 
	private int y[]=new int[40];
	private Random r=new Random();
	private Container container=jf.getContentPane();
	
	public SwingAndThread() {
		container.setLayout(null);
		setJLabel();
		for(int i=0; i<40; i++) {
			x[i]=r.nextInt(500);
			y[i]=r.nextInt(500);
		}
		setJFrame();
	}
	
	public void run() {
		while(true) {
			for(int i=0; i<40; i++)
				jl[i].setBounds(x[i], y[i], 200, 50);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			for(int i=0; i<40; i++) {
				y[i] += 10;
				if(y[i] >= 500) {
					y[i]=0;
					x[i]=r.nextInt(500);
				}
			}
		}
	}
	private void setJLabel() {
		URL url=SwingAndThread.class.getResource("1.gif");
		Icon icon=new ImageIcon(url);
		for(int i=0; i<40; i++) {
			jl[i]=new JLabel();
			jl[i].setIcon(icon);
			jl[i].setHorizontalAlignment(SwingConstants.LEFT);
			jl[i].setOpaque(false);
			container.add(jl[i]);
		}
	}
	private void setJFrame() {
		jf.setBounds(300, 200, 550, 550);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
