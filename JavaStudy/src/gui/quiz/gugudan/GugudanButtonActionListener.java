package gui.quiz.gugudan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

// 버튼의 애드액션리스너는 인터페이스 액션리스너를 임플리먼트 해야하며 인터페이스니까 추상메서드 설정까지 해야함
public class GugudanButtonActionListener implements ActionListener {

	final private int GUGUDAN_SIZE;
	List<JLabel> gugudanLabels;
	int dan = 2;
	JButton prevBtn;
	JButton nextBtn;

	// mainFrame은 걍 GugudanFrame이랑 관계를 대충 느낌오게 알아서 설정한거임
	// 메인프레임의 필드명과 같게 설정해야 헷갈리지않고 사용하기 편함 반드시 같아야 하는건 아님
	public GugudanButtonActionListener(GugudanFrame mainFrame) {
		GUGUDAN_SIZE = mainFrame.GUGUDAN_SIZE;
		gugudanLabels = mainFrame.gugudanLabels; // 아직안만듬
		prevBtn = mainFrame.prevBtn;
		nextBtn = mainFrame.nextBtn;

		prevBtn.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == prevBtn) {
			dan--;
			if (dan == GUGUDAN_SIZE - 1) {
				nextBtn.setEnabled(true);
			} else if (dan == 2) {
				prevBtn.setEnabled(false);
			}
			System.out.println("prev");

		} else if (e.getSource() == nextBtn) {
			dan++;
			if (dan == 3) {
				prevBtn.setEnabled(true);
			} else if (dan == GUGUDAN_SIZE) {
				nextBtn.setEnabled(false);
			}
			System.out.println("next");
		}
		for (int i = 0; i < 9; i++) {
			JLabel gugudanLabel = gugudanLabels.get(i);
			int gop = i + 1;
			gugudanLabel.setText(String.format("%d x %d = %d", dan, gop, dan * gop));
		}

	}

}
