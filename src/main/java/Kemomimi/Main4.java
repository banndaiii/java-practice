package Kemomimi;

import javax.swing.*;
import java.awt.*;

public class Main4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("けもみみアプリ");
        frame.getContentPane().setPreferredSize(new Dimension(300, 300));
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("けもみみ～(気さくな挨拶)"));
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
