package lab7;

import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//public class MyFrame  {
 
	 class MyJDialog1 extends JDialog{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

//		public MyJDialog(JFrame frame) {
//			// 实例化一个JDialog类对象，指定父窗体、窗体标题和类型
//			super(frame , "第一个JDialog窗体" , true); 
//			Container container = getContentPane(); // 创建一个容器
//			container.add(new JLabel("这是一个JDialog窗体——对话框")); // 在容器中添加一个标签
//			setBounds(120 , 120 , 100 ,100); // 设置JDialog窗体大小
//		}	
	}
	public class MyFrame1 extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public static void main(String[] args){
			new MyFrame() ; // 实例化MyJDialog类对象
		}
		public MyFrame1(){
			Container container = getContentPane(); // 创建一个容器
			container.setLayout(null); 
//			JLabel jl = new JLabel("这是一个JFrame窗体"); // 实例化一个JLabel标签
//			jl.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签文字位置居中
//			container.add(jl); // 把标签添加到容器中
//			JButton jb = new JButton("弹出JDialog窗体——对话框"); // 实例化一个按钮
//			jb.setBounds(10 , 10 ,100 , 21);
//			jb.addActionListener(new ActionListener(){ // 为按钮添加一个鼠标单击事件
//				public void actionPerformed(ActionEvent 	e) {
//					new MyJDialog(MyFrame1.this).setVisible(true); // 使MyJDailog窗体可见
//				}
//			});
			DrawIcon icon = new DrawIcon(15, 15);
			//container.add(jb); // 将按钮添加到容器中
			setBounds(50, 50, 200, 200);
			setVisible(true);
		}			
	}
//}
