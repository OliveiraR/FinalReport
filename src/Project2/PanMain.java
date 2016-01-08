package Project2;


import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{

    PanOut panOut = new PanOut();
    PanScore panScore = new PanScore();
    PanGame panGame = new PanGame(panScore);
    private PanOut PanOut;
    private PanScore PanScore;

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panOut, BorderLayout.NORTH);
       add(panGame, BorderLayout.CENTER);
        add(panScore, BorderLayout.EAST);
    }
}