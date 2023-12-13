package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G06_JLabel extends JFrame{
	

	// JLabel : 텍스트를 표시하기 위한 컴포넌트


	public G06_JLabel() {
		super("JLabel Sample");
		
		setLayout(null);
		
		JButton btn1 = new JButton("버튼");
		btn1.setBounds(100,100,100,70);
		
		JLabel label1 = new JLabel("이름 : "); // setText overriding
		label1.setBounds(50,100,50,60);
		label1.setFont(new Font("휴먼매직체", Font.BOLD,20));
		
		add(btn1);
		add(label1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G06_JLabel();
		
	}
	
}
