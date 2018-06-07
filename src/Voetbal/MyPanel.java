package Voetbal;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel {

	MyObject car;
	Timer timer;
	int counter;
	
	Image background;
	public MyPanel() {
		try {
			background = ImageIO.read(new File("images/Voetbal-goal.jpg"));
		} catch (IOException e) {
			System.out.println("Fout bij het laden van de achtergrond afbeelding. " + e.getMessage());
		}
	

		this.setLayout(null);

		timer = new Timer(2000, new AddCarTimerHandler());
		timer.start();
	}

	public void removeObject(MyObject obj) {
		System.out.println("Remove obj: " + obj);
		// Verwijder het object van het JPanel (tegenovergestelde van add())
		this.remove(obj);
		// Controleer het aantal objecten
		System.out.println("Aantal objecten in het panel: " + this.getComponentCount());
	}

	class AddCarTimerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			add(new MyObject(++counter));
			System.out.println("Komt-ie! ("+counter+")");
			
		
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// Teken de achtergrond afbeelding
		g.drawImage(background, 0, 0, this);
	}

}