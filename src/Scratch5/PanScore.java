package Scratch5;

import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // scoreboard
{

    private static JLabel lblScoreX, lblScoreO;
    int nScore;
    String sScore;
    String sScoreX, sScoreO;

    public PanScore() {
        lblScoreX = new JLabel("X - 0");
        add(lblScoreX);
        lblScoreO = new JLabel("O - 0");
        add(lblScoreO);
        this.setBackground(Color.white); //Score panel colour
    }

    public void UpdateScoreLabel(int nWinX, int nWinO) {
        //nScore = _nScore;
        sScoreX = Integer.toString(nWinX);
        sScoreO = Integer.toString(nWinO);
        lblScoreX.setText("X - " + sScoreX);
        lblScoreO.setText("O - " + sScoreO);
    }
}
