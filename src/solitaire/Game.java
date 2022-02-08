/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import solitaire.model.board.AbstractFactorySolitaire;
import solitaire.model.board.FactoryKlondike;
import solitaire.model.cards.CardDeck;
import solitaire.model.cards.CardStack;
import solitaire.model.cards.Card;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;


/**
 *
 * @author stude
 */
public class Game extends JPanel {
    public static JButton BalikKaret;
    public static JButton Odkladaci1, Odkladaci2, Odkladaci3, Odkladaci4, OtocenaKarta;
    public static JButton Sloupec1x1,Sloupec2x1,Sloupec3x1,Sloupec4x1,Sloupec5x1,Sloupec6x1,Sloupec7x1;
    public static JButton Sloupec1x2,Sloupec2x2,Sloupec3x2,Sloupec4x2,Sloupec5x2,Sloupec6x2,Sloupec7x2;
    public static JButton Sloupec1x3,Sloupec2x3,Sloupec3x3,Sloupec4x3,Sloupec5x3,Sloupec6x3,Sloupec7x3;
    public static JButton Sloupec1x4,Sloupec2x4,Sloupec3x4,Sloupec4x4,Sloupec5x4,Sloupec6x4,Sloupec7x4;
    public static JButton Sloupec1x5,Sloupec2x5,Sloupec3x5,Sloupec4x5,Sloupec5x5,Sloupec6x5,Sloupec7x5;
    public static JButton Sloupec1x6,Sloupec2x6,Sloupec3x6,Sloupec4x6,Sloupec5x6,Sloupec6x6,Sloupec7x6;
    public static JButton Sloupec1x7,Sloupec2x7,Sloupec3x7,Sloupec4x7,Sloupec5x7,Sloupec6x7,Sloupec7x7;
    public static JButton Sloupec1x8,Sloupec2x8,Sloupec3x8,Sloupec4x8,Sloupec5x8,Sloupec6x8,Sloupec7x8;
    public static JButton Sloupec1x9,Sloupec2x9,Sloupec3x9,Sloupec4x9,Sloupec5x9,Sloupec6x9,Sloupec7x9;
    public static JButton Sloupec1x10,Sloupec2x10,Sloupec3x10,Sloupec4x10,Sloupec5x10,Sloupec6x10,Sloupec7x10;
    public static JButton Sloupec1x11,Sloupec2x11,Sloupec3x11,Sloupec4x11,Sloupec5x11,Sloupec6x11,Sloupec7x11;
    public static JButton Sloupec1x12,Sloupec2x12,Sloupec3x12,Sloupec4x12,Sloupec5x12,Sloupec6x12,Sloupec7x12;
    public static JButton Sloupec1x13,Sloupec2x13,Sloupec3x13,Sloupec4x13,Sloupec5x13,Sloupec6x13,Sloupec7x13;

    public static AbstractFactorySolitaire factory;
    public static CardStack Sloupec1 = new CardStack(13);
    public static CardStack Sloupec2 = new CardStack(13);
    public static CardStack Sloupec3 = new CardStack(13);
    public static CardStack Sloupec4 = new CardStack(13);
    public static CardStack Sloupec5 = new CardStack(13);
    public static CardStack Sloupec6 = new CardStack(13);
    public static CardStack Sloupec7 = new CardStack(13);
    
    public static CardDeck deck;
    public static CardStack stack_otocena_karta;
    public static CardDeck Odkladaci_S;
    public static CardDeck Odkladaci_D;
    public static CardDeck Odkladaci_H;
    public static CardDeck Odkladaci_C;
    
