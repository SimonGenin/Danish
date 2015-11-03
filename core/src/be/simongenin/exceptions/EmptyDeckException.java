package be.simongenin.exceptions;

/**
 * Lanc� lorsque l'on tente une op�ration sur un deck
 * vide qui ferait cracher le jeu.
 * Comme tirer une carte avec un deck vide.
 *
 * Created by simon on 03-11-15.
 */
public class EmptyDeckException extends Exception {

    public EmptyDeckException() { super(); }
    public EmptyDeckException(String s) { super(s); }

}
