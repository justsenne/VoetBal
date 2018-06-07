package Voetbal;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo {



	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		myFrame.setSize(600, 600);
		myFrame.setContentPane(new MyPanel());
		myFrame.setVisible(true);
		myFrame.setLayout(null);
		
	}
}