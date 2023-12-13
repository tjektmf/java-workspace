package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G11_Image {

	// 해당 컴포넌트의 이미지를 setIcon 메서드로 교체할 수 있다

	public static void main(String[] args) {

		JFrame f = new JFrame("image");
		CardLayout card = new CardLayout();
		CardLayout card2 = new CardLayout();
		JPanel pan1 = new JPanel(new BorderLayout(20, 20));
		JPanel pan2 = new JPanel(new BorderLayout(20, 20));
		
		JPanel pan3 = new JPanel(new BorderLayout(10,10));
		pan3.setLayout(card2);
		JButton but1 = new JButton("버튼1");
		

		f.setLayout(card);
		f.add("first", pan1);
		f.add("second", pan2);
	//	f.add(pan3);

		// f.setLayout(new BorderLayout()); 코드없어도 똑같음

		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(new ImageIcon("myfiles2/images/animals/img2.jpg"));

		JLabel imageLabel2 = new JLabel();
		imageLabel2.setIcon(new ImageIcon("myfiles2/images/animals/img1.jpg"));

		try {
			// 1. 이미지의 크기를 수정하기 위해 불러옴

			BufferedImage bufferedImage = ImageIO.read(new File("myfiles2/images/animals/img2.jpg"));

			// 2. 불러온 이미지로부터 사이즈가 조절된 새로운 인스턴스를 받을 수 있음
			Image scaledImage = bufferedImage.getScaledInstance(210, 180, Image.SCALE_SMOOTH);

			// Image subImage = bufferedImage.getSubimage(100, 100, 150, 150);

			// 3. 크기가 조절된 이미지를 라벨에 붙임
			imageLabel.setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// imageLabel.setIcon(null);

		// 다음 버튼을 누르면 이미지가 교체되도록
		JButton southBtn = new JButton("next");
		JButton southBtn2 = new JButton("prev");
		JButton southBtn3 = new JButton("cycle");
		JButton southBtn4 = new JButton("cycle");
		pan1.add(southBtn, "South");
		pan1.add(imageLabel, "Center");
		pan1.add(southBtn3, "North");
		pan2.add(southBtn2, "South");
		pan2.add(imageLabel2, "East");
		pan2.add(southBtn4, "North");

		southBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane());

			}
		});

		southBtn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane());

			}
		});
		southBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(f.getContentPane(), "second");

			}
		});

		southBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(f.getContentPane(), "first");

			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);

	}

}
