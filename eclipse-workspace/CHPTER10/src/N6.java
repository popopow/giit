import java.awt.*;	// import��
import java.awt.event.*;
import javax.swing.*;

public class N6 extends JFrame {
	public N6() {
		super("Ŭ�� ���� �� �������α׷�");		//Ÿ��Ʋ��
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("C");		//C�� ���
		label.setLocation(100,100);
		label.setSize(20, 20);	//size 20,20
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel k = (JLabel)e.getSource();
				Container c = k.getParent();
				int xBound = c.getWidth() - k.getWidth(); // ���̺��� �� ��ŭ ����
				int yBound = c.getHeight() - k.getHeight(); // ���̺��� ���� ��ŭ ����				
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);				
				k.setLocation(x, y);
			}
		});
		add(label);
		setSize(300,300);	//size 300,300
		setVisible(true);
	}
	static public void main(String [] args) {
		new N6();
	}
}
