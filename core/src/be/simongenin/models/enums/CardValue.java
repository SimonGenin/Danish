package be.simongenin.models.enums;

/**
 * Les 13 valeurs de cartes possible.
 * L'entier "value" représente la valeur de la carte.
 * La valeur n'a rien a voir avec son utilité.
 * Le string "mString" représente visuellement la valeur de la carte,
 * pour facilité le debugage.
 *
 * Created by simon on 02-11-15.
 */
public enum CardValue {

    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "J"),
    QUEEN(12, "Q"),
    KING(13, "K"),
    AS(14, "1");

    private int mValue;
    private String mString;

    CardValue(int value, String s) {
        mValue = value;
        mString = s;
    }

    public int value() {
        return mValue;
    }

    public String asString() { return mString; }
}
