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
//			// ʵ����һ��JDialog�����ָ�������塢������������
//			super(frame , "��һ��JDialog����" , true); 
//			Container container = getContentPane(); // ����һ������
//			container.add(new JLabel("����һ��JDialog���塪���Ի���")); // �����������һ����ǩ
//			setBounds(120 , 120 , 100 ,100); // ����JDialog�����С
//		}	
	}
	public class MyFrame1 extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public static void main(String[] args){
			new MyFrame() ; // ʵ����MyJDialog�����
		}
		public MyFrame1(){
			Container container = getContentPane(); // ����һ������
			container.setLayout(null); 
//			JLabel jl = new JLabel("����һ��JFrame����"); // ʵ����һ��JLabel��ǩ
//			jl.setHorizontalAlignment(SwingConstants.CENTER); // ���ñ�ǩ����λ�þ���
//			container.add(jl); // �ѱ�ǩ��ӵ�������
//			JButton jb = new JButton("����JDialog���塪���Ի���"); // ʵ����һ����ť
//			jb.setBounds(10 , 10 ,100 , 21);
//			jb.addActionListener(new ActionListener(){ // Ϊ��ť���һ����굥���¼�
//				public void actionPerformed(ActionEvent 	e) {
//					new MyJDialog(MyFrame1.this).setVisible(true); // ʹMyJDailog����ɼ�
//				}
//			});
			DrawIcon icon = new DrawIcon(15, 15);
			//container.add(jb); // ����ť��ӵ�������
			setBounds(50, 50, 200, 200);
			setVisible(true);
		}			
	}
//}
