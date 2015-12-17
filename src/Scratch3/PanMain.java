package Scratch3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanMain extends JPanel {

    BtnSquare arBtnSquares[] = new BtnSquare[9];
    String sIndex;
    // private int i = 0;

    public PanMain() {
        setFocusable(true);
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < arBtnSquares.length; i++) {
            arBtnSquares[i] = new BtnSquare(i);
            arBtnSquares[i].setText(" ");
            add(arBtnSquares[i]);
            Click click = new Click();

            arBtnSquares[i].addActionListener(click);
            sIndex = String.valueOf(i);
            // arBtnSquares[i].setActionCommand(sIndex);

        }
    }

    public class Click implements ActionListener {

        int nCheck;

        public void actionPerformed(ActionEvent e) {
            /*
             for (int j = 0; j < arBtnSquares.length; j++) {
             if (e.getSource() == arBtnSquares[i]) { //button[i] was clicked
             if(arBtnSquares[i] == arBtnSquares[j]){//
             arBtnSquares[i].setText("X");
             }
             }
             }
             * */
            for (int i = 0; i < arBtnSquares.length; i++) {
                nCheck = 0;
                // int nCheck = arBtnSquares[i];
                //if (nCheck < arBtnSquares[i]) {
                //if (arBtnSquares[i] > nCheck) {
                if (i > nCheck) {
                    nCheck = i;
                }

                //arBtnSquares[0].setText("X");
            }
            arBtnSquares[nCheck].setText("X");
        }

        /*   @Override
         public void actionPerformed(ActionEvent e) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }*/
    }
}
        /*
         *     public static int bigee(int arnNumb[], int nSize) {
         int nBig = arnNumb[0];
         for (int i = 1; i < nSize; i++) {
         if (arnNumb[i] > nBig) {
         nBig = arnNumb[i];
         }
         }
         return nBig;
         }
         */