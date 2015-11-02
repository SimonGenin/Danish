package be.simongenin.models.enums;

/**
 * Les 4 "couleurs" des cartes du Danish.
 * Chaque couleur possede une valeur entiere,
 * afin de pouvoir les comparer. Plus cette valeur est
 * grande et plus cette couleur est priorotaire.
 * (Le 4 de coeur commence par exemple, donc priorité de 4).
 * mString représente visuellement la valeur de l'enum pour le
 * debugage.
 *
 * Created by simon on 02-11-15.
 */
public enum CardSuit {

    HEARTS(4, "H"), DIAMONDS(3, "D"), SPADES(2, "S"), CLUBS(1, "C");

    private int mPriority;
    private String mString;

    private CardSuit(int priority, String s) {
        mPriority = priority;
        mString = s;
    }

    public int priority() {
        return mPriority;
    }

    public String asString() {
        return mString;
    }
}
