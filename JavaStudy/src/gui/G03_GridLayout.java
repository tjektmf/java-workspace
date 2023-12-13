package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G03_GridLayout {

	public static void main(String[] args) {

		JFrame f = new JFrame("GridLayout sample");

		// 행과 열을 설정한 후 컴포넌트를 순서대로 붙이는 방식의 레이아웃
		GridLayout gl = new GridLayout(2, 4);
		
		gl.setHgap(15);
		gl.setVgap(30);

		f.setLayout(gl);
		// 그리드 레이아웃에 컴포넌트 붙이기
		// 기본적으로 위에서 정한 5,3에 맞추지만 15개를 넘어가면 걍 알아서 눈치껏 붙임
		for (int i = 0; i < 8; i++) {
			f.add(new JButton("Button" + i));
		} 

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}
}
