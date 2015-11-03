package be.simongenin.models;

/**
 * Représente le tas de cartes du milieu
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

    @Override
    public void add(Card c) {
        super.add(c);
        // TODO voir si on ne coupe pas
    }

    @Override
    public void add(CardPack pack) {
        super.add(pack);
        // TODO voir si on ne coupe pas
    }
}
