package be.simongenin.models;

import be.simongenin.exceptions.EmptyDeckException;
import be.simongenin.models.enums.CardSuit;
import be.simongenin.models.enums.CardValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe représentant un deck de cartes.
 * Mutable
 *
 * Created by simon on 03-11-15.
 */
public class Deck {

    private List<Card> cards;

    /**
     * Créer un nouveau deck de 52 cartes.
     * Le deck n'est pas trié.
     */
    public Deck() {
        cards = new ArrayList<Card>();
        fillDeck();
    }

    /**
     * Mélange le deck
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Rempli le deck avec les 52 cartes.
     * N'est pas mélangé
     */
    private void fillDeck() {
        for (CardSuit cs : CardSuit.values())
            for (CardValue cv : CardValue.values())
                cards.add(new Card(cs, cv));
    }

    /**
     * Tire une carte du deck.
     * Si plus de carte dans le deck, lance une
     * EmptyDeckException.
     */
    public Card draw() throws EmptyDeckException {
        if (size() == 0) throw new EmptyDeckException("Deck.draw()");
        return cards.remove(cards.size() - 1);
    }

    /**
     * Renvoi le nombre de cartes dans le deck
     */
    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck : \n");
        for (Card c : cards)
            sb.append(c.toString()).append("\n");
        return sb.toString();
    }

    /**
     * Retourne un string affichant les cartes contenues dans le
     * deck sous un format de 2 caractères.
     */
    public String toStringBrief() {
        StringBuilder sb = new StringBuilder("Deck : \n");
        for (Card c : cards)
            sb.append(c.toStringBrief()).append("\n");;
        return sb.toString();
    }
}
