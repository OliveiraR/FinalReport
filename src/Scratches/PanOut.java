package Scratches;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    JLabel lblOutput;

    public PanOut() {
        lblOutput = new JLabel("TIC TAC TOE"); //setFont line has to be after the Line with the words
        lblOutput.setFont(lblOutput.getFont().deriveFont(72.0f)); // Changes the size of font
        //Learned from http://stackoverflow.com/questions/10630738/how-to-set-strings-font-size-style-in-java-using-the-font-class
        lblOutput.setForeground(Color.BLUE); //panel colour
        add(lblOutput);
    }
}
