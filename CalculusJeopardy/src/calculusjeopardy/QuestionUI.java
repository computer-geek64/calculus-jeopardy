/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculusjeopardy;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author root
 */
public class QuestionUI extends javax.swing.JFrame {

    public Timer timer;
    public boolean timerScheduled;
    public TimerTask timerTask;
    
    /**
     * Creates new form QuestionUI
     */
    public QuestionUI() {
        initComponents();
        timer = new Timer();
        timerScheduled = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        correct1 = new javax.swing.JButton();
        incorrect1 = new javax.swing.JButton();
        correct2 = new javax.swing.JButton();
        incorrect2 = new javax.swing.JButton();
        correct3 = new javax.swing.JButton();
        incorrect3 = new javax.swing.JButton();
        answer = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        question.setBackground(new java.awt.Color(6, 12, 233));
        question.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("Question");
        question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionMouseClicked(evt);
            }
        });

        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        correct1.setBackground(new java.awt.Color(0, 255, 0));
        correct1.setForeground(new java.awt.Color(0, 0, 0));
        correct1.setText("#1 Correct");
        correct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct1ActionPerformed(evt);
            }
        });
        buttonPanel.add(correct1);

        incorrect1.setBackground(new java.awt.Color(255, 0, 0));
        incorrect1.setForeground(new java.awt.Color(255, 255, 255));
        incorrect1.setText("#1 Incorrect");
        incorrect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrect1ActionPerformed(evt);
            }
        });
        buttonPanel.add(incorrect1);

        correct2.setBackground(new java.awt.Color(0, 255, 0));
        correct2.setForeground(new java.awt.Color(0, 0, 0));
        correct2.setText("#2 Correct");
        correct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct2ActionPerformed(evt);
            }
        });
        buttonPanel.add(correct2);

        incorrect2.setBackground(new java.awt.Color(255, 0, 0));
        incorrect2.setForeground(new java.awt.Color(255, 255, 255));
        incorrect2.setText("#2 Incorrect");
        incorrect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrect2ActionPerformed(evt);
            }
        });
        buttonPanel.add(incorrect2);

        correct3.setBackground(new java.awt.Color(0, 255, 0));
        correct3.setForeground(new java.awt.Color(0, 0, 0));
        correct3.setText("#3 Correct");
        correct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct3ActionPerformed(evt);
            }
        });
        buttonPanel.add(correct3);

        incorrect3.setBackground(new java.awt.Color(255, 0, 0));
        incorrect3.setForeground(new java.awt.Color(255, 255, 255));
        incorrect3.setText("#3 Incorrect");
        incorrect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrect3ActionPerformed(evt);
            }
        });
        buttonPanel.add(incorrect3);

        answer.setBackground(new java.awt.Color(0, 0, 255));
        answer.setForeground(new java.awt.Color(255, 255, 255));
        answer.setText("Answer");
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });
        buttonPanel.add(answer);

        timerLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("<html><br><br>Timer</html>");
        timerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timerLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timerLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMouseClicked
        // TODO add your handling code here:
        closeQuestion();
    }//GEN-LAST:event_questionMouseClicked

    private void correct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct1ActionPerformed
        // TODO add your handling code here:        
        if(!CalculusJeopardy.isFinalJeopardy) {
            correct2.setEnabled(false);
            incorrect2.setEnabled(false);
            correct3.setEnabled(false);
            incorrect3.setEnabled(false);
        }
        
        correct1.setEnabled(false);
        incorrect1.setEnabled(false);
        
        CalculusJeopardy.scores[0] += CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[0] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_correct1ActionPerformed

    private void incorrect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrect1ActionPerformed
        // TODO add your handling code here:
        correct1.setEnabled(false);
        incorrect1.setEnabled(false);
        
        CalculusJeopardy.scores[0] -= CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[0] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_incorrect1ActionPerformed

    private void correct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct2ActionPerformed
        // TODO add your handling code here:
        if(!CalculusJeopardy.isFinalJeopardy) {
            correct1.setEnabled(false);
            incorrect1.setEnabled(false);
            correct3.setEnabled(false);
            incorrect3.setEnabled(false);
        }
        correct2.setEnabled(false);
        incorrect2.setEnabled(false);
        
        
        CalculusJeopardy.scores[1] += CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[1] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_correct2ActionPerformed

    private void incorrect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrect2ActionPerformed
        // TODO add your handling code here:
        correct2.setEnabled(false);
        incorrect2.setEnabled(false);
        
        CalculusJeopardy.scores[1] -= CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[1] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_incorrect2ActionPerformed

    private void correct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct3ActionPerformed
        // TODO add your handling code here:
        if(!CalculusJeopardy.isFinalJeopardy) {
            correct1.setEnabled(false);
            incorrect1.setEnabled(false);
            correct2.setEnabled(false);
            incorrect2.setEnabled(false);
        }
        correct3.setEnabled(false);
        incorrect3.setEnabled(false);
        
        CalculusJeopardy.scores[2] += CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[2] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_correct3ActionPerformed

    private void incorrect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrect3ActionPerformed
        // TODO add your handling code here:
        correct3.setEnabled(false);
        incorrect3.setEnabled(false);
        
        CalculusJeopardy.scores[2] -= CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyBets[2] : (CalculusJeopardy.currentQuestion[0] + 1) * 200;
        CalculusJeopardy.updateScores();
    }//GEN-LAST:event_incorrect3ActionPerformed

    private void timerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timerLabelMouseClicked
        // TODO add your handling code here:
        if(timerScheduled) {
            return;
        }
        timerScheduled = true;
        if(!CalculusJeopardy.isFinalJeopardy) {
            timerTask = new TimerTask() {
                int timeRemaining = 30;
                @Override
                public void run() {
                    String timeString = timeRemaining < 10 ? "0" + timeRemaining : "" + timeRemaining;
                    timerLabel.setText("<html><br><br>0:" + timeString + "</html>");
                    if(timeRemaining == 0) {
                        timerLabel.setForeground(Color.RED);
                        cancel();
                    }
                    timeRemaining--;
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, 1000);
        }
        else {
            timerLabel.setText("<html><br><br>1:00</html>");
            timerTask = new TimerTask() {
                int timeRemaining = 59;
                @Override
                public void run() {
                    String timeString = timeRemaining < 10 ? "0" + timeRemaining : "" + timeRemaining;
                    timerLabel.setText("<html><br><br>0:" + timeString + "</html>");
                    if(timeRemaining == 0) {
                        timerLabel.setForeground(Color.RED);
                        cancel();
                    }
                    timeRemaining--;
                }
            };
            timer.scheduleAtFixedRate(timerTask, 1000, 1000);
        }
    }//GEN-LAST:event_timerLabelMouseClicked

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
        correct1.setEnabled(false);
        incorrect1.setEnabled(false);
        correct2.setEnabled(false);
        incorrect2.setEnabled(false);
        correct3.setEnabled(false);
        incorrect3.setEnabled(false);
        String answerString = "<html><center>" + (CalculusJeopardy.isFinalJeopardy ? CalculusJeopardy.finalJeopardyAnswer : CalculusJeopardy.answers[CalculusJeopardy.currentQuestion[0]][CalculusJeopardy.currentQuestion[1]]) + "</center></html>";
        JOptionPane.showMessageDialog(null, new JLabel(answerString, JLabel.CENTER), "Answer", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_answerActionPerformed

    private void closeQuestion() {
        if(CalculusJeopardy.isFinalJeopardy) {
            JOptionPane.showMessageDialog(null, "Developed by Ashish D'Souza and Matthew Weis", "Thank you", JOptionPane.PLAIN_MESSAGE);
            setVisible(false);
            CalculusJeopardy.frame.setVisible(false);
            CalculusJeopardy.frame3.setVisible(false);
            System.exit(0);
        }
        correct1.setEnabled(true);
        incorrect1.setEnabled(true);
        correct2.setEnabled(true);
        incorrect2.setEnabled(true);
        correct3.setEnabled(true);
        incorrect3.setEnabled(true);
        
        timerLabel.setForeground(Color.WHITE);
        timerLabel.setText("<html><br><br>Timer</html>");
        if(timerScheduled) {
            timerTask.cancel();
            timerScheduled = false;
        }
        
        setVisible(false);
        if(CalculusJeopardy.totalQuestions < 20) {
            CalculusJeopardy.frame.setVisible(true);
            return;
        }
        CalculusJeopardy.isFinalJeopardy = true;
        CalculusJeopardy.frame.setVisible(false);
        
        JLabel finalJeopardyLabel = new JLabel("FINAL JEOPARDY: LIMITS", JLabel.CENTER);
        finalJeopardyLabel.setFont(new Font("Serif", Font.PLAIN, 36));
        JOptionPane.showMessageDialog(null, finalJeopardyLabel, "Final Jeopardy", JOptionPane.PLAIN_MESSAGE);
        
        // Get Final Jeopardy Bets
        for(int i = 0; i < CalculusJeopardy.finalJeopardyBets.length; i++) {
            JPasswordField password = new JPasswordField();
            String newBet = "";
            if(JOptionPane.showConfirmDialog(null, password, CalculusJeopardy.contestants[i] + "\'s Final Jeopardy Bet", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                newBet = password.getText();
            }
            // String newBet = JOptionPane.showInputDialog(null, "Enter " + CalculusJeopardy.contestants[i] + "\'s bet for Final Jeopardy:", "Final Jeopardy Bet", JOptionPane.QUESTION_MESSAGE);
            while(newBet == null || newBet.equals("")) {
                JOptionPane.showMessageDialog(null, new JLabel("Invalid bet entered.", JLabel.CENTER), "ERROR", JOptionPane.ERROR_MESSAGE);
                if(JOptionPane.showConfirmDialog(null, password, CalculusJeopardy.contestants[i] + "\'s Final Jeopardy Bet", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                    newBet = password.getText();
                }
                // newBet = JOptionPane.showInputDialog(null, "Enter " + CalculusJeopardy.contestants[i] + "\'s bet for Final Jeopardy:", "Final Jeopardy Bet", JOptionPane.QUESTION_MESSAGE);
            }
            try {
                CalculusJeopardy.finalJeopardyBets[i] = Integer.parseInt(newBet);
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, new JLabel("Invalid bet entered.", JLabel.CENTER), "ERROR", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }
        
        // Set up question
        question.setText("<html><center>" + CalculusJeopardy.finalJeopardyQuestion + "</center></html>");
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton answer;
    public javax.swing.JPanel buttonPanel;
    public javax.swing.JButton correct1;
    public javax.swing.JButton correct2;
    public javax.swing.JButton correct3;
    public javax.swing.JButton incorrect1;
    public javax.swing.JButton incorrect2;
    public javax.swing.JButton incorrect3;
    public javax.swing.JLabel question;
    public javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}
