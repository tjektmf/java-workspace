package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class gogodan {

	static int dan = 2;

	public static void main(String[] args) {

		JFrame f = new JFrame("구구단");

		// 기본값이 보더레이아웃이라 사실 이 코드는 필요없음 
		f.setLayout(new BorderLayout()); // 이거 주석처리해서 없애도 보더레이아웃이 적용됨
		

		JPanel topPanel = new JPanel(new GridLayout(9, 1));
		List<JLabel> gugudanlabels = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			JLabel gugudanlabel = new JLabel(String.format("2 x %d = %d", i + 1, (i + 1) * 2));
			gugudanlabel.setFont(new Font("Consolas", 0, 25));
			gugudanlabels.add(gugudanlabel);
			topPanel.add(gugudanlabel);
		}

		JPanel bottomPanel = new JPanel(new GridLayout(1, 2));

		JButton nextBtn = new JButton(">>");
		JButton prevBtn = new JButton("<<");
		prevBtn.setEnabled(false);

		// addActionListener 버튼누르면 발동하는 이벤트
		// 굳이 2~9단의 범위를 넘긴 출력을 막는거보다 
		// 버튼활성화 자체를 막아버리는게 같은 방향의 if문을 활용하지만 더 있어보임
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dan++;
				System.out.println("이번에 보여줘야 할 단 : " + dan);

				for (int i = 0; i < 9; i++) {
					JLabel gugudanLabel = gugudanlabels.get(i);
					int gop = i + 1;
					gugudanLabel.setText(String.format("%d x %d = %d", dan, gop, dan * gop));
				}

				if (dan == 3) {
					prevBtn.setEnabled(true);
				} else if (dan == 9) {
					nextBtn.setEnabled(false);
				}
			}
		});

		prevBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dan--;
				System.out.println("이번에 보여줘야 할 단 : " + dan);

				if (dan == 8) {
					nextBtn.setEnabled(true);
				} else if (dan == 2) {
					prevBtn.setEnabled(false);
				}

				for (int i = 0; i < 9; i++) {
					JLabel gugudanLabel = gugudanlabels.get(i);
					int gop = i + 1;
					gugudanLabel.setText(String.format("%d x %d = %d", dan, gop, dan * gop));
				}

			}
		});

		// 이 두 코드 위치바꾸면 버튼위치가 바뀜
		bottomPanel.add(prevBtn);
		bottomPanel.add(nextBtn);

		f.add(topPanel, "Center");
		f.add(bottomPanel, "South");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 300, 500);
		f.setVisible(true);

	}

}
