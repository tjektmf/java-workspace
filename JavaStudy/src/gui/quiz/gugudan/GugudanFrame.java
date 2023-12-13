package gui.quiz.gugudan;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GugudanFrame extends JFrame {

	// 초기값
	int dan = 2;
	final int GUGUDAN_SIZE;
	
	// 이벤트 모음 (인스턴스로 만듬)
	ActionListener gugudanButtonAction;


	// 이 프레임에 사용되는 하위 컴포넌트

	List<JLabel> gugudanLabels = new ArrayList<>();
	Font gugudanLabelFont = new Font("Consolas", 0, 25); // 폰트 0넣으면 플레인임
	JPanel topPanel = new JPanel(new GridLayout(9, 1)); // 9행을 만들어서 구구단 9행을 각각 넣어버림
	JPanel botPanel = new JPanel(new GridLayout(1, 2)); // 버튼 1행 2열(그냥 한줄에 버튼 두개 넣은거임)
	JButton prevBtn = new PrevButton(this);
	JButton nextBtn = new NextButton(this);

	// 이 프레임과 관련된 모든 이벤트들
	public GugudanFrame() {
		this(9);
	}

	public GugudanFrame(int size) {
		gugudanButtonAction = new GugudanButtonActionListener(this);

		// 보더레이아웃은 기본값이라 굳이 설정안해도 됨
		setLayout(new BorderLayout());

		Container pane = getContentPane();

		GUGUDAN_SIZE = size;
		for (int i = 0; i < 9; i++) {
			JLabel gugudanLabel = new JLabel();
			int gop = i + 1;
			gugudanLabel.setText(String.format("2 x %d = %d", gop, 2 * gop));
			gugudanLabel.setFont(gugudanLabelFont);

			gugudanLabels.add(gugudanLabel);
			topPanel.add(gugudanLabel);
			
		}
		pane.add(topPanel, BorderLayout.CENTER);
		pane.add(botPanel, BorderLayout.SOUTH);

		
//		add(topPanel, BorderLayout.CENTER);
//		add(botPanel, BorderLayout.SOUTH);

		// 이 프레임의 하위 컴포넌트에서 현재 컴포넌트의 모든것을 알 수 있도록 데이터를 전달해 주는것이 편함(this)
		botPanel.add(prevBtn);
		botPanel.add(nextBtn);
		// 이 부분에서 기존에 있던 버튼 객체 생성 코드를 위로 옮기면서 기존 코드 수정을 했어야 했는데
		// 그걸 하지 않고 버튼 객체를 새로 만드는 코드를 유지해서 액션리스너가 작동하지않았음
		// gui나 콘솔보고 어디가 문제인지 파악 후 그 부분 위주로 체크
		
		// 이벤트 추가, 모든 컴포넌트를 초기화 한 이후 맨 마지막에 붙이는게 좋음 꼬이는걸 미연에 방지
		prevBtn.addActionListener(gugudanButtonAction);
		nextBtn.addActionListener(gugudanButtonAction);

		setTitle("구구단");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GugudanFrame(19);
	}

}
