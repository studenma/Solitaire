/*
 *
 * Autor: Martin Studený
 * Projekt: Solitaire
 * Datum: 1.3.2017
 *
 */
package solitaire.model.cards;

public class Card {
	Color col;
	int val;
	boolean otocena = false;
	public enum Color {
	    CLUBS("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S");
	    public final String name;
	    Color(String s) {
	    	name = s;
	    }
		public String toString() {
			return name;
		}		    
	}
	// nastavi barvu a hodnotu karty
	public Card(Color c, int value) {
		col = c;
		val = value;
	}
	public String toString() {
		String a = ""+val;
		switch(val){
			case 1: a = "A";
				break;
			case 11: a = "J";
				break;
			case 12: a = "Q";
				break;
			case 13: a = "K";
				break;
			default:
				break;
		}
		return a+"("+this.col.toString()+")";
	}	
	// vraci barvu karty
	public Color color() {
		return col;	
	}
	// vraci hodnotu karty
	public int value() {
		return val;
	}
    public boolean equals(Object o) {
        if (o == this) 
        	return true;
        if (!(o instanceof Card)) 
        	return false;
        Card c = (Card) o;
        return c.col.equals(col) && c.val == val;
    }
    public int hashCode() {
        int result = 17;
        result = 31 * result + col.hashCode();
        result = 31 * result + val;
        return result;
    }
    public boolean isTurnedFaceUp() {
    	if(otocena == true)
    		return true;
    	else
    		return false;
    }
    public boolean turnFaceUp() {
    	if(otocena == true)
    		return false; // karta jiz byla otocena
    	else {
    		otocena = true;
    		return true;
    	}
    }
    public boolean similarColorTo(Card c) {
    	if(c.col.toString().equals(("S")))
    		if(col.toString().equals(("C")))
    			return true;
    		else if(col.toString().equals(("S")))
    			return true;
    		else
    			return false;
    	else if(c.col.toString().equals(("C")))
    		if(col.toString().equals(("C")))
    			return true;
    		else if(col.toString().equals(("S")))
    			return true; 
    		else
    			return false;   		
    	else if(c.col.toString().equals(("D")))
    		if(col.toString().equals(("D")))
    			return true;
    		else if(col.toString().equals(("H")))
    			return true;   
    		else
    			return false; 		
    	else if(c.col.toString().equals(("H")))
    		if(col.toString().equals(("D")))
    			return true;
    		else if(col.toString().equals(("H")))
    			return true;
    		else
    			return false;
    	return false;
    }
    public int compareValue(Card c) {
    	return val-c.val;
    }
}