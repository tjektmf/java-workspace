package gui.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class G08_gugudan extends JFrame {

	/*
	 * 실행하면 구구단이 출력되는 GUI 프로그램을 만들자
	 * 
	 * 1. 프로그램을 처음 시작하면 구구단 2단이 출력된 상태로 시작
	 * 
	 * 2. +버튼을 누르면 단이 증가하며 구구단 내용이 바뀜 2~9
	 * 
	 * 3. -버튼을 누르면 단이 감소하며 구구단 내용이 바뀜 2~9
	 * 
	 */

	int changeNumber = 2;
	int changeNumber2 = 1;

	public G08_gugudan() {

		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");

		btn1.setBounds(80, 80, 50, 50);
		btn2.setBounds(80, 180, 50, 50);
		btn1.setFont(new Font("견고딕", Font.BOLD, 25));
		btn2.setFont(new Font("견고딕", Font.BOLD, 40));

		add(btn1);
		add(btn2);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		setVisible(true);
		JTextArea ta = new JTextArea();
		JLabel label = new JLabel();
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				changeNumber++;
				while (changeNumber2 <= 9 && changeNumber >= 2 && changeNumber <= 9) {
					ta.append(gogo(changeNumber, changeNumber2));
					changeNumber2++;
				}
				changeNumber2 = 1;

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				changeNumber--;
				while (changeNumber2 <= 9 && changeNumber >= 2 && changeNumber <= 9) {
					ta.append(gogo(changeNumber, changeNumber2));
					changeNumber2++;
				}
				changeNumber2 = 1;
			}
		});

		while (changeNumber2 <= 9) {
			ta.append(gogo(changeNumber, changeNumber2));
			changeNumber2++;
		}
		changeNumber2 = 1;
		add(label);
		label.setBounds(150, 100, 60, 60);

		ta.setBounds(150, 80, 60, 150);
		ta.setBorder(BorderFactory.createLineBorder(Color.red));
		add(ta);

		gugu(changeNumber);
		ta.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("짜잔");
				if (e.getKeyChar() == '+') {
					changeNumber++;
					gugu(changeNumber);
				} else if (e.getKeyChar() == '-') {
					changeNumber--;
					gugu(changeNumber);

				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void gugu(int changeNumber) {
		if (changeNumber >= 2 && changeNumber <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", changeNumber, i, changeNumber * i);
			}
		}
	}

	public static String gogo(int changeNumber, int changeNumber2) {
		int a = changeNumber * changeNumber2;

		return "" + changeNumber + " * " + changeNumber2 + " = " + a + "\n";

	}

	public static void main(String[] args) {

		new G08_gugudan();
	}

}
