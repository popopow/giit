import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class N1 extends JFrame {
	public N1() {
		super("���콺 �ø��� ������");	//Ÿ��Ʋ ��		
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");		//������ �۾�
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent k) {
				JLabel w = (JLabel)k.getSource();
				w.setText("Love Java");		//������ �۾�
			}
			
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");		//������ �۾�
			}			
		});
		
		add(label);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new N1();		//��ü ����
	}
}
