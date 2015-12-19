package Scratch4;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    PanMain panMain = new PanMain();

    FraMain() {
        setSize(600, 700);
        setTitle("Button Check"); //Sets the title of the tab
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(panMain, BorderLayout.CENTER);
    }
}