    public Game() {
        setBackground(new java.awt.Color(0, 125, 0));
        setLayout(null);
        // vytvoreni ploch pro karty
        BalikKaret = new JButton(); Odkladaci1 = new JButton(); Odkladaci2 = new JButton();Odkladaci3 = new JButton();Odkladaci4 = new JButton();OtocenaKarta = new JButton();
        Sloupec1x1 = new JButton();Sloupec2x1 = new JButton();Sloupec3x1 = new JButton();Sloupec4x1 = new JButton();Sloupec5x1 = new JButton();Sloupec6x1 = new JButton();Sloupec7x1 = new JButton();
        Sloupec1x2 = new JButton();Sloupec2x2 = new JButton();Sloupec3x2 = new JButton();Sloupec4x2 = new JButton();Sloupec5x2 = new JButton();Sloupec6x2 = new JButton();Sloupec7x2 = new JButton();
        Sloupec1x3 = new JButton();Sloupec2x3 = new JButton();Sloupec3x3 = new JButton();Sloupec4x3 = new JButton();Sloupec5x3 = new JButton();Sloupec6x3 = new JButton();Sloupec7x3 = new JButton();
        Sloupec1x4 = new JButton();Sloupec2x4 = new JButton();Sloupec3x4 = new JButton();Sloupec4x4 = new JButton();Sloupec5x4 = new JButton();Sloupec6x4 = new JButton();Sloupec7x4 = new JButton();
        Sloupec1x5 = new JButton();Sloupec2x5 = new JButton();Sloupec3x5 = new JButton();Sloupec4x5 = new JButton();Sloupec5x5 = new JButton();Sloupec6x5 = new JButton();Sloupec7x5 = new JButton();
        Sloupec1x6 = new JButton();Sloupec2x6 = new JButton();Sloupec3x6 = new JButton();Sloupec4x6 = new JButton();Sloupec5x6 = new JButton();Sloupec6x6 = new JButton();Sloupec7x6 = new JButton();
        Sloupec1x7 = new JButton();Sloupec2x7 = new JButton();Sloupec3x7 = new JButton();Sloupec4x7 = new JButton();Sloupec5x7 = new JButton();Sloupec6x7 = new JButton();Sloupec7x7 = new JButton();
        Sloupec1x8 = new JButton();Sloupec2x8 = new JButton();Sloupec3x8 = new JButton();Sloupec4x8 = new JButton();Sloupec5x8 = new JButton();Sloupec6x8 = new JButton();Sloupec7x8 = new JButton();
        Sloupec1x9 = new JButton();Sloupec2x9 = new JButton();Sloupec3x9 = new JButton();Sloupec4x9 = new JButton();Sloupec5x9 = new JButton();Sloupec6x9 = new JButton();Sloupec7x9 = new JButton();
        Sloupec1x10 = new JButton();Sloupec2x10 = new JButton();Sloupec3x10 = new JButton();Sloupec4x10 = new JButton();Sloupec5x10 = new JButton();Sloupec6x10 = new JButton();Sloupec7x10 = new JButton();
        Sloupec1x11 = new JButton();Sloupec2x11 = new JButton();Sloupec3x11 = new JButton();Sloupec4x11 = new JButton();Sloupec5x11 = new JButton();Sloupec6x11 = new JButton();Sloupec7x11 = new JButton();
        Sloupec1x12 = new JButton();Sloupec2x12 = new JButton();Sloupec3x12 = new JButton();Sloupec4x12 = new JButton();Sloupec5x12 = new JButton();Sloupec6x12 = new JButton();Sloupec7x12 = new JButton();
        Sloupec1x13 = new JButton();Sloupec2x13 = new JButton();Sloupec3x13 = new JButton();Sloupec4x13 = new JButton();Sloupec5x13 = new JButton();Sloupec6x13 = new JButton();Sloupec7x13 = new JButton();
        
        Odkladaci_S = new CardDeck(Card.Color.SPADES);
        Odkladaci_H = new CardDeck(Card.Color.HEARTS);
        Odkladaci_C = new CardDeck(Card.Color.CLUBS);
        Odkladaci_D = new CardDeck(Card.Color.DIAMONDS);

        factory = new FactoryKlondike();
        deck = factory.createCardDeck(); // vytvori balik, ktery obsahuje 52 karet  
        stack_otocena_karta = new CardStack(24);
        for(int i = 0; i < 1; i++) {
            Card c = deck.pop();
            Sloupec1.simplePut(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 2; i++) {
            Card c = deck.pop();
            Sloupec2.simplePut(c);
            //System.out.println(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 3; i++) {
            Card c = deck.pop();
            Sloupec3.simplePut(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 4; i++) {
            Card c = deck.pop();
            Sloupec4.simplePut(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 5; i++) {
            Card c = deck.pop();
            Sloupec5.simplePut(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 6; i++) {
            Card c = deck.pop();
            Sloupec6.simplePut(c);
            //stack24.simplePut(c);
        }
        for(int i = 0; i < 7; i++) {
            Card c = deck.pop();
            Sloupec7.simplePut(c);
            //stack24.simplePut(c);
        }
        //System.out.println(Sloupec7.size());
        
        BalikKaret.setBounds(10, 10, 90, 131);
        OtocenaKarta.setBounds(110, 10, 90, 131);
        Odkladaci1.setBounds(310, 10, 90, 131);
        Odkladaci2.setBounds(410, 10, 90, 131);
        Odkladaci3.setBounds(510, 10, 90, 131);
        Odkladaci4.setBounds(610, 10, 90, 131);
        
        Sloupec1x1.setBounds(10, 170, 90, 131);
        Sloupec2x1.setBounds(110, 170, 90, 131);
        Sloupec3x1.setBounds(210, 170, 90, 131);
        Sloupec4x1.setBounds(310, 170, 90, 131);
        Sloupec5x1.setBounds(410, 170, 90, 131);
        Sloupec6x1.setBounds(510, 170, 90, 131);
        Sloupec7x1.setBounds(610, 170, 90, 131);
        
        Sloupec1x2.setBounds(10, 205, 90, 131);
        Sloupec2x2.setBounds(110, 205, 90, 131);
        Sloupec3x2.setBounds(210, 205, 90, 131);
        Sloupec4x2.setBounds(310, 205, 90, 131);
        Sloupec5x2.setBounds(410, 205, 90, 131);
        Sloupec6x2.setBounds(510, 205, 90, 131);
        Sloupec7x2.setBounds(610, 205, 90, 131);
        
        Sloupec1x3.setBounds(10, 240, 90, 131);
        Sloupec2x3.setBounds(110, 240, 90, 131);
        Sloupec3x3.setBounds(210, 240, 90, 131);
        Sloupec4x3.setBounds(310, 240, 90, 131);
        Sloupec5x3.setBounds(410, 240, 90, 131);
        Sloupec6x3.setBounds(510, 240, 90, 131);
        Sloupec7x3.setBounds(610, 240, 90, 131);
        
        Sloupec1x4.setBounds(10, 275, 90, 131);
        Sloupec2x4.setBounds(110, 275, 90, 131);
        Sloupec3x4.setBounds(210, 275, 90, 131);
        Sloupec4x4.setBounds(310, 275, 90, 131);
        Sloupec5x4.setBounds(410, 275, 90, 131);
        Sloupec6x4.setBounds(510, 275, 90, 131);
        Sloupec7x4.setBounds(610, 275, 90, 131);
        
        Sloupec1x5.setBounds(10, 310, 90, 131);
        Sloupec2x5.setBounds(110, 310, 90, 131);
        Sloupec3x5.setBounds(210, 310, 90, 131);
        Sloupec4x5.setBounds(310, 310, 90, 131);
        Sloupec5x5.setBounds(410, 310, 90, 131);
        Sloupec6x5.setBounds(510, 310, 90, 131);
        Sloupec7x5.setBounds(610, 310, 90, 131);
        
        Sloupec1x6.setBounds(10, 345, 90, 131);
        Sloupec2x6.setBounds(110, 345, 90, 131);
        Sloupec3x6.setBounds(210, 345, 90, 131);
        Sloupec4x6.setBounds(310, 345, 90, 131);
        Sloupec5x6.setBounds(410, 345, 90, 131);
        Sloupec6x6.setBounds(510, 345, 90, 131);
        Sloupec7x6.setBounds(610, 345, 90, 131);
        
        Sloupec1x7.setBounds(10, 380, 90, 131);
        Sloupec2x7.setBounds(110, 380, 90, 131);
        Sloupec3x7.setBounds(210, 380, 90, 131);
        Sloupec4x7.setBounds(310, 380, 90, 131);
        Sloupec5x7.setBounds(410, 380, 90, 131);
        Sloupec6x7.setBounds(510, 380, 90, 131);
        Sloupec7x7.setBounds(610, 380, 90, 131);
        
        Sloupec1x8.setBounds(10, 415, 90, 131);
        Sloupec2x8.setBounds(110, 415, 90, 131);
        Sloupec3x8.setBounds(210, 415, 90, 131);
        Sloupec4x8.setBounds(310, 415, 90, 131);
        Sloupec5x8.setBounds(410, 415, 90, 131);
        Sloupec6x8.setBounds(510, 415, 90, 131);
        Sloupec7x8.setBounds(610, 415, 90, 131);
        
        Sloupec1x9.setBounds(10, 450, 90, 131);
        Sloupec2x9.setBounds(110, 450, 90, 131);
        Sloupec3x9.setBounds(210, 450, 90, 131);
        Sloupec4x9.setBounds(310, 450, 90, 131);
        Sloupec5x9.setBounds(410, 450, 90, 131);
        Sloupec6x9.setBounds(510, 450, 90, 131);
        Sloupec7x9.setBounds(610, 450, 90, 131);
        
        Sloupec1x10.setBounds(10, 485, 90, 131);
        Sloupec2x10.setBounds(110, 485, 90, 131);
        Sloupec3x10.setBounds(210, 485, 90, 131);
        Sloupec4x10.setBounds(310, 485, 90, 131);
        Sloupec5x10.setBounds(410, 485, 90, 131);
        Sloupec6x10.setBounds(510, 485, 90, 131);
        Sloupec7x10.setBounds(610, 485, 90, 131);
        
        Sloupec1x11.setBounds(10, 520, 90, 131);
        Sloupec2x11.setBounds(110, 520, 90, 131);
        Sloupec3x11.setBounds(210, 520, 90, 131);
        Sloupec4x11.setBounds(310, 520, 90, 131);
        Sloupec5x11.setBounds(410, 520, 90, 131);
        Sloupec6x11.setBounds(510, 520, 90, 131);
        Sloupec7x11.setBounds(610, 520, 90, 131);
        
        Sloupec1x12.setBounds(10, 555, 90, 131);
        Sloupec2x12.setBounds(110, 555, 90, 131);
        Sloupec3x12.setBounds(210, 555, 90, 131);
        Sloupec4x12.setBounds(310, 555, 90, 131);
        Sloupec5x12.setBounds(410, 555, 90, 131);
        Sloupec6x12.setBounds(510, 555, 90, 131);
        Sloupec7x12.setBounds(610, 555, 90, 131);
        
        Sloupec1x13.setBounds(10, 590, 90, 131);
        Sloupec2x13.setBounds(110, 590, 90, 131);
        Sloupec3x13.setBounds(210, 590, 90, 131);
        Sloupec4x13.setBounds(310, 590, 90, 131);
        Sloupec5x13.setBounds(410, 590, 90, 131);
        Sloupec6x13.setBounds(510, 590, 90, 131);
        Sloupec7x13.setBounds(610, 590, 90, 131);
        
        Sloupec1x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x1.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x1.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x2.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x2.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x3.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x4.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x4.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x5.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x5.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x6.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x6.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x7.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x7.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x7.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x8.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x8.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x9.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x9.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x10.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x10.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x11.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x11.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x12.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x12.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Sloupec1x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec2x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec3x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec4x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec5x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec6x13.setBorder(BorderFactory.createLineBorder(Color.black));
        Sloupec7x13.setBorder(BorderFactory.createLineBorder(Color.black));
       
        /*IconSwitch IconSwitch = new IconSwitch();
        IconSwitch.BalikKaret();
        IconSwitch.OtocenaKarta();
        IconSwitch.Sloupec1x1();
        IconSwitch.Sloupec2x2();
        IconSwitch.Sloupec3x3();
        IconSwitch.Sloupec4x4();
        IconSwitch.Sloupec5x5();
        IconSwitch.Sloupec6x6();
        IconSwitch.Sloupec7x7();*/
        System.out.println("Sloupec1x1: "+Sloupec1.get(0).toString());
        System.out.println("Sloupec2x2: "+Sloupec2.get(1).toString());
        System.out.println("Sloupec3x3: "+Sloupec3.get(2).toString());
        System.out.println("Sloupec4x4: "+Sloupec4.get(3).toString());
        System.out.println("Sloupec5x5: "+Sloupec5.get(4).toString());
        System.out.println("Sloupec6x6: "+Sloupec6.get(5).toString());
        System.out.println("Sloupec7x7: "+Sloupec7.get(6).toString());
       
        Sloupec1.pocet_viditenych_karet = 1;
        Sloupec2.pocet_viditenych_karet = 2;
        Sloupec3.pocet_viditenych_karet = 3;
        Sloupec4.pocet_viditenych_karet = 4;
        Sloupec5.pocet_viditenych_karet = 5;
        Sloupec6.pocet_viditenych_karet = 6;
        Sloupec7.pocet_viditenych_karet = 7;
        
        Sloupec1.pop();
        Sloupec1.simplePut(new Card(Card.Color.HEARTS, 7));
        
        Sloupec2.pop();
        Sloupec2.pop();
        Sloupec2.simplePut(new Card(Card.Color.HEARTS, 10));
        Sloupec2.simplePut(new Card(Card.Color.SPADES, 11));
        
        Sloupec1.get(0).turnFaceUp();
        Sloupec2.get(1).turnFaceUp();
        Sloupec3.get(2).turnFaceUp();
        Sloupec4.get(3).turnFaceUp();
        Sloupec5.get(4).turnFaceUp();
        Sloupec6.get(5).turnFaceUp();
        Sloupec7.get(6).turnFaceUp();
        
        Actualize Actual = new Actualize();
        Actual.BalikKaret();
        Actual.OtocenaKarta();
        Actual.Odkladaci_H();
        Actual.Odkladaci_D();
        Actual.Odkladaci_C();
        Actual.Odkladaci_S();
        Actual.Sloupec1x1();
        Actual.Sloupec1x2();
        Actual.Sloupec1x3();
        Actual.Sloupec1x4();
        Actual.Sloupec1x5();
        Actual.Sloupec1x6();
        Actual.Sloupec1x7();
        Actual.Sloupec1x8();
        Actual.Sloupec1x9();
        Actual.Sloupec1x10();
        Actual.Sloupec1x11();
        Actual.Sloupec1x12();
        Actual.Sloupec1x13();
        
        Actual.Sloupec2x1();
        Actual.Sloupec2x2();
        Actual.Sloupec2x3();
        Actual.Sloupec2x4();
        Actual.Sloupec2x5();
        Actual.Sloupec2x6();
        Actual.Sloupec2x7();
        Actual.Sloupec2x8();
        Actual.Sloupec2x9();
        Actual.Sloupec2x10();
        Actual.Sloupec2x11();
        Actual.Sloupec2x12();
        Actual.Sloupec2x13();
        
        Actual.Sloupec3x1();
        Actual.Sloupec3x2();
        Actual.Sloupec3x3();
        Actual.Sloupec3x4();
        Actual.Sloupec3x5();
        Actual.Sloupec3x6();
        Actual.Sloupec3x7();
        Actual.Sloupec3x8();
        Actual.Sloupec3x9();
        Actual.Sloupec3x10();
        Actual.Sloupec3x11();
        Actual.Sloupec3x12();
        Actual.Sloupec3x13();
        
        Actual.Sloupec4x1();
        Actual.Sloupec4x2();
        Actual.Sloupec4x3();
        Actual.Sloupec4x4();
        Actual.Sloupec4x5();
        Actual.Sloupec4x6();
        Actual.Sloupec4x7();
        Actual.Sloupec4x8();
        Actual.Sloupec4x9();
        Actual.Sloupec4x10();
        Actual.Sloupec4x11();
        Actual.Sloupec4x12();
        Actual.Sloupec4x13();
        
        Actual.Sloupec5x1();
        Actual.Sloupec5x2();
        Actual.Sloupec5x3();
        Actual.Sloupec5x4();
        Actual.Sloupec5x5();
        Actual.Sloupec5x6();
        Actual.Sloupec5x7();
        Actual.Sloupec5x8();
        Actual.Sloupec5x9();
        Actual.Sloupec5x10();
        Actual.Sloupec5x11();
        Actual.Sloupec5x12();
        Actual.Sloupec5x13();
        
        Actual.Sloupec6x1();
        Actual.Sloupec6x2();
        Actual.Sloupec6x3();
        Actual.Sloupec6x4();
        Actual.Sloupec6x5();
        Actual.Sloupec6x6();
        Actual.Sloupec6x7();
        Actual.Sloupec6x8();
        Actual.Sloupec6x9();
        Actual.Sloupec6x10();
        Actual.Sloupec6x11();
        Actual.Sloupec6x12();
        Actual.Sloupec6x13();
        
        Actual.Sloupec7x1();
        Actual.Sloupec7x2();
        Actual.Sloupec7x3();
        Actual.Sloupec7x4();
        Actual.Sloupec7x5();
        Actual.Sloupec7x6();
        Actual.Sloupec7x7();
        Actual.Sloupec7x8();
        Actual.Sloupec7x9();
        Actual.Sloupec7x10();
        Actual.Sloupec7x11();
        Actual.Sloupec7x12();
        Actual.Sloupec7x13();
        
        System.out.println(Sloupec2.get(1).isTurnedFaceUp());
          
        Sloupec1x1.setVisible(true);
        Sloupec1x2.setVisible(false);
        Sloupec1x3.setVisible(false);
        Sloupec1x4.setVisible(false);
        Sloupec1x5.setVisible(false);
        Sloupec1x6.setVisible(false);
        Sloupec1x7.setVisible(false);
        Sloupec1x8.setVisible(false);
        Sloupec1x9.setVisible(false);
        Sloupec1x10.setVisible(false);
        Sloupec1x11.setVisible(false);
        Sloupec1x12.setVisible(false);
        Sloupec1x13.setVisible(false);
        
        Sloupec2x1.setVisible(true);
        Sloupec2x2.setVisible(true);
        Sloupec2x3.setVisible(false);
        Sloupec2x4.setVisible(false);
        Sloupec2x5.setVisible(false);
        Sloupec2x6.setVisible(false);
        Sloupec2x7.setVisible(false);
        Sloupec2x8.setVisible(false);
        Sloupec2x9.setVisible(false);
        Sloupec2x10.setVisible(false);
        Sloupec2x11.setVisible(false);
        Sloupec2x12.setVisible(false);
        Sloupec2x13.setVisible(false);
        
        Sloupec3x1.setVisible(true);
        Sloupec3x2.setVisible(true);
        Sloupec3x3.setVisible(true);
        Sloupec3x4.setVisible(false);
        Sloupec3x5.setVisible(false);
        Sloupec3x6.setVisible(false);
        Sloupec3x7.setVisible(false);
        Sloupec3x8.setVisible(false);
        Sloupec3x9.setVisible(false);
        Sloupec3x10.setVisible(false);
        Sloupec3x11.setVisible(false);
        Sloupec3x12.setVisible(false);
        Sloupec3x13.setVisible(false);
        
        Sloupec4x1.setVisible(true);
        Sloupec4x2.setVisible(true);
        Sloupec4x3.setVisible(true);
        Sloupec4x4.setVisible(true);
        Sloupec4x5.setVisible(false);
        Sloupec4x6.setVisible(false);
        Sloupec4x7.setVisible(false);
        Sloupec4x8.setVisible(false);
        Sloupec4x9.setVisible(false);
        Sloupec4x10.setVisible(false);
        Sloupec4x11.setVisible(false);
        Sloupec4x12.setVisible(false);
        Sloupec4x13.setVisible(false);
        
        Sloupec5x1.setVisible(true);
        Sloupec5x2.setVisible(true);
        Sloupec5x3.setVisible(true);
        Sloupec5x4.setVisible(true);
        Sloupec5x5.setVisible(true);
        Sloupec5x6.setVisible(false);
        Sloupec5x7.setVisible(false);
        Sloupec5x8.setVisible(false);
        Sloupec5x9.setVisible(false);
        Sloupec5x10.setVisible(false);
        Sloupec5x11.setVisible(false);
        Sloupec5x12.setVisible(false);
        Sloupec5x13.setVisible(false);
        
        Sloupec6x1.setVisible(true);
        Sloupec6x2.setVisible(true);
        Sloupec6x3.setVisible(true);
        Sloupec6x4.setVisible(true);
        Sloupec6x5.setVisible(true);
        Sloupec6x6.setVisible(true);
        Sloupec6x7.setVisible(false);
        Sloupec6x8.setVisible(false);
        Sloupec6x9.setVisible(false);
        Sloupec6x10.setVisible(false);
        Sloupec6x11.setVisible(false);
        Sloupec6x12.setVisible(false);
        Sloupec6x13.setVisible(false);
        
        Sloupec7x1.setVisible(true);
        Sloupec7x2.setVisible(true);
        Sloupec7x3.setVisible(true);
        Sloupec7x4.setVisible(true);
        Sloupec7x5.setVisible(true);
        Sloupec7x6.setVisible(true);
        Sloupec7x7.setVisible(true);
        Sloupec7x8.setVisible(false);
        Sloupec7x9.setVisible(false);
        Sloupec7x10.setVisible(false);
        Sloupec7x11.setVisible(false);
        Sloupec7x12.setVisible(false);
        Sloupec7x13.setVisible(false);
        
        // vlozeni ploch
        add(BalikKaret);
        add(OtocenaKarta);
        add(Odkladaci1);
        add(Odkladaci2);
        add(Odkladaci3);
        add(Odkladaci4);
 
        add(Sloupec1x13);
        add(Sloupec2x13);
        add(Sloupec3x13);
        add(Sloupec4x13);
        add(Sloupec5x13);
        add(Sloupec6x13);
        add(Sloupec7x13);
        
        add(Sloupec1x12);
        add(Sloupec2x12);
        add(Sloupec3x12);
        add(Sloupec4x12);
        add(Sloupec5x12);
        add(Sloupec6x12);
        add(Sloupec7x12);
        
        add(Sloupec1x11);
        add(Sloupec2x11);
        add(Sloupec3x11);
        add(Sloupec4x11);
        add(Sloupec5x11);
        add(Sloupec6x11);
        add(Sloupec7x11);
        
        add(Sloupec1x10);
        add(Sloupec2x10);
        add(Sloupec3x10);
        add(Sloupec4x10);
        add(Sloupec5x10);
        add(Sloupec6x10);
        add(Sloupec7x10);
        
        add(Sloupec1x9);
        add(Sloupec2x9);
        add(Sloupec3x9);
        add(Sloupec4x9);
        add(Sloupec5x9);
        add(Sloupec6x9);
        add(Sloupec7x9);
        
        add(Sloupec1x8);
        add(Sloupec2x8);
        add(Sloupec3x8);
        add(Sloupec4x8);
        add(Sloupec5x8);
        add(Sloupec6x8);
        add(Sloupec7x8);
        
        add(Sloupec1x7);
        add(Sloupec2x7);
        add(Sloupec3x7);
        add(Sloupec4x7);
        add(Sloupec5x7);
        add(Sloupec6x7);
        add(Sloupec7x7); 
        
        add(Sloupec1x6);
        add(Sloupec2x6);
        add(Sloupec3x6);
        add(Sloupec4x6);
        add(Sloupec5x6);
        add(Sloupec6x6);
        add(Sloupec7x6);

        add(Sloupec1x5);
        add(Sloupec2x5);
        add(Sloupec3x5);
        add(Sloupec4x5);
        add(Sloupec5x5);
        add(Sloupec6x5);
        add(Sloupec7x5);
        
        add(Sloupec1x4);
        add(Sloupec2x4);
        add(Sloupec3x4);
        add(Sloupec4x4);
        add(Sloupec5x4);
        add(Sloupec6x4);
        add(Sloupec7x4);
        
        add(Sloupec1x3);
        add(Sloupec2x3);
        add(Sloupec3x3);
        add(Sloupec4x3);
        add(Sloupec5x3);
        add(Sloupec6x3);
        add(Sloupec7x3);
        
        add(Sloupec1x2);
        add(Sloupec2x2);
        add(Sloupec3x2);
        add(Sloupec4x2);
        add(Sloupec5x2);
        add(Sloupec6x2);
        add(Sloupec7x2);

        add(Sloupec1x1);
        add(Sloupec2x1);
        add(Sloupec3x1);
        add(Sloupec4x1);
        add(Sloupec5x1);
        add(Sloupec6x1);
        add(Sloupec7x1);
        this.wait_for_action();
    }
    public static void wait_for_action() {
        BalikKaret.addActionListener(new Balik_button_action());
        OtocenaKarta.addActionListener(new Balik_button_action());
        Odkladaci1.addActionListener(new Balik_button_action());
        Odkladaci2.addActionListener(new Balik_button_action());
        Odkladaci3.addActionListener(new Balik_button_action());
        Odkladaci4.addActionListener(new Balik_button_action()); 
        
        Sloupec1x1.addActionListener(new Balik_button_action());
        Sloupec1x2.addActionListener(new Balik_button_action());
        Sloupec1x3.addActionListener(new Balik_button_action());
        Sloupec1x4.addActionListener(new Balik_button_action());
        Sloupec1x5.addActionListener(new Balik_button_action());
        Sloupec1x6.addActionListener(new Balik_button_action());
        Sloupec1x7.addActionListener(new Balik_button_action());
        Sloupec1x8.addActionListener(new Balik_button_action());
        Sloupec1x9.addActionListener(new Balik_button_action());
        Sloupec1x10.addActionListener(new Balik_button_action());
        Sloupec1x11.addActionListener(new Balik_button_action());
        Sloupec1x12.addActionListener(new Balik_button_action());
        Sloupec1x13.addActionListener(new Balik_button_action());
        
        Sloupec2x1.addActionListener(new Balik_button_action());
        Sloupec2x2.addActionListener(new Balik_button_action());
        Sloupec2x3.addActionListener(new Balik_button_action());
        Sloupec2x4.addActionListener(new Balik_button_action());
        Sloupec2x5.addActionListener(new Balik_button_action());
        Sloupec2x6.addActionListener(new Balik_button_action());
        Sloupec2x7.addActionListener(new Balik_button_action());
        Sloupec2x8.addActionListener(new Balik_button_action());
        Sloupec2x9.addActionListener(new Balik_button_action());
        Sloupec2x10.addActionListener(new Balik_button_action());
        Sloupec2x11.addActionListener(new Balik_button_action());
        Sloupec2x12.addActionListener(new Balik_button_action());
        Sloupec2x13.addActionListener(new Balik_button_action());
        
        Sloupec3x1.addActionListener(new Balik_button_action());
        Sloupec3x2.addActionListener(new Balik_button_action());
        Sloupec3x3.addActionListener(new Balik_button_action());
        Sloupec3x4.addActionListener(new Balik_button_action());
        Sloupec3x5.addActionListener(new Balik_button_action());
        Sloupec3x6.addActionListener(new Balik_button_action());
        Sloupec3x7.addActionListener(new Balik_button_action());
        Sloupec3x8.addActionListener(new Balik_button_action());
        Sloupec3x9.addActionListener(new Balik_button_action());
        Sloupec3x10.addActionListener(new Balik_button_action());
        Sloupec3x11.addActionListener(new Balik_button_action());
        Sloupec3x12.addActionListener(new Balik_button_action());
        Sloupec3x13.addActionListener(new Balik_button_action());

        Sloupec4x1.addActionListener(new Balik_button_action());
        Sloupec4x2.addActionListener(new Balik_button_action());
        Sloupec4x3.addActionListener(new Balik_button_action());
        Sloupec4x4.addActionListener(new Balik_button_action());
        Sloupec4x5.addActionListener(new Balik_button_action());
        Sloupec4x6.addActionListener(new Balik_button_action());
        Sloupec4x7.addActionListener(new Balik_button_action());
        Sloupec4x8.addActionListener(new Balik_button_action());
        Sloupec4x9.addActionListener(new Balik_button_action());
        Sloupec4x10.addActionListener(new Balik_button_action());
        Sloupec4x11.addActionListener(new Balik_button_action());
        Sloupec4x12.addActionListener(new Balik_button_action());
        Sloupec4x13.addActionListener(new Balik_button_action());
        
        Sloupec5x1.addActionListener(new Balik_button_action());
        Sloupec5x2.addActionListener(new Balik_button_action());
        Sloupec5x3.addActionListener(new Balik_button_action());
        Sloupec5x4.addActionListener(new Balik_button_action());
        Sloupec5x5.addActionListener(new Balik_button_action());
        Sloupec5x6.addActionListener(new Balik_button_action());
        Sloupec5x7.addActionListener(new Balik_button_action());
        Sloupec5x8.addActionListener(new Balik_button_action());
        Sloupec5x9.addActionListener(new Balik_button_action());
        Sloupec5x10.addActionListener(new Balik_button_action());
        Sloupec5x11.addActionListener(new Balik_button_action());
        Sloupec5x12.addActionListener(new Balik_button_action());
        Sloupec5x13.addActionListener(new Balik_button_action());

        Sloupec6x1.addActionListener(new Balik_button_action());
        Sloupec6x2.addActionListener(new Balik_button_action());
        Sloupec6x3.addActionListener(new Balik_button_action());
        Sloupec6x4.addActionListener(new Balik_button_action());
        Sloupec6x5.addActionListener(new Balik_button_action());
        Sloupec6x6.addActionListener(new Balik_button_action());
        Sloupec6x7.addActionListener(new Balik_button_action());
        Sloupec6x8.addActionListener(new Balik_button_action());
        Sloupec6x9.addActionListener(new Balik_button_action());
        Sloupec6x10.addActionListener(new Balik_button_action());
        Sloupec6x11.addActionListener(new Balik_button_action());
        Sloupec6x12.addActionListener(new Balik_button_action());
        Sloupec6x13.addActionListener(new Balik_button_action());

        Sloupec7x1.addActionListener(new Balik_button_action());
        Sloupec7x2.addActionListener(new Balik_button_action());
        Sloupec7x3.addActionListener(new Balik_button_action());
        Sloupec7x4.addActionListener(new Balik_button_action());
        Sloupec7x5.addActionListener(new Balik_button_action());
        Sloupec7x6.addActionListener(new Balik_button_action());
        Sloupec7x7.addActionListener(new Balik_button_action());
        Sloupec7x8.addActionListener(new Balik_button_action());
        Sloupec7x9.addActionListener(new Balik_button_action());
        Sloupec7x10.addActionListener(new Balik_button_action());
        Sloupec7x11.addActionListener(new Balik_button_action());
        Sloupec7x12.addActionListener(new Balik_button_action());
        Sloupec7x13.addActionListener(new Balik_button_action());        
    }
}
