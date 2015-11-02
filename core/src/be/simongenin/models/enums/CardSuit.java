package be.simongenin.models.enums;

/**
 * Les 4 "couleurs" des cartes du Danish.
 * Chaque couleur possede une valeur entiere,
 * afin de pouvoir les comparer. Plus cette valeur est
 * grande et plus cette couleur est priorotaire.
 * (Le 4 de coeur commence par exemple, donc priorité de 4).
 *
 * Created by simon on 02-11-15.
 */
public enum CardSuit {

    HEARTS(4), DIAMONDS(3), SPADES(2), CLUBS(1);

    private int mPriority;

    private CardSuit(int priority) {
        mPriority = priority;
    }

    public int priority() {
        return mPriority;
    }
}
