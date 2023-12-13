package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G10_CardLayout {

	/*
	 * 다음 카드로 넘기듯이 컴포넌트를 넘기면서 보여줄 수 있는 레이아웃
	 * 
	 * ex: > 버튼누르면 다음리스트나오는 그런느낌
	 */

	public static void main(String[] args) {

		JFrame f = new JFrame("card");

		CardLayout card = new CardLayout();

		f.setLayout(card);

		JPanel panel1 = new JPanel(new BorderLayout(100, 100)); // 디폴트
		JPanel panel2 = new JPanel(new GridLayout(3, 3));
		JPanel panel3 = new JPanel(null);

		JButton panel1NextBtn = new JButton("다음");
		panel1.add(panel1NextBtn, BorderLayout.SOUTH);
		panel1NextBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음");
				// 카드 레이아웃을 조정하기 위해서는 해당 카드레이아웃의 부모컨테이너를 전달해줘야함
				card.next(f.getContentPane());

			}
		});

		for (int i = 0; i < 9; i++) {
			JButton btn = new JButton("" + i);
			if (i == 4) {
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						card.next(f.getContentPane());
					}
				});

			}
			panel2.add(btn);
		}

		// 레이아웃 널이라 위치 직접 지정해줘야해서 순서 상관없는데 그리드나 보더는 코드순서가 곧 버튼순서라 신경써야함
		JButton panel3prevBtn = new JButton("prev");
		JButton panel3page1Btn = new JButton("page1");
		JButton panel3page2Btn = new JButton("page2");
		JButton panel3nextBtn = new JButton("next");

		panel3prevBtn.setBounds(50, 100, 80, 50);
		panel3page1Btn.setBounds(150, 100, 80, 50); // 널이라 값지정해줘야 튀어나옴
		panel3page2Btn.setBounds(250, 100, 80, 50);
		panel3nextBtn.setBounds(350, 100, 80, 50);

		panel3.add(panel3prevBtn);
		panel3.add(panel3page1Btn);
		panel3.add(panel3page2Btn);
		panel3.add(panel3nextBtn);
		
		panel3nextBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane());
				
			}
		});

		panel3page1Btn.addActionListener(new ActionListener() {

			// show 를 사용하기 위해 카드레이아웃에 컴포넌트를 추가할때 이름설정이 필요함
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(f.getContentPane(), "apel");

			}
		});
		
		panel3page2Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(f.getContentPane(), "banana");
				
			}
		});

		// 카드 레이아웃에 컴포넌트를 추가할 때 이름설정을 해야함
		f.add("apel", panel1);
		f.add("banana", panel2);
		f.add("peach", panel3);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);

	}

}
