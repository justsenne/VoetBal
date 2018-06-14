package Voetbal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.Timer;


public class MyObject extends JLabel {

    private int doelLocatie = 3;
    //int[] XY;
  private  int[] doelXY;
   private int[] diffXY;
    int x;
    int y;
    Timer timer;
    int id;
    int[] LocationSteps;

    public MyObject(int id) {

        super(String.valueOf(id));

        this.id = id;

        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setBounds(0, 600, 5, 5);

        setXY();
        timer = new Timer(10, new MoveHandler());
        timer.start();
    }

    private void moveDown() {
        //System.out.println("...move down ("+id+")");
        //int[] Location = getXY();
        System.out.println(diffXY[0] + " " + diffXY[1]);
        System.out.println(doelXY);

        this.setBounds(this.getX()+ diffXY[0], this.getY() + diffXY[1], 50, 50);

		 if (this.getY() < doelXY[1]) {
			System.out.println("Te hoog > verwijder het object");
			timer.stop();
			((MyPanel) this.getParent()).removeObject(this);
		}
		// nog voor x doen!
    }

    class MoveHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            moveDown();
        }
    }


    public void setXY() {
        diffXY = new int[2];
        doelXY = new int[2];

        switch (doelLocatie) {
            case 1:
                x = 1;
                y = -1;
            break;

            case 2:
                x = 2;
                y = -2;
            break;

            case 3:

                //int eindX = 800;
              // int eindY = 400;
               doelXY[0] = 800;
               doelXY[1] = 200;

                x = 4;
                y = -4;
            break;
        }
       // XY[0] = x;
       // XY[1] = y;
        diffXY[0] = (doelXY[0] - this.getX())/100;
        diffXY[1] = (doelXY[1] - this.getY())/100;
       // return XY;
    }


    @Override
    public String toString() {
        return "MyObject " + id;
    }

}
