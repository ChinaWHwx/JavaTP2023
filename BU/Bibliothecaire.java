package BU;

public class Bibliothecaire extends Personne implements Gestion{
    public Bibliothecaire(String nom, String prenom){
        super(nom,prenom);
    }

    @Override
    public void enregistrerLivre(Bibliotheque bibliotheque, Livre livre) throws Bibliotheque.BibliothequePleineException{
        bibliotheque.ajouterLivre(livre);
    }
}
