package Project2;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(600, 700);
        setTitle("Version 2"); //Sets the title of the tab
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);
        setResizable(false);

    }
}