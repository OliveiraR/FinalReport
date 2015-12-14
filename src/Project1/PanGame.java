package Project1;

import java.awt.*;
import javax.swing.*;

public class PanGame extends JPanel {

    BtnDoge arGridSqr[] = new BtnDoge[9];
    PanScore panScore;

    public PanGame(PanScore _panScore) {
        panScore = _panScore;
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < arGridSqr.length; i++) {
            arGridSqr[i] = new BtnDoge(i);
            add(arGridSqr[i]);
        }
    }
}