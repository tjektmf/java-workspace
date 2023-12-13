package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class G07_JTextField extends JFrame{
	
	
	public G07_JTextField() {
	
		super("JTextField Sample");
		setLayout(null);
		
		JLabel label = new JLabel("점심 : ");
		label.setBounds(50,100,50,30); // 첫번째가 x축 두번째가 y축
		JTextField tf = new JTextField();
		tf.setBounds(100, 100, 200, 30); // setBounds는 setLocation + setSize
		add(tf);
		add(label);
		
		// 유니티랑 비슷한 맥락
		tf.addKeyListener(new KeyListener() {
		
			@Override
			public void keyTyped(KeyEvent e) {
				// 입력이 있을때, ctrl alt shift에는 발동안함 입력이 없기 때문
				// 계속 누르고있으면 입력 또한 계속 되므로 발동함
				System.out.println("키를 누름");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키에서 손 뗌");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키 누르는중");
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_SPACE:
					System.out.println("스페이스");
					break;
				case KeyEvent.VK_SHIFT:
					System.out.println("시프트");
					break;
				}
				
			}
		});
		
		// JTextField의 액션리스너는 텍스트필드가 선택된 채로 엔터키를 칠때 작동함
		tf.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent에 필요한 정보들이 함께 넘어온다
				System.out.println("이벤트를 발생시킨 컴포넌트 : "+ e.getSource());
				System.out.println("이벤트 발생 시간 : " + new Date(e.getWhen()));
				System.out.println("발생 당시 텍스트필드 값 : " + e.getActionCommand());
			}
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new G07_JTextField();
	}

}
