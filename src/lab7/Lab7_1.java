package lab7;

import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Lab7_1 {

public class MyJDialog extends JDialog{

		public MyJDialog(MyFrame frame){
			super(frame, "��һ��JDialog����", true);
			Container container = getContentPane();
			container.add(new JLabel("����������"));
			setBounds(120, 120, 100, 100);
		}
	}
	
public class MyFrame extends JFrame{

	public void main(String[] args) {
		new MyFrame();
		// TODO Auto-generated method stub
	}
		public MyFrame(){
			MyFrame.this.setVisible(true);
			Container container = getContentPane();
			container.setLayout(null);
			JLabel jl = new JLabel("����һ��JFrame����");
			jl.setHorizontalTextPosition(SwingConstants.CENTER);
			container.add(jl);
			JButton bl = new JButton("�����Ի���");
			bl.setBounds(10, 10, 100, 21);
			bl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new MyJDialog(MyFrame.this).setVisible(true);
				}
			});
			container.add(bl);
			setBounds(50, 50, 200, 200);
			container.setVisible(true);
		}
		
	}
}
