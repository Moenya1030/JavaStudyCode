package lab7;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DrawIcon implements Icon {
		private int width;
		private int height;
		public int getIconHeight() {
			return this.height;
		}
		public int getIconWidth() {
			return this.width;
		}
		public DrawIcon(int width, int height) {
			this.height = height;
			this.width = width;
		}
		
		public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
			arg1.fillOval(x, y, width, height);
		}
		
		public static void main(String[] args) {
			
			DrawIcon icon = new DrawIcon(15, 15);
			JLabel j = new JLabel("test", icon, SwingConstants.CENTER);
			j.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签文字位置居中
			JFrame jf = new JFrame();
			Container container = jf.getContentPane();
			container.add(j); // 把标签添加到容器中
			
		}
}


