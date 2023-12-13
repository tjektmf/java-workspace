package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G04_JPanel {

	/*
	 * # JPanel
	 * 
	 * - 컨테이너 역할을 하는 컴포넌트, 컨테이너라 레이아웃 설정이 가능하고 컴포넌트를 붙일 수 있음
	 * 
	 * - 컴포넌트라 다른 컨테이너에 컴포넌트로써 붙일 수도 있음
	 * 
	 * - 레이아웃 위에 레이아웃을 설정할 때 사용함
	 */

	public static void main(String[] args) {

		JFrame f = new JFrame("JPanel Sample");

		// 메인 프레임의 레이아웃은 그리드로 설정
		f.setLayout(new BorderLayout(20,20));

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		CardLayout card = new CardLayout();
		
		// 메인 프레임에 세번째로 추가할 패널의 레이아웃을 보더로 설정
	//	panel.setLayout(new BorderLayout(30, 50)); // 열간격, 행간격
		panel2.setLayout(new GridLayout(3, 3));
		
		
		
		// Grid Card Border null
		
		// panel에 카드레이아웃줌
		panel.setLayout(card);
		
		JButton bot1 = new JButton("ㅎ2");
		

		for (int i = 0; i < 6; i++) {
			panel2.add(new JButton("" + i));
		}
		JButton but1 = new JButton("1?????");
		
		
		
		
		panel.add(but1);
//		panel.add(new JButton("1?"), BorderLayout.EAST);
		panel.add(new JButton("2?"), BorderLayout.WEST);
		panel.add(new JButton("3?"), BorderLayout.SOUTH);
		panel.add(new JButton("4?"), BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.CENTER);
		
		
		bot1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(panel);
			}
		});
		
		but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});

		f.add(bot1, BorderLayout.EAST);
		f.add(new JButton("2"), BorderLayout.SOUTH);
		f.add(panel, BorderLayout.CENTER);
		f.add(new JButton("4"), BorderLayout.WEST);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 1080, 1920);
		f.setVisible(true);

	}

}
