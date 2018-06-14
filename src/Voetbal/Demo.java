package Voetbal;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Demo {



	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		myFrame.setSize(1920, 1080);
		myFrame.setContentPane(new MyPanel());
		myFrame.setVisible(true);
		myFrame.setLayout(null);

		JButton goal1 = new JButton("knop");
		goal1.addActionListener(new MyPanel.AddCarTimerHandler());

		MyPanel.add(goal1);
	}
}