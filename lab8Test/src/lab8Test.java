import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class lab8 extends JFrame implements ActionListener {
	JFrame f;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JButton button;
	public lab8 ()
	{ JFrame f = new JFrame();
	JPanel panel = new JPanel();
	f.add(panel);
	label1 = new JLabel("������ �Է��Ͻÿ�");
	label2 = new JLabel("������ �Է��Ͻÿ�");
	field1 = new JTextField(10);
	field2 = new JTextField (10);
	field3 = new JTextField(20);
	button = new JButton("��ȯ");
	panel.add(label1);
	panel.add(field1);
	panel.add(label2);
	panel.add(field2);
	panel.add(button);
	panel.add(field3);
	button.addActionListener(this);
	f.setSize(300,150);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("���� ����");
	f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{ field3.setText("���ڴ� ��"+ (long)
				(Integer.valueOf(field1.getText())*Float.valueOf(field2.getText())/100)+"���� �Դϴ�.");
		field3.setEditable(false);}
	}
}

public class lab8Test {
	public static void main(String[] args)
	{
		new lab8();
	}
}