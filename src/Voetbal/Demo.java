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
		try{
	    myFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("https://cdn.discordapp.com/attachments/193770757644484608/454171744870072340/Voetbal-goal.jpg")))));
        myFrame.setResizable(false);
        myFrame.pack();
        
	}catch(IOException e) 
		{
	
	System.out.println("test");
	}

}
}