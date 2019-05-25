// CalculusJeopardy.java
// April 18th, 2019
// Ashish D'Souza

package calculusjeopardy;

import java.awt.Color;
import javax.swing.JFrame;

public class CalculusJeopardy {

    static MainJeopardyUI frame;
    static QuestionUI frame2;
    static String[][] questions = {
        {"", ""},
        {"", ""},
        {"", ""}
    };
    static String[][] answers = {
        {"", ""},
        {"", ""},
        {"", ""}
    };
    public static void main(String[] args) {
        // TODO code application logic here
        frame = new MainJeopardyUI();
        frame2 = new QuestionUI();
        
        frame.setTitle("Jeopardy");
        frame2.setTitle("Jeopardy");
        
        frame.setLocationRelativeTo(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.getContentPane().setBackground(Color.BLACK);
        
        frame.setVisible(true);
    }
    
}
