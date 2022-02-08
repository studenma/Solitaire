/*
 *
 * Autor: Martin Studený
 * Projekt: Solitaire
 * Datum: 1.3.2017
 *
 */
package solitaire.model.cards;

public class CardStack {
	Card[] stack1 = new Card[52];
	int count = 0;
	int max;
        public int pocet_viditenych_karet = 0;
	// vytvori a inicializuje zasobnik karet
    public CardStack(int size) {
        max = size;
    }
    public CardStack() {
    }
    public boolean put(CardStack stack) {
        CardStack tmp = new CardStack(stack.count);
        // pokud tento stack je prazdny a karta, kterou chceme vlozit je kral
        if((get() == null) && (stack.get(0).value() == 13)) {
            while(stack.count != 0) {
                Card popCard = stack.pop();
                tmp.simplePut(popCard);
            }
            while(tmp.count != 0) {
                Card popCard = tmp.pop();
                simplePut(popCard);
            }
            return true;
        } 
        else if(get() != null)
            if(stack.get(0).compareValue(get()) == -1)
                if(stack.get(0).similarColorTo(get()) == false) {
                    while(stack.count != 0) {
                        Card popCard = stack.pop();
                        tmp.simplePut(popCard);
                    }
                    while(tmp.count != 0) {
                        Card popCard = tmp.pop();
                        simplePut(popCard);
                    }
                    return true;
                }
        return false;
    }
	// vraci true, pokud je zasobnik prazny
	public boolean isEmpty() {
		if(count<=0)
			return true;
		else
			return false;
	}
	// vraci aktualni pocet karet v zasobniku
	public int size() {
		return count;
	}
	// odebere ze zasobniku sekvenci karet
	public CardStack takeFrom(Card card) {
		boolean find = false;
		CardStack nStack = null;
		for(int i = 0; i < max; i++) {
			if(stack1[i].equals(card)) {
				find = true;
				nStack = new CardStack(max-i);	
				for(int j = i; j < max; j++) {
					nStack.put(stack1[j]);
					count--;
				}			
			}		
		}
		return nStack;
	}

	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(!(obj instanceof CardStack))
			return false;
		CardStack oStack = (CardStack) obj;
		if(oStack.size() != count)
			return false;
		for(int i = 0; i < oStack.size(); i++) {
			if(stack1[i].equals(oStack.stack1[i]) == false)
				return false;
		}
		return true;
	}
        // Vezme jednu kartu ze stacku, pokud to je mozne
	public Card get() {
		if(isEmpty())
			return null;
		return stack1[count-1];
	}
        //  Vezme vice karet za Stacku, pokud to je mozne
	public Card get(int index) {
		if(isEmpty() || index > max)
			return null;
		return stack1[index];
	}
	public CardStack pop(Card card) {
		int cnt = 0;
		CardStack rtrn = new CardStack(0);
		CardStack tmp = new CardStack(0);
		Card popCard = pop();

		tmp.simplePut(popCard);
		cnt++;
		while((popCard.equals(card)) == false) {
			popCard = pop();
			if(popCard == null) {
				count += count;
				return null;
			}
			tmp.simplePut(popCard);
			cnt++;
		}
		for(int i = 0; i < cnt; i++) {
			popCard = tmp.pop();
			rtrn.simplePut(popCard);
		}
		rtrn.max = cnt;
		rtrn.count = cnt;
		return rtrn;
	}
    public void simplePut(Card card) {
        stack1[count] = new Card(card.color(), card.value());
        count++;
        if (count > max) {
            max++;
        }
    }

	public boolean put(Card card) {
        Card getCard = get();
        if(getCard == null) {
            if(card.value() == 13) {
                stack1[count] = new Card(card.color(), card.value());
                count++;
                if(count > max) {
                    max++;
                }
                return true;
            } 
            else
                return false;
        } 
        else {
            if((card.compareValue(getCard) == -1))
            	if(card.similarColorTo(getCard) == false) {
	                stack1[count] = new Card(card.color(), card.value());
	                count++;
	                if (count > max) {
	                    max++;
	                }
	                return true;
           	 } 
            else {
                return false;
            }
        }
        return false;
	}	
    public Card pop() {
        if (count == 0) {
            return null;
        } else {
            Card popCard = new Card(stack1[count - 1].color(), stack1[count - 1].value());
            count--;
            return popCard;
        }
    }
}