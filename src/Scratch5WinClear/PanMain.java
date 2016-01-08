package Scratch5WinClear;

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
        //public int nButtons = 0;
        public int nBigX, nBigO;
        //nStatus updates 1 button only
        //Starts at -1 since it *-1 each time to get next peice, this will make x go first

        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < arBtnSquares.length; i++) {
                String sX = ("X"), sO = ("O");
                arBtnSquares[i].setFont(arBtnSquares[i].getFont().deriveFont(72.0f));
                if (arBtnSquares[i].isEnabled()) {
                    nStatus *= -1;
                }
                if (e.getSource() == arBtnSquares[i]) { //arBtnSquares[i] was clicked
                    // Helped from http://stackoverflow.com/questions/13548299/how-do-i-tell-which-button-is-being-clicked-in-an-array-of-buttons
                    //nStatus *= -1;
                    if (nStatus == 1) { //if nStatus=1, X is shown on button
                        //arBtnSquares[i].setText("X");
                        arBtnSquares[i].setText(sX);
                    } else if (nStatus == -1) { //if nStatus=-1, O is shown on button
                        arBtnSquares[i].setText("O");
                    }
                }
//                if (arBtnSquares[i].getText().equals("X") || arBtnSquares[i].getText().equals("O")) {
//                    nButtons = 1;
//                } else {
//                    nButtons = 0;
//                }
                if (arBtnSquares[0].getText().matches(sX) && arBtnSquares[1].getText().matches(sX) && arBtnSquares[2].getText().matches(sX)) {
                    //Checks if X is in square 1,2,3
                    nWinX++;
                }
                if (arBtnSquares[0].getText().matches(sO) && arBtnSquares[1].getText().matches(sO) && arBtnSquares[2].getText().matches(sO)) {
                    //Checks if O is in square 1,2,3
                    nWinO++;
                }
                if (arBtnSquares[3].getText().matches(sX) && arBtnSquares[4].getText().matches(sX) && arBtnSquares[5].getText().matches(sX)) {
                    //Checks if X is in square 4,5,6
                    nWinX++;
                }
                if (arBtnSquares[3].getText().matches(sO) && arBtnSquares[4].getText().matches(sO) && arBtnSquares[5].getText().matches(sO)) {
                    //Checks if O is in square 4,5,6
                    nWinO++;
                }
                if (arBtnSquares[6].getText().matches(sX) && arBtnSquares[7].getText().matches(sX) && arBtnSquares[8].getText().matches(sX)) {
                    //Checks if X is in square 7,8,9
                    nWinX++;
                }
                if (arBtnSquares[6].getText().matches(sO) && arBtnSquares[7].getText().matches(sO) && arBtnSquares[8].getText().matches(sO)) {
                    //Checks if O is in square 7,8,9
                    nWinO++;
                }
                if (arBtnSquares[0].getText().matches(sX) && arBtnSquares[4].getText().matches(sX) && arBtnSquares[8].getText().matches(sX)) {
                    //Checks if X is in square 1,5,9
                    nWinX++;
                }
                if (arBtnSquares[0].getText().matches(sO) && arBtnSquares[4].getText().matches(sO) && arBtnSquares[8].getText().matches(sO)) {
                    //Checks if 0 is in square 1,5,9
                    nWinO++;
                }
                if (arBtnSquares[2].getText().matches(sX) && arBtnSquares[4].getText().matches(sX) && arBtnSquares[6].getText().matches(sX)) {
                    //Checks if X is in square 3,5,7
                    nWinX++;
                }
                if (arBtnSquares[2].getText().matches(sO) && arBtnSquares[4].getText().matches(sO) && arBtnSquares[6].getText().matches(sO)) {
                    //Checks if 0 is in square 3,5,7
                    nWinO++;
                }
                for (int j = 0; j < 9; j++) {
                    if (nWinX > nBigX) {
                        arBtnSquares[j].setText(""); //reset board
                    }
                    if (nWinO > nBigO) {
                        arBtnSquares[j].setText(""); //reset board
                    }
                }
                nBigX = Biggest(nWinX, nWinO); //Check if the board needs to be reset because of a win
            }
            panScore.UpdateScoreLabel(nWinX, nWinO);
        }
    }

    public static int Biggest(int nWinX, int nWinO) {
        int nBigX = nWinX;
        int nBigO = nWinO;

        if (nWinX > nBigX) {
            nBigX = nWinX;
        }
        if (nWinO > nBigO) {
            nBigO = nWinO;
            return nBigO;
        }
        return nBigX;
    }
}