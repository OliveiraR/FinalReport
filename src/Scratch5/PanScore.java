package Scratch5;

import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // scoreboard
{

    private static JLabel lblScoreX, lblScoreO;
    int nScore;
    String sScore;
    String sScoreX, sScoreO;
    private int nScoreX, nScoreO;

    public PanScore() {
        lblScoreX = new JLabel("X - 0");
        add(lblScoreX);
        lblScoreO = new JLabel("O - 0");
        add(lblScoreO);
        this.setBackground(Color.white); //Score panel colour
    }

    public void UpdateScoreLabel(int nWinX, int nWinO) {
        //nScore = _nScore;
        nScoreX = nWinX;
        nScoreO = nWinO;
        sScoreX = Integer.toString(nScoreX);
        sScoreO = Integer.toString(nScoreO);
        lblScoreX.setText("X - " + sScoreX);
        lblScoreO.setText("O - " + sScoreO);
    }
}
