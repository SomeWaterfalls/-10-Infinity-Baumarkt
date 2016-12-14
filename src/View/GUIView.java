package View;

import Control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 204g12 on 09.12.2016.
 */
public class GUIView {
    private JList shoppingcard;
    private JList etagenListe;
    private JButton downButton;
    private JButton rightButton;
    private JButton elevatorUpButton;
    private JButton upButton;
    private JButton valueButton;
    private JButton leftButton;
    private JTextArea areaD;
    private JTextArea areaC;
    private JTextArea areaB;
    private JTextArea areaA;
    private JTextArea etagenzahlAnzeige;
    private JButton elevatorDownButton;

    int etagenzahl = 0;

    private MainController mainController;

    public GUIView(final MainController mainController) {

        this.mainController = mainController;

        createButtons();
    }

    private void createButtons(){
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                upButton.setEnabled(mainController.upIsPossible());
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                downButton.setEnabled(mainController.downIsPossible());
            }
        });

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                leftButton.setEnabled(mainController.leftIsPossible());
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rightButton.setEnabled(mainController.rightIsPossible());
            }
        });

        valueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(shoppingcard);
            }
        });

        elevatorDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                elevatorUpButton.setEnabled(mainController.downEIsPossible());
            }

        });

        elevatorUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //customer fährt hoch
                mainController.moveUp();

                //ist weiterhin hoch möglich? Falls nicht -> Knopf aus
                elevatorUpButton.setEnabled(mainController.upEIsPossible());
            }
        });
    }
}