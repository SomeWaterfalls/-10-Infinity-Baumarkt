package View;

import Control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 204g12 on 09.12.2016.
 */
public class GUIView {
    private JList shoppingCart;
    private JList sektorProducts;
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
    private JTextArea levelCount;
    private JButton elevatorDownButton;


    private MainController mainController;

    public GUIView(final MainController mainController) {

        this.mainController = mainController;

        createButtons();
    }

    private void createButtons() {

        /**
         * Section movement!
         */
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
                if(mainController.moveRight()){

                }
                rightButton.setEnabled(mainController.rightIsPossible());
            }
        });

         /**
         * Elevator movement!
         */
        elevatorDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elevatorUpButton.setEnabled(mainController.downEIsPossible());
                mainController.moveDownE();
            }

        });

        elevatorUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elevatorUpButton.setEnabled(mainController.upEIsPossible());
                mainController.moveUpE();
            }
        });

        /**
         * Value!
         */
        valueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(mainController.value());
            }
        });
    }

    /**
     * LevelCount!
     */
    public void levelHandler() {
        levelCount.setText("" + mainController.showLevel());
    }

    public void shoppingCart(){

    }
}
