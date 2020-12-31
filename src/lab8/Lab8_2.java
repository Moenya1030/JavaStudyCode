package lab8;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lab8_2 {

	public static void main(String[] args) {
		new Vote();
	}
}

class Vote extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int[] hs=new int[4];
	public Vote(){
		setTitle("计票软件");
		setVisible(true);
		setSize(450,1000);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(null);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
		
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		
		jp1.setBounds(0,0,100,600);
		jp2.setBounds(110,0,100,600);
		jp3.setBounds(220,0,100,600);
		jp4.setBounds(330,0,100,600);
		
		final JLabel jl11=new JLabel();
		JLabel jl12=new JLabel("王一");
		final JLabel jl21=new JLabel();
		JLabel jl22=new JLabel("刘二");
		final JLabel jl31=new JLabel();
		JLabel jl32=new JLabel("张三");
		final JLabel jl41=new JLabel();
		JLabel jl42=new JLabel("李四");
		JButton jb1=new JButton("投票");
		JButton jb2=new JButton("投票");
		JButton jb3=new JButton("投票");
		JButton jb4=new JButton("投票");
		
		jp1.add(jl11);
		jp1.add(jl12);
		jp1.add(jb1);
		jp2.add(jl21);
		jp2.add(jl22);
		jp2.add(jb2);
		jp3.add(jl31);
		jp3.add(jl32);
		jp3.add(jb3);
		jp4.add(jl41);
		jp4.add(jl42);
		jp4.add(jb4);
		
		jp1.setLayout(null);
		jp2.setLayout(null);
		jp3.setLayout(null);
		jp4.setLayout(null);
		
		jb1.setBounds(0,450,60,50);
		jb2.setBounds(0,450,60,50);
		jb3.setBounds(0,450,60,50);
		jb4.setBounds(0,450,60,50);
		
		jl12.setBounds(0,450,60,50);
		jl12.setHorizontalAlignment(SwingConstants.CENTER);
		jl22.setBounds(0,450,60,50);
		jl22.setHorizontalAlignment(SwingConstants.CENTER);
		jl32.setBounds(0,450,60,50);
		jl32.setHorizontalAlignment(SwingConstants.CENTER);
		jl42.setBounds(0,450,60,50);
		jl42.setHorizontalAlignment(SwingConstants.CENTER);
		
		jl11.setBounds(0,450,60,0);
		jl21.setBounds(0,450,60,0);
		jl31.setBounds(0,450,60,0);
		jl41.setBounds(0,450,60,0);
		
		jl11.setOpaque(true);
		jl21.setOpaque(true);
		jl31.setOpaque(true);
		jl41.setOpaque(true);
		
		jb1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count(0);
				jl11.setBounds(0,450-hs[0],60,hs[0]);
				jl11.setText(""+hs[0]/10);
				jl11.setHorizontalAlignment(SwingConstants.CENTER);
				jl11.setBackground(Color.red);
			}
			
		});
		jb2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count(1);
				jl21.setBounds(0,450-hs[1],60,hs[1]);
				jl21.setText(""+hs[1]/10);
				jl21.setHorizontalAlignment(SwingConstants.CENTER);
				jl21.setBackground(Color.red);
			}
			
		});
		jb3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count(2);
				jl31.setBounds(0,450-hs[2],60,hs[2]);
				jl31.setText(""+hs[2]/10);
				jl31.setHorizontalAlignment(SwingConstants.CENTER);
				jl31.setBackground(Color.red);
			}
			
		});
		jb4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count(3);
				jl41.setBounds(0,450-hs[3],60,hs[3]);
				jl41.setText(""+hs[3]/10);
				jl41.setHorizontalAlignment(SwingConstants.CENTER);
				jl41.setBackground(Color.red);
			}
			
		});
	}
	public void count(int i) {
		hs[i]+=10;
	}
}
