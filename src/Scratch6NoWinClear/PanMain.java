package Scratch6NoWinClear;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanMain extends JPanel {

    BtnSquare arBtnSquares[] = new BtnSquare[9];
    PanScore panScore = new PanScore();

    public PanMain() {

        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < arBtnSquares.length; i++) {
            arBtnSquares[i] = new BtnSquare(i);
            arBtnSquares[i].setText("");
            add(arBtnSquares[i]);
            Click click = new Click();
            arBtnSquares[i].addActionListener(click);
        }
    }

    public class Click implements ActionListener {

        public int nStatus = -1;  //used to see whose turn it is
        public int nWinX, nWinO;
        public int nBigX, nBigO;
        public int nBtnText = 0, nBtnSum = 0;
        boolean isClicked = false;

        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < arBtnSquares.length; i++) {
                String sX = ("X"), sO = ("O");
                arBtnSquares[i].setFont(arBtnSquares[i].getFont().deriveFont(72.0f));
                if (arBtnSquares[i].isEnabled()) {
                    isClicked = true;
                    ///nStatus *= -1;

                    //nBtnText += 1;
                    //System.out.println(nBtnText);
                    //nBtnText = nBtnText + nBtnText;
                    //nBtnSum = nBtnSum + nBtnText;
                    //System.out.println(nBtnSum);
                }

                if (e.getSource() == arBtnSquares[i]) { //arBtnSquares[i] was clicked
                    // Helped from http://stackoverflow.com/questions/13548299/how-do-i-tell-which-button-is-being-clicked-in-an-array-of-buttons
                    if (nStatus == 1) { //if nStatus=1, X is shown on button
                        arBtnSquares[i].setText(sX);
                        //nBtnText += 1;
                    } else if (nStatus == -1) { //if nStatus=-1, O is shown on button
                        arBtnSquares[i].setText(sO);
                        //nBtnText += 1;
                    }
                }
                if (nBtnSum <= 8) {
                    arBtnSquares[i].setText(""); //reset board
                }
            }
            if (isClicked = true) {
                nBtnText++;
                System.out.println(nBtnText);
                nBtnSum = nBtnSum + nBtnText;
                System.out.println("count" + nBtnSum);

                nStatus *= -1;
                //System.out.println("clicked " + nStatus);
            }
        }
    }
}
