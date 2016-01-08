
package Scratch6NoWinClear;

import javax.swing.JButton;
import javax.swing.JLabel;

class BtnSquare extends JButton {

    JLabel lblXO;
    int nStatus, nNum;

    BtnSquare(int _nNum) {
        nNum = _nNum;
    }

    public int getNum() {
        return nNum;
    }
}