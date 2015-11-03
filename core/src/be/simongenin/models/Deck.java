package be.simongenin.models;

import be.simongenin.exceptions.EmptyDeckException;
import be.simongenin.models.enums.CardSuit;
import be.simongenin.models.enums.CardValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe repr�sentant un deck de cartes.
 * Mutable
 *
 * Created by simon on 03-11-15.
 */
public class Deck {

    // les cartes contenues dans le deck
    private List<Card> mCards;

    /**
     * Cr�er un nouveau deck de 52 cartes.
     * Le deck n'est pas tri�.
     */
    public Deck() {
        mCards = new ArrayList<Card>();
        fillDeck();
    }

    /**
     * M�lange le deck
     */
    public void shuffle() {
        Collections.shuffle(mCards);
    }

    /**
     * Rempli le deck avec les 52 cartes.
     * N'est pas m�lang�
     */
    private void fillDeck() {
        for (CardSuit cs : CardSuit.values())
            for (CardValue cv : CardValue.values())
                mCards.add(new Card(cs, cv));
    }

    /**
     * Tire une carte du deck.
     * Si plus de carte dans le deck, lance une
     * EmptyDeckException.
     */
    public Card draw() throws EmptyDeckException {
        if (size() == 0) throw new EmptyDeckException("Deck.draw()");
        return mCards.remove(mCards.size() - 1);
    }

    /**
     * Renvoi le nombre de cartes dans le deck
     */
    public int size() {
        return mCards.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck : \n");
        for (Card c : mCards)
            sb.append(c.toString()).append("\n");
        return sb.toString();
    }

    /**
     * Retourne un string affichant les cartes contenues dans le
     * deck sous un format de 2 caract�res.
     */
    public String toStringBrief() {
        StringBuilder sb = new StringBuilder("Deck : \n");
        for (Card c : mCards)
            sb.append(c.toStringBrief()).append("\n");;
        return sb.toString();
    }
}
