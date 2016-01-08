package Scratch4ValueChanges;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

class BtnSquare extends JButton{

    JLabel lblXO;
    int nStatus, nNum;
    

    BtnSquare(int _nNum) {
        nNum = _nNum;
        nStatus =0; //start blank  - 1 for x, -1 for o 
        
        
        
        /*
        lblGridbtn = new JLabel("X");
        lblGridbtn.setFont(lblGridbtn.getFont().deriveFont(72.0f));
        add(lblGridbtn);
        * */
        
       
            

    }
    public int getNum(){
        return nNum;
    }
    public void clicked(){
        System.out.println("I  was clicked");
    }
     

    
}
    
    
       

