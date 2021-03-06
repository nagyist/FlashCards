/******************************************************************************
 * Author: Chris Robertson <electronicsleep@gmail.com>
 * Date: 12/18/2016
 * Purpose: Open Source Application for learning and memorizing
 * Released under the BSD license
 *
 * Compilation:  javac FlashCardsJava.java
 * Execution:    java FlashCardsJava
 *
 *  % java FlashCardsJava
 ******************************************************************************/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends FlashCardsJava {
    private JPanel panel1;
    private JButton button1;

    public app() {
        button1.addActionListener(new ActionListener() {

            Card card = new FlashCardsJava.Card();

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "FlashCards: " + card);
            }
        });
    }

    public static void main(String[] args) {
      JFrame frame = new JFrame("app");
        frame.setContentPane(new app().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
