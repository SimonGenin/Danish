package be.simongenin.models;

/**
 * Repr�sente le tas de cartes du milieu
 *
 * Created by simon on 03-11-15.
 */
public class Pile extends CardPack {

    /**
     * Coupe les cartes et les met toutes
     * dans un autre pack. (Cutzone)
     */
    public void cut(CardPack pack) {
        pack.add(this);
        mCards.clear();
    }
}