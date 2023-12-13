package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// Swing 컴포넌트들은 상속을 통한 구현이 가능
public class G05_JButton extends JFrame {

	public G05_JButton() {

		setLayout(null); // 널해야 크기조정 가능
		// ContentPane : 프레임 내에서 실제로 내용이 그려지는 곳
		// JFrame 을 상속받아서 바로 getContentPane()이 가능함
		getContentPane().setBackground(Color.WHITE);

		JButton btn1 = new JButton("버튼1");
		btn1.setText("dddddddd");
		btn1.setFont(new Font("휴먼매직체",Font.BOLD,20));
		btn1.setBounds(100, 100, 300, 70);
		btn1.setEnabled(true); // false하면 버튼 비활성
		// 글씨 색 설정
		btn1.setForeground(Color.blue);
		// 배경 색 설정
		btn1.setBackground(new Color(150, 200, 200)); // RGB값 넣어도 됨

		// 버튼을 눌렀을때의 동작을 설정
		btn1.addActionListener(new ActionListener() {

			// 액션리스너는 인터페이스임 바로 메서드설정해줘야함
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.orange);
			}
		});

		add(btn1);
		add(new MyButton(100, 200, this));
		add(new MyButton(100, 300, this));

		setTitle("JButton exam");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		new G05_JButton();

	}

}

class MyActionListener implements ActionListener {

	JFrame parent;

	public MyActionListener(JFrame parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("엥");
		// 여기선 바로 getContantpane을 못함 이걸 사용하려고 jframe을 가져옴
		
		parent.getContentPane().setBackground(Color.blue);
		;
	}

}

class MyButton extends JButton implements ActionListener{
	JFrame parent;
	public MyButton(int x, int y, JFrame parent) {
		super("MyButton");
		this.parent = parent;
		setBounds(x, y, 300, 70);
	//	addActionListener(new MyActionListener(parent));
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.green);
	}
}
