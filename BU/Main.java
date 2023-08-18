package BU;

public class Main {
    public static void main(String args[]){
        Livre livre1 = new Livre("Livre1",19.99);
        Livre livre2 = new Livre("Livre2",14.99);

        LivreNumerique livreNumerique = new LivreNumerique("Livre Numerique1",9.99, Format.PDF);

        Bibliotheque bibliotheque = new Bibliotheque(3);

        Gestion gestionnaire = new Bibliothecaire("Jean","Pierre");

        try {
            gestionnaire.enregistrerLivre(bibliotheque,livre1);
            gestionnaire.enregistrerLivre(bibliotheque,livre2);
            gestionnaire.enregistrerLivre(bibliotheque,livreNumerique);
        }catch (Bibliotheque.BibliothequePleineException e){
            System.out.println("Erreur:" + e.getMessage());
        }

        System.out.println(("Nombre de livres dans la bibliotheque:" + bibliotheque.getNombreLivres()));
    }
}
