package Basics;

import javax.swing.JFrame;

class FraMain extends JFrame {

    public FraMain() {
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("Howdy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
