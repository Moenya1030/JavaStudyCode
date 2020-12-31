package lab8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Lab8_1 {

	public static void main(String[] args) {
		new URgeister();
	}

}
class URgeister extends JFrame{
	
	String[] s1= {"����","ר��","�о���"};
	String[] s2= {"��ɽ","�Ϻ�","��ѧ��"};
	
	JPanel jp=new JPanel();
	JLabel jl1=new JLabel("����:");
	JLabel jl2=new JLabel("����:");
	JLabel jl3=new JLabel("�Ա�:");
	JLabel jl4=new JLabel("����:");
	JLabel jl5=new JLabel("ѧ��:");
	JLabel jl6=new JLabel("У��:");
	JLabel jl7=new JLabel("���ҽ���:");
	JTextField jtf=new JTextField();
	JPasswordField jpw=new JPasswordField();
	JRadioButton jrb1=new JRadioButton("��");
	JRadioButton jrb2=new JRadioButton("Ů");
	ButtonGroup group=new ButtonGroup();
//	JCheckBox jcb1=new JCheckBox("��ë��");
//	JCheckBox jcb2=new JCheckBox("����");
//	JCheckBox jcb3=new JCheckBox("����");
	JCheckBox jcb[]= {new JCheckBox("��ë��"),new JCheckBox("����"),new JCheckBox("����")};
	JComboBox jbox=new JComboBox(s1);
	JList jlist=new JList(s2);
	JScrollPane js1=new JScrollPane(jlist);
	JTextArea jta=new JTextArea();
	JScrollPane js2=new JScrollPane(jta);
	JButton submit=new JButton("�ύ");
	final JLabel showinfo=new JLabel();
	
	public URgeister(){
		setTitle("�û�ע�����");
		setSize(450,900);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container c=getContentPane();
		

		jl1.setFont(new Font("����",0,15));
		jl1.setHorizontalAlignment(SwingConstants.CENTER);
		jl2.setFont(new Font("����",0,15));
		jl2.setHorizontalAlignment(SwingConstants.CENTER);
		jl3.setFont(new Font("����",0,15));
		jl3.setHorizontalAlignment(SwingConstants.CENTER);
		jl4.setFont(new Font("����",0,15));
		jl4.setHorizontalAlignment(SwingConstants.CENTER);
		jl5.setFont(new Font("����",0,15));
		jl5.setHorizontalAlignment(SwingConstants.CENTER);
		jl6.setFont(new Font("����",0,15));
		jl6.setHorizontalAlignment(SwingConstants.CENTER);
		jl7.setFont(new Font("����",0,15));
		jl7.setHorizontalAlignment(SwingConstants.CENTER);

		jp.setLayout(null);
		c.add(jp);

		group.add(jrb1);
		group.add(jrb2);

		jp.add(jl1);
		jp.add(jtf);
		jl1.setBounds(0,0,70,50);
		jtf.setBounds(70,0,400,50);
		
		jp.add(jl2);
		jp.add(jpw);
		jl2.setBounds(0,55,70,50);
		jpw.setBounds(70,55,400,50);
		jpw.setEchoChar('#');
		
		jp.add(jl3);
		jp.add(jrb1);
		jp.add(jrb2);
		jl3.setBounds(0,105,70,50);
		jrb1.setBounds(70,105,40,50);
		jrb2.setBounds(140,105,40,50);
		
		jp.add(jl4);
		jp.add(jcb[0]);
		jp.add(jcb[1]);
		jp.add(jcb[2]);
		jl4.setBounds(0,155,70,50);
		jcb[0].setBounds(70,155,80,50);
		jcb[1].setBounds(150,155,80,50);
		jcb[2].setBounds(230,155,80,50);
		
		jp.add(jl5);
		jp.add(jbox);
		jl5.setBounds(0,205,70,50);
		jbox.setBounds(70,205,70,50);
		
		jp.add(jl6);
		jp.add(js1);
		jl6.setBounds(0,265,70,50);
		js1.setBounds(70,265,100,50);
		
		jp.add(jl7);
		jp.add(js2);
		jta.setLineWrap(true);
		jl7.setBounds(0,330,70,50);
		js2.setBounds(70,330,400,200);
		
		jp.add(submit);
		submit.setBounds(200,540,100,40);
		
		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String s1="��ã�"+jtf.getText();
				String s2="";
				String s3=(String) jbox.getSelectedItem();
				String s4=(String) jlist.getSelectedValue();
				String s5=jta.getText();
				if(jrb1.isSelected())
					s1+="������";
				else
					s1+="Ůʿ��";
				for(int i=0;i<jcb.length;i++) {
					if(jcb[i].isSelected())
						s2+=jcb[i].getText()+" ";
				}
				
				String str="<html><body><p>"+s1+"���ĸ�����Ϣ���£�</p>";
				str+="<p>���ã�"+s2+"</p>";
				str+="<p>ѧ����"+s3+"</p>";
				str+="<p>У����"+s4+"</p>";
				str+="<p>���˽��ܣ�"+s5+"</p>";
				str+="</body></html>";
				showinfo.setText(str);
			}
			
		});
		jp.add(showinfo);
		showinfo.setFont(new Font("����",1,20));
		showinfo.setBounds(100,540,400,300);
	}
}
