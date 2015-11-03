package be.simongenin.models;

import be.simongenin.models.enums.CardSuit;
import be.simongenin.models.enums.CardValue;

/**
 * Immutable
 * Created by simon on 02-11-15.
 */
public class Card {

    // la couleur de la carte
    private CardSuit mSuit;
    // La valeur de la carte
    private CardValue mValue;

    public Card(CardSuit suit, CardValue value) {
        mSuit = suit;
        mValue = value;
    }

    @Override
    public String toString() {
        return mValue + " of " + mSuit;
    }

    public String toStringBrief() {
        return mValue.asString() + mSuit.asString();
    }

}
