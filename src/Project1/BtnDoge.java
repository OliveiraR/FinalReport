package Project1;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class BtnDoge extends JButton {

    BtnDoge(int _nNum) {
        this.setBackground(Color.GRAY); // Colour of squares
        this.setBorder(BorderFactory.createLineBorder(Color.lightGray)); //Changes grid line colour
        //https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        //this.setBorderPainted(false); //Takes out the grid lines
    }
}