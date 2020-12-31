package lab7_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab7_3 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab7_3().setVisible(true);
	}
	
	int i=1;
	URL url = Lab7_3.class.getResource(i+".jpg");
	
	public Lab7_3() {
		setTitle("番茄图片浏览器");
		setLayout(null);
		setBounds(100,100,600,600);
		Container container = getContentPane();
		ImageIcon icon = new ImageIcon(url);
		JLabel jlabel = new JLabel();
		jlabel.setIcon(icon);
		jlabel.setBounds(10,10,450,400);
		container.add(jlabel);
		JButton jb1 = new JButton("上一张");
		jb1.setBounds(30,450,100,21);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlabel.setVisible(false);
				i--;
				if(i<1) i=4;
				url = Lab7_3.class.getResource(i+".jpg");
				ImageIcon icon = new ImageIcon(url);
				jlabel.setIcon(icon);
				jlabel.setBounds(10,10,450,400);
				jlabel.setVisible(true);
			}
		});
		container.add(jb1);
		JButton jb2 = new JButton("下一张");
		jb2.setBounds(200,450,100,21);
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlabel.setVisible(false);
				i++;
				if(i>4) i=1;
				url = Lab7_3.class.getResource(i+".jpg");
				ImageIcon icon = new ImageIcon(url);
				jlabel.setIcon(icon);
				jlabel.setBounds(10,10,450,400);
				jlabel.setVisible(true);
			}
		});
		container.add(jb2);
		
	}
}