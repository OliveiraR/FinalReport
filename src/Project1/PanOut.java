package Project1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    ImageIcon imgHeader;
//    JButton btnHeader;
    JLabel lblHeader;
    JLabel lblOutput;

    public PanOut() {
        /*  lblHeader = new JLabel();
         imgHeader = new ImageIcon("dogeheader.jpg");
         lblHeader.setIcon(imgHeader);  */
        this.setBackground(Color.white);
        lblOutput = new JLabel("TIC TAC TOE"); //setFont line has to be after the Line with the words
        lblOutput.setFont(lblOutput.getFont().deriveFont(72.0f)); // Changes the size of font
        //Learned from http://stackoverflow.com/questions/10630738/how-to-set-strings-font-size-style-in-java-using-the-font-class
        add(lblOutput);
    }
}