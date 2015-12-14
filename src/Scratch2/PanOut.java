package Scratch2;

import javax.swing.*;

public class PanOut extends JPanel {// implements ActionListener {

    JLabel label2, labelO;
    ImageIcon imageX, imageO;

    public PanOut() {
        imageX = new ImageIcon("X.png");
        imageO = new ImageIcon("O.png");
        labelO = new JLabel(" ");
        labelO.setIcon(imageO);
        labelO.setSize(50, 50);
        add(labelO);
        label2 = new JLabel(" ");
        label2.setIcon(imageX);
        add(label2);
        labelO.setVisible(true);
        label2.setVisible(true);
        setFocusable(true);
    }
}