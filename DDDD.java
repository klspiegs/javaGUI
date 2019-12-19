import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.lang.Math;

public class app {
    private JPanel parentPanel;
    private JButton startButton;
    private JPanel titlePanel;
    private JPanel explainPanel;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private JButton continueButton;
    private JLabel thirdLabel;
    private JPanel explain2Panel;
    private JLabel fourthLabel;
    private JLabel villian;
    private JLabel yourDogs;
    private JPanel explain3Panel;
    private JLabel fifthLabel;
    private JLabel sixthLabel;
    private JLabel seventhLabel;
    private JLabel eighthRoll;
    private JButton continueButton2;
    private JButton continueButton1;
    private JPanel explain4Panel;
    private JButton letsPlayButton;
    private JButton noButton;
    private JLabel ninthLabel;
    private JLabel tenthLabel;
    private JPanel villiansTurn;
    private JPanel explain5Panel;
    private JButton playButton2;
    private JLabel twelveLabel;
    private JLabel eleventhLabel;
    private JPanel villianTurn;
    private JButton vresultsButton;
    private JLabel rollResult;
    private JLabel guessResult;
    private JLabel guessLabel;
    private JLabel rollLabel;
    private JButton contToYourTurn;
    private JPanel yourTurn;
    private JTextField inputGuess;
    private JLabel urGuessResult;
    private JLabel urRollLabel;
    private JLabel urRollResult;
    private JButton submitButton;
    private JButton seeResultsButton;
    private JPanel resultsPanel;
    private JLabel villianStatsLabel;
    private JLabel urStatsLabel;
    private JLabel vPtsLost;
    private JLabel vCurrScore;
    private JLabel vPtsLostVal;
    private JLabel vCurrScoreVal;
    private JLabel urPtsLost;
    private JLabel urCurrScore;
    private JLabel urCurrScoreVal;
    private JLabel urPtsLostVal;
    private JButton continueButton3;
    private JButton finalButton;
    private JPanel villianWins;
    private JPanel youWin;
    private JLabel vwinLabel1;
    private JLabel vwinLabel2;
    private JLabel title;

    int vroll;
    int vguess;
    int urRollVar;
    int urGuessVar;
    int vPtsLostVar;
    //int vCurrScoreVar;
    int urPtsLostVar;
    //int urCurrScoreVar;
    int vscore = 15;
    int urscore = 15;

    Random randomGenerator = new Random();

    public app() {

        ImageIcon titleicon = new ImageIcon("title.png");
        title.setIcon(titleicon);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(explainPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });


        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(explain2Panel);
                parentPanel.repaint();
                parentPanel.revalidate();

                ImageIcon icon = new ImageIcon("ufo1.png");
                villian.setIcon(icon);

                ImageIcon dogicon = new ImageIcon("dog3.png");
                yourDogs.setIcon(dogicon);

            }
        });

        continueButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(explain3Panel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        continueButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(explain4Panel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        letsPlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(villianTurn);
                parentPanel.repaint();
                parentPanel.revalidate();
                contToYourTurn.setEnabled(false);
                vresultsButton.setEnabled(true);
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(explain5Panel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        playButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(villianTurn);
                parentPanel.repaint();
                parentPanel.revalidate();
                contToYourTurn.setEnabled(false);
                vresultsButton.setEnabled(true);
                rollResult.setText("....");
                guessResult.setText("....");
            }
        });
        vresultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contToYourTurn.setEnabled(false);
                vroll = randomGenerator.nextInt(6) + 1;
                vguess = randomGenerator.nextInt(vroll) + 1;
                rollResult.setText(String.valueOf(vroll));
                guessResult.setText(String.valueOf(vguess));
                vresultsButton.setEnabled(false);
                contToYourTurn.setEnabled(true);
            }
        });
        contToYourTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButton.setEnabled(true);
                parentPanel.removeAll();
                parentPanel.add(yourTurn);
                parentPanel.repaint();
                parentPanel.revalidate();
                seeResultsButton.setEnabled(false);
                urRollResult.setText("....");
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                urGuessVar = Integer.parseInt(inputGuess.getText());
                urRollVar = randomGenerator.nextInt(6) + 1;
                urRollResult.setText(String.valueOf(urRollVar));
                submitButton.setEnabled(false);
                seeResultsButton.setEnabled(true);
            }
        });
        seeResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                parentPanel.removeAll();
                parentPanel.add(resultsPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
                finalButton.setVisible(false);
//                System.out.println(vscore);
//                System.out.println(urscore);
//                System.out.println("vdiff: " + Math.abs(vroll - vguess));
//                System.out.println("urdiff: " + Math.abs(urRollVar - urGuessVar));

                vPtsLostVar = Math.abs(vroll - vguess);
                vPtsLostVal.setText(String.valueOf(vPtsLostVar));
                vscore = vscore - vPtsLostVar;

                //System.out.println(vscore);

                vCurrScoreVal.setText(String.valueOf(vscore));

                urPtsLostVar = Math.abs(urRollVar - urGuessVar);
                urPtsLostVal.setText(String.valueOf(urPtsLostVar));
                urscore = urscore - urPtsLostVar;

                //System.out.println(urscore);

                urCurrScoreVal.setText(String.valueOf(urscore));

                if (vscore <= 0 || urscore <= 0) {
                    finalButton.setVisible(true);
                    continueButton3.setVisible(false);
                }
            }
        });
        continueButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(villianTurn);
                parentPanel.repaint();
                parentPanel.revalidate();
                contToYourTurn.setEnabled(false);
                vresultsButton.setEnabled(true);
                rollResult.setText("....");
                guessResult.setText("....");
            }
        });
        finalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (urscore <= 0) {
                    parentPanel.removeAll();
                    parentPanel.add(villianWins);
                    parentPanel.repaint();
                    parentPanel.revalidate();
                }
                if (vscore <= 0) {
                    parentPanel.removeAll();
                    parentPanel.add(youWin);
                    parentPanel.repaint();
                    parentPanel.revalidate();
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new app().parentPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
