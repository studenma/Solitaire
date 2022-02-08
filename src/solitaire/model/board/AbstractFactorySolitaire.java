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

public abstract class AbstractFactorySolitaire {
	// vytvori objekt reprezentujici balicek karet
	public abstract CardDeck createCardDeck();
	// vytvori objekt reprezentujici kartu
	public abstract Card createCard(Card.Color color, int value);
	// vytvori objekt reprezentujici cilovy balicek, cilem hrace je vlozit vsechny karty zadane barvy do ciloveho balicku
	public abstract CardDeck createTargetPack(Card.Color color);
	// vytvari objekt reprezentuici pracovni pole pro karty
	public abstract CardStack createWorkingPack();
}