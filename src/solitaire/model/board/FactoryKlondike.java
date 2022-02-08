/*
 *
 * Autor: Martin Studený
 * Projekt: Solitaire
 *
 */

package solitaire.model.board;
import solitaire.model.cards.Card;
import solitaire.model.cards.CardDeck;
import solitaire.model.cards.CardStack;

public class FactoryKlondike  extends AbstractFactorySolitaire {
    public FactoryKlondike() {
    }
    // vytvori objekt reprezentujici balicek karet
    public CardDeck createCardDeck() {
        return CardDeck.createStandardDeck();
    }
    // vytvori objekt reprezentujici kartu
    public Card createCard(Card.Color color, int value) {
        // musi byt v rozmezi 1 - 13
        if(value >= 1 &&  value <= 13) {
            return new Card(color, value);
        }
        return null;
    }
    // vytvori objekt reprezentujici cilovy balicek, cilem hrace je vlozit vsechny karty zadane barvy do ciloveho balicku
    public CardDeck createTargetPack(Card.Color color) {
        CardDeck d = new CardDeck(color);
        return d;
    }
    // vytvari objekt reprezentuici pracovni pole pro karty
    public CardStack createWorkingPack() {
        CardStack n = new CardStack();
        return n;
    }
}