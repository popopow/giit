import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class N2 extends JFrame {
	public N2() {
		super("�巡�뵿�� YELLOW�� ����");	//Ÿ��Ʋ ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//��� �ʷϻ�
		MyMouseListener ml = new MyMouseListener();	 // ���콺 ������
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);		// ��� �����
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);		//��� �ʷϻ�
		}		
	}
	static public void main(String [] args) {
		new N2();		// ��ü����
	}
}
