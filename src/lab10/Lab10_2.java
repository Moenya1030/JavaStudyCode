package lab10;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Lab10_2 extends JFrame { 
	private JScrollPane scrollPane;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null; 
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null; 
	private JButton openButton = null; 
	private JButton closeButton = null;
	
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setVgap(1);
			controlPanel = new JPanel();
			controlPanel.setLayout(flowLayout);
			controlPanel.add(getOpenButton(), null);
			controlPanel.add(getCloseButton(), null);
		}
		return controlPanel;
	}
	
	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("写入文件"); 
			openButton.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(ActionEvent e) {
							File file = new File("word.txt");
							try {
								FileWriter out = new FileWriter(file);
								String s = jTextArea.getText();
								out.write(s); 
								out.close(); 
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("读取文件"); 
			closeButton.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(ActionEvent e) {
							File file = new File("word.txt");
							try {
								FileReader in = new FileReader(file);
								char byt[] = new char[1024]; 
								int len = in.read(byt); 
								jTextArea.setText(new String(byt, 0, len));
								in.close();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					});
		}
		return closeButton;
	}
	
	public Lab10_2() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	
	public static void main(String[] args) { 
		Lab10_2 thisClass = new Lab10_2(); 
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true); 
	}

	protected JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getJTextArea());
		}
		return scrollPane;
	}
}
