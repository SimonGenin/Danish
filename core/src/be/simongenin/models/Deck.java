package be.simongenin.models;

import be.simongenin.exceptions.EmptyDeckException;
import be.simongenin.models.enums.CardSuit;
import be.simongenin.models.enums.CardValue;

import java.util.Collections;

/**
 * Classe repr�sentant un deck de cartes.
 * Mutable
 *
 * Created by simon on 03-11-15.
 */
public class Deck extends CardPack{

    /**
     * Cr�er un nouveau deck de 52 cartes.
     * Le deck n'est pas tri�.
     */
    public Deck() {
        super();
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

}
