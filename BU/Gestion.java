package BU;

public interface Gestion {
    void enregistrerLivre(Bibliotheque bibliotheque, Livre livre) throws Bibliotheque.BibliothequePleineException;
}
