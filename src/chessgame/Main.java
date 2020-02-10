package chessgame;

import javax.swing.JFrame;

public class Main {
    public static void main(String args[]) {
        Board t = new Board();
        JFrame frame = new JFrame();
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(t);
        frame.setVisible(true);

    }
}
