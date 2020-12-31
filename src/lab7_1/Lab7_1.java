package lab7_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawIcon implements Icon{
	private int width;
	private int height;
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}
	
	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO Auto-generated method stub
		arg1.fillOval(x,y, width, height);
	}
	
}
class MyJDialog extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJDialog(Lab7_1 frame) {
		super(frame,"第一个JDialog窗口",true);
		Container container = getContentPane();
		DrawIcon icon = new DrawIcon(15,15);
		JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
		container.add(j);
		setBounds(120,120,100,100);
	}
}

public class Lab7_1 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Lab7_1().setVisible(true);
	}
	
	public Lab7_1(){
		setBounds(200,200,1000,1000);
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(Lab7_1.this).setVisible(true);
			}
		});
		container.add(bl);	
	}
}
