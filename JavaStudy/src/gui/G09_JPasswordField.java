package gui;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class G09_JPasswordField extends JFrame {

	public G09_JPasswordField() {

		super("Sample");
		setLayout(new GridLayout(2, 2));

		JLabel idLabel = new JLabel("  ID : ");
		JTextField idField = new JTextField();

		// 비밀번호를 텍스트필드로 하면 보안상 문제있음
		JLabel pwLabel = new JLabel("  PW : ");
		// JTextField pwField = new JTextField();
		JPasswordField pwField = new JPasswordField();

		add(idLabel); // new GridLayout(1,2) 1행 1열에 들어감
		add(idField); // 1행 2열에 들어감
		add(pwLabel);
		add(pwField);


		// 앞에 리스너여도 어댑터 객체 생성가능
		this.addComponentListener(new ComponentAdapter() {

			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("x : " + e.getComponent().getX() + ", y : " + e.getComponent().getY());
				System.out.println(
						"width : " + e.getComponent().getWidth() + ", height : " + e.getComponent().getHeight());

			}

			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000, 400, 250, 80);
		setVisible(true);
	}

	public static void main(String[] args) {
		new G09_JPasswordField();
	}

}
