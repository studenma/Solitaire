/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;
import solitaire.HomeWork2Test;
import graphics.Balik_button_action;
import javax.swing.JFrame;
import solitaire.model.board.AbstractFactorySolitaire;
import solitaire.model.board.FactoryKlondike;
import solitaire.model.cards.Card;
import solitaire.model.cards.CardDeck;
import solitaire.model.cards.CardStack;
import graphics.Game;

/**
 *
 * @author stude
 */
public class Solitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vytvoreni okna hry
        JFrame frame = new JFrame("MY SOLITAIRE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().add(new Game());
        frame.setSize(730, 900);
        //frame.pack();
        
        frame.setVisible(true);

       /* StartGame start = new StartGame();
        start.setUp();*/
        // TEST 
        /*HomeWork2Test test = new HomeWork2Test();
        test.setUp();
        test.testCard();
        test.testCardDeck();
        test.testTargetPack();
        test.testWorkingPack();
        test.testWorkingPack2();*/
        
        System.out.println("OK");
    }
}
