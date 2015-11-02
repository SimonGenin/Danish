package be.simongenin.models.enums;

/**
 * Les 13 valeurs de cartes possible.
 * L'entier "value" représente la valeur de la carte.
 * La valeur n'a rien a voir avec son utilité.
 *
 * Created by simon on 02-11-15.
 */
public enum CardValue {

    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), AS(14);

    private int mValue;

    CardValue(int mValue) {
        this.mValue = mValue;
    }

    public int value() {
        return mValue;
    }
}
