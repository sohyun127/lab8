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
	label1 = new JLabel("원금을 입력하시오");
	label2 = new JLabel("이율을 입력하시오");
	field1 = new JTextField(10);
	field2 = new JTextField (10);
	field3 = new JTextField(20);
	button = new JButton("변환");
	panel.add(label1);
	panel.add(field1);
	panel.add(label2);
	panel.add(field2);
	panel.add(button);
	panel.add(field3);
	button.addActionListener(this);
	f.setSize(300,150);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("이자 계산기");
	f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{ field3.setText("이자는 연"+ (long)
				(Integer.valueOf(field1.getText())*Float.valueOf(field2.getText())/100)+"만원 입니다.");
		field3.setEditable(false);}
	}
}

public class lab8Test {
	public static void main(String[] args)
	{
		new lab8();
	}
}