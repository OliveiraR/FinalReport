package Scratch1Text;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FraMain extends JFrame {

    JLabel lblOutput;
    PanOut panOut = new PanOut();

    FraMain() {
        setSize(600, 700);
        setTitle("Font"); //Sets the title of the tab
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(panOut, BorderLayout.NORTH);
    }
}
