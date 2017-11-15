import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Jose Beauchamp");
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) screenSize.getWidth(); // the screen width
        int height = (int) screenSize.getHeight();// the screen height
        myFrame.setLocation((width/2) -100, (height/2) -100);
        myFrame.setSize(200, 200);
        myFrame.setVisible(true);
    }
}