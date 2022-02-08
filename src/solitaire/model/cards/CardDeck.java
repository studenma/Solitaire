/*
 *
 * Autor: Martin Studený
 * Projekt: Solitaire
 * Datum: 1.3.2017
 *
 */
package solitaire.model.cards;

public class CardDeck {
    Card[] deck = new Card[52];
    int siz;
    int max;
    public Card.Color deckColor;
// vytvori a inicializuje balicek karet
    public CardDeck(int size) {
        siz = size;
        max = size;
    }
    public CardDeck(Card.Color color) {
        deckColor = color;
    }
	// vytvori balik 52 karet
	public static CardDeck createStandardDeck() {
		CardDeck a =  new CardDeck(52);
		for(int i = 0; i < 13; i++) {
			a.deck[i] = new Card(Card.Color.CLUBS, i+1);
			a.deck[i+13] = new Card(Card.Color.DIAMONDS, i+1);
			a.deck[i+26] = new Card(Card.Color.HEARTS, i+1);
			a.deck[i+39] = new Card(Card.Color.SPADES, i+1);
		}
		return a;
	}
	// vraci aktualni pocet karet v balicku
	public int size(){
		return siz;
	}
	public boolean put(Card card) {
		Card crd;
		// pokud se get povedl - nevkladame prvni kartu
		if((crd = get()) != null) { 
			if(card.compareValue(crd) == 1)
				if(card.col.toString().equals(crd.col.toString())) {
					deck[siz] = new Card(card.color(), card.value());
					siz++;
					return true;
				}
			else
				return false;
		}
		// vkladame prvni kartu
		else {
			if(card.col.toString().equals(deckColor.toString()))
				if(card.value() == 1) {
					deck[siz] = new Card(card.color(), card.value());
					siz++;
					return true;
				}
			else
				return false;
		}
		return false;
	}
	// odebere kartu z vrcholu zasobniku
	public Card pop() {
		if(siz == 0)
			return null;
		siz--;
		return deck[siz];
	}
	public boolean isEmpty() {
		if(siz == 0) 
			return true;
		return false;
	}
	public Card get() {
		if(isEmpty()) 
			return null;
		return deck[siz-1];
	}
	public Card get(int index) {
		if(isEmpty() || index > siz)
			return null;
		return deck[index];
	}
        // Kvuli otoceni baliku
        public void simplePut(Card card) {
            deck[siz] = new Card(card.color(), card.value());
            siz++;
            if (siz > max) {
                max++;
            }
        }
}