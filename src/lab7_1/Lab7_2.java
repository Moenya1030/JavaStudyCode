package lab7_1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Lab7_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Lab7_2 lab7_2 = new Lab7_2();
	}

	public Lab7_2() {
		// TODO Auto-generated constructor stub
		int k;
		JFrame jf = new JFrame("¾Å¾Å³Ë·¨±í");
		Container container = jf.getContentPane();
//		container.setLayout(null);
		JLabel jl = new JLabel();
		String s="<html>";
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				k = i*j;
				s += i; 
				s += "*";
				s += j; 
				s += "="; 
				s+= k; 
				s += " ";
			}
			s += "<br>";
		}
		s += "</html>";
		jl.setText(s);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jf.setVisible(true);
		jf.setBounds(100,100,450,450);
		container.add(jl);
		container.setBackground(Color.white);
	}
}
