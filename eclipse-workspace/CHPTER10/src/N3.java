import java.awt.*;		//import��
import java.awt.event.*;
import javax.swing.*;

public class N3 extends JFrame {
	public N3() {
		super("Left Ű�� ���ڿ� �̵�");	//Ÿ��Ʋ
		setLayout(new FlowLayout());	//�帣�� ���̾ƿ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");		//��¹�
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {		//���� ������ 
					JLabel la = (JLabel)e.getSource();
					String text  = la.getText();
					String a = text.substring(0,1);
					String b = text.substring(1);
					la.setText(b.concat(a));
				}
			}
		});
		add(label);
		setSize(250,100);
		setVisible(true);
		label.requestFocus();
	}
	static public void main(String [] args) {
		new N3();		// ��ü ����
	}
}
