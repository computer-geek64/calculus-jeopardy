// CalculusJeopardy.java
// May 25th, 2019
// Ashish D'Souza

package calculusjeopardy;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculusJeopardy {

    static MainJeopardyUI frame;
    static QuestionUI frame2;
    static ScoresUI frame3;
    static String[] contestants;
    static int[] scores;
    static String[][] questions;
    static String[][] answers;
    static int[] currentQuestion;
    static int totalQuestions;
    static boolean isFinalJeopardy;
    static String finalJeopardyQuestion;
    static String finalJeopardyAnswer;
    static int[] finalJeopardyBets;
    
    public static void updateScores() {
        if(scores[0] < 0) {
            frame3.scoreLabel1.setText("-$" + -scores[0]);
            frame3.scoreLabel1.setForeground(Color.RED);
        }
        else {
            frame3.scoreLabel1.setText("$" + scores[0]);
            frame3.scoreLabel1.setForeground(Color.WHITE);
        }
        
        if(scores[1] < 0) {
            frame3.scoreLabel2.setText("-$" + -scores[1]);
            frame3.scoreLabel2.setForeground(Color.RED);
        }
        else {
            frame3.scoreLabel2.setText("$" + scores[1]);
            frame3.scoreLabel2.setForeground(Color.WHITE);
        }
        
        if(scores[2] < 0) {
            frame3.scoreLabel3.setText("-$" + -scores[2]);
            frame3.scoreLabel3.setForeground(Color.RED);
        }
        else {
            frame3.scoreLabel3.setText("$" + scores[2]);
            frame3.scoreLabel3.setForeground(Color.WHITE);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Initialize JFrames
        frame = new MainJeopardyUI();
        frame2 = new QuestionUI();
        frame3 = new ScoresUI();
        
        scores = new int[] {0, 0, 0};
        
        // Get contestant names
        contestants = new String[3];
        for(int i = 0; i < contestants.length; i++) {
            String newName = JOptionPane.showInputDialog(null, "Enter name for contestant #" + (i+1) + ":", "Contestant #" + (i+1), JOptionPane.QUESTION_MESSAGE);
            while(newName == null || newName.equals("")) {
                JOptionPane.showMessageDialog(null, "Invalid name entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
                newName = JOptionPane.showInputDialog(null, "Enter name for contestant #" + (i+1) + ":", "Contestant #" + (i+1), JOptionPane.QUESTION_MESSAGE);
            }
            contestants[i] = newName;
        }
        
        frame2.correct1.setText(contestants[0]);
        frame2.incorrect1.setText(contestants[0]);
        frame2.correct2.setText(contestants[1]);
        frame2.incorrect2.setText(contestants[1]);
        frame2.correct3.setText(contestants[2]);
        frame2.incorrect3.setText(contestants[2]);
        
        frame3.contestantLabel1.setText(contestants[0]);
        frame3.contestantLabel2.setText(contestants[1]);
        frame3.contestantLabel3.setText(contestants[2]);
        
        updateScores();
        
        questions = new String[][] {
            {"The expression x<sup>2</sup>+5x-13 has this derivative.", "The expression 4x<sup>3</sup>+5x-7 has an antiderivative of this.", "The function f(x)=3x<sup>2</sup>+6x-7 has a relative this at x=-1.", "The function f(x)=x<sup>2</sup>-7x-3 is concave in this direction at the point (2,-13)."}, // 200
            {"The expression (x+3)/(x<sup>2</sup>) has this derivative.", "The expression 5x<sup>7</sup>-7x<sup>2</sup>+6x has this antiderivative.", "The function g(x)=7x<sup>2</sup>-28x+27 has a relative this at x=2.", "The function f(x)=5x<sup>3</sup>-6x has a point of inflection at this x value on the interval [-5,5]."}, // 400
            {"This is the derivative of the expression (2x<sup>2</sup>-5)(7x-x<sup>3</sup>).", "The function f(x)=3x<sup>2</sup>-5x+2 has an area of this value on the interval [1,3].", "This value of x creates a relative minimum when f(x)=x<sup>2</sup>+6x-7.", "The function f(x)=3x<sup>4</sup>+5x<sup>3</sup>-7x+7 is concave in this direction at the point (-3,136)."}, // 600
            {"The function f(x)=x<sup>3</sup>+8x-7 has this tangent line at the point (1,2).", "The function f(x)=(7x<sup>3</sup>)/2-6 has an area of this value on the interval [2,5].", "This value of x creates a relative minimum when g(x)=6x<sup>3</sup>+3x<sup>2</sup>-24x.", "The function f(x)=6x<sup>3/2</sup>-5x<sup>6</sup>-4 is concave in this direction at x=2."}, // 800
            {"This equation gives the tangent line of the function g(x)=7x<sup>3</sup>+5x<sup>2</sup>+4x<sup>4</sup>+4 at the point (1,20).", "The function f(x)=9x<sup>2</sup>+3 has an average value of this on the interval [0,2].", "A relative maximum may exist at this x value for h(x)=9x<sup>3</sup>+5.", "The function f(x)=(x-5)(x-1)<sup>3</sup> has a point of inflection at this x value on the interval [2,6]."} // 1000
        };
        answers = new String[][] {
            {"2x+5", "x<sup>4</sup>+(5x<sup>2</sup>)/2-7x+C", "minimum", "up"}, // 200
            {"(-x-6)/(x<sup>3</sup>)", "(5x<sup>8</sup>)/8-(7x<sup>3</sup>)/3+3x<sup>2</sup>+C", "minimum", "0"}, // 400
            {"-10x<sup>4</sup>+57x<sup>2</sup>-35", "10", "-3", "up"}, // 600
            {"y=11x-9", "4119/8 or 514.875", "1", "down"}, // 800
            {"y=47x-27", "30", "DNE", "3"} // 1000
        };
        
        currentQuestion = new int[2];
        totalQuestions = 0;
        
        isFinalJeopardy = false;
        finalJeopardyQuestion = "Given the function <br>f(x)=[ln(3x)]/(x<sup>2</sup>),<br> f approaches this value as x approaches &infin;.";
        finalJeopardyAnswer = "0";
        finalJeopardyBets = new int[3];
        
        frame.setTitle("Jeopardy");
        frame2.setTitle("Jeopardy");
        frame3.setTitle("Scores");
        
        // Set frame locations
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = graphicsEnvironment.getDefaultScreenDevice();
        Rectangle screenResolution = defaultScreen.getDefaultConfiguration().getBounds();
        frame.setLocationRelativeTo(null);
        frame.setLocation(frame.getLocation().x, (int) screenResolution.getMaxY() - frame.getHeight());
        frame3.setSize(600, 100);
        frame3.setLocationRelativeTo(null);
        frame3.setLocation(frame3.getLocation().x, 0);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame3.setAlwaysOnTop(true);
        
        frame.getContentPane().setBackground(Color.BLACK);
        frame2.getContentPane().setBackground(new Color(6, 12, 233));
        frame3.getContentPane().setBackground(new Color(6, 12, 233));
        
        frame.setVisible(true);
        frame3.setVisible(true);
    }
    
}
