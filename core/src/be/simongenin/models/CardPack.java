package be.simongenin.models;

import java.util.ArrayList;

/**
 * Représentation d'un packet de carte quelconque.
 *
 * Created by simon on 03-11-15.
 */
public class CardPack {

    // Les cartes du packet
    protected ArrayList<Card> mCards;

    public CardPack() {
        mCards = new ArrayList<Card>();
    }

    /**
     * Renvoi le nombre de cartes dans le pack
     */
    public int size() {
        return mCards.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PACK : \n");
        for (Card c : mCards)
            sb.append(c.toString()).append("\n");
        return sb.toString();
    }

    /**
     * Retourne un string affichant les cartes contenues dans le
     * packet sous un format de 2 caractères.
     */
    public String toStringBrief() {
        StringBuilder sb = new StringBuilder("PACK : \n");
        for (Card c : mCards)
            sb.append(c.toStringBrief()).append("\n");;
        return sb.toString();
    }

}
