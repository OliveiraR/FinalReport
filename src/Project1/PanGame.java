package Project1;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class PanGame extends JPanel {

    BtnDoge arGridSqr[] = new BtnDoge[9];
    Map<Integer, Integer> map = new HashMap<>();
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
/*    BtnDoge arBtnDoge[] = new BtnDoge[9];

 *   public PanGame(PanScore _panScore) {
        panScore = _panScore;
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < arBtnDoge.length; i++) {
            arBtnDoge[i] = new BtnDoge(i);
            add(arBtnDoge[i]);
        }
    }
 */