package chessgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testimage extends JFrame{

    public testimage() {
    JFrame snakeFrame = new JFrame();
    snakeFrame.setBounds(100, 200, 800, 800);
    snakeFrame.setVisible(true);
    snakeFrame.add(new JLabel(new ImageIcon("src/chessgame/bb.png")));
    snakeFrame.pack();
    }
    public static void main(String args[]) {
        new testimage();
    }
}
