package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G01_JavaSwing {
	
	/*
	 	# Java Swing 
	 	
	 	- 자바로 GUI 프로그램을 만들 수 있는 API
	 	
	 	- GUI(Graphic User Interface) : 컴퓨터 화면을 이미지로 제어할 수 있는 환경
	 	
	 	- 컨테이너 위에 컴포넌트를 배치하는 방식으로 화면을 구성할 수 있다
	 	
	 	# Swing Container
	 	
	 	- 컨테이너 위에는 여러가지 컴포넌트들을 배치할 수 있다
	 	
	 	- JFrame, JPanel, JDialog 등 컨테이너로 분류되는 다양한 클래스들이 존재
	 	
	 	# Swing Component 
	 	
	 	- 컨테이너 위에 배치할 수 있는 객체들
	 	
	 	- 버튼, 라벨, 표, 체크박스 등 컴포넌트로 분류되는 다양한 클래스들이 존재
	 */
	
	public static void main(String[] args) {
		
		// JFrame : 대표적인 컨테이너 (초기에는 보이지 않는 상태)
		JFrame frame = new JFrame();
		// JButton : 여러 컴포넌트들 중 한 종류로 누를 수 있음
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
		button1.setSize(80,80);
		// Swing의 일부 컴포넌트라벨에서 html 문법 사용가능, 구글검색 활용
		button1.setText("<html>버튼<br>버튼<html>");
		button1.setLocation(300,300); // 버튼 좌측 상단의 위치가 300,3000
		
		// setBounds == setLocation + setSize
		button2.setBounds(100,300,150,80); 
		button2.setText("버튼2");
		
		// 만든 컴포넌트를 프레임에 붙임
		frame.add(button1);
		frame.add(button2);
		// 해당 프레임의 레이아웃 관리자를 설정
		// 레이아웃 관리자 : 컴포넌트를 부착할 때 위치를 제어해주는 클래스
		frame.setLayout(null);
		// EXIT_ON_CLOSE : 창을 종료, 프로그램 종료
		// HIDE_ON_CLOSE : 창을 숨김, 최소화
		// DO_NOTHING_ON_CLOSE : 아무일도 없음
		// DISPOSE_ON_CLOSE : 창은 종료 프로그램은 유지, 기본값
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 해당 프레임의 제목을 설정
		frame.setTitle("my gui program");
		// 해당 프레임의 초기 위치, 안쓰면 대충 좌측상단에 나오는듯
		frame.setLocation(700,200);
		// 해당 프레임의 초기 크기를 설정하는 메서드
		frame.setSize(1080,1920);
		// 해당 프레임을 보이는 상태로 설정, false는 안보임
		frame.setVisible(true); // 프레임을 보이는 상태로 설정 기본이 false인듯 안보임
		
		
	}

}
