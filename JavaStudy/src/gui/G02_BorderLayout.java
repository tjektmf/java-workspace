package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {

	/*
	 * # 레이아웃 관리자 (Layout Manager)
	 * 
	 * - 컨테이너에는 레이아웃 관리자를 설정할 수 있다
	 * 
	 * - 레이아웃을 설정한 컨테이너에는 컴포넌트를 원하는 위치에 부작할 수 없고 레이아웃에서 정한 위치에만 부착할 수 있다
	 * 
	 * - 컴포넌트를 자유롭게 배치하고 싶다면 해당 컨테이너의 레이아웃 매니저를 null로 설정해야함, setLocation, setSize를
	 * 통해 배치
	 * 
	 * - 레이아웃창을 늘였다 줄였다 하면 컴포넌트도 그거에 맞게 늘었다 줄었다 함 그래서 크기조절을 못하는거임 장점으로 활용가능
	 * 
	 * # BorderLayout
	 * 
	 * - JFrame의 기본값으로 상하좌우중에 컴포넌트를 배치할 수 있다
	 */

	public static void main(String[] args) {

		JFrame f = new JFrame("my gui program"); // setTitle을 ()안에 넣어버림

		// <JButton> 이라는게 별게아님 
		// 걍 JButton btn1에서 100까지 만들때 코드줄이고 편하게 만들려고 걍 
		 
		List<JButton> btns = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton("JButton" + i);
			btns.add(btn);
		}

		f.setLayout(new BorderLayout(10,30)); // 버튼사이 간격을 주는 오버로딩 기본적으로 0,0
		// 보더레이아웃이 설정된 컨테이너에 컴포넌트를 붙임
		f.add(btns.get(0), "East"); // EAST는 안됨 그냥 BorderLayout.EAST쓰는게 편한듯
		f.add(btns.get(1), BorderLayout.SOUTH);
		f.add(btns.get(2), BorderLayout.WEST);
		f.add(btns.get(3), BorderLayout.NORTH);
		f.add(btns.get(4), BorderLayout.CENTER);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 1080, 1920);
		f.setVisible(true);

	}
}
