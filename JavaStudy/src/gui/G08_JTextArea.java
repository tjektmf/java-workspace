package gui;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class G08_JTextArea extends JFrame {

	public G08_JTextArea() {
		super("JTextArea Sample");
		setLayout(null);
		

		
		
		JTextArea ta = new JTextArea();
		ta.setBounds(100, 100, 200, 300); // setBounds는 setLocation + setSize
		
		// 테두리 설정
		ta.setBorder(BorderFactory.createLineBorder(Color.red));
		
		// 키보드 이벤트 설정 가능
		// KeyListener 자리에 KeyAdapter를 사용하면 원하는 메서드만 오버라이드 가능
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
			
			}
		});
		add(ta);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
		


	}
	
	public static void main(String[] args) {
		new G08_JTextArea();
	}
}