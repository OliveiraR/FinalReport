package Scratch5WinClear;

import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // scoreboard
{

    private static JLabel lblScoreX, lblScoreO;
    int nScore;
    String sScore;
    String sScoreX, sScoreO;
    public int nScoreX = 0, nScoreO = 0;

    public PanScore() {
        lblScoreX = new JLabel("X - " + nScoreX);
        add(lblScoreX);
        lblScoreO = new JLabel("O - " + nScoreO);
        add(lblScoreO);
        this.setBackground(Color.white); //Score panel colour
    }

    public void UpdateScoreLabel(int _nWinX, int _nWinO) {
        nScoreX = _nWinX;
        nScoreO = _nWinO;
        sScoreX = Integer.toString(nScoreX);
        sScoreO = Integer.toString(nScoreO);
        lblScoreX.setText("X - " + sScoreX);
        lblScoreO.setText("O - " + sScoreO);
    }
}
