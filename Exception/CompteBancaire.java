package Exception;

public class CompteBancaire {
  private double solde = 0.0;       // solde du compte
  private double decouvert = -700.; // découvert autorisé


  public void retrait(double montant) 
   throws IllegalArgumentException, AutorisationException {
    double nouveau = solde - montant;
    if (montant<0.0) 
      throw new IllegalArgumentException("Mauvais montant");
    if (nouveau<decouvert) 
      throw new AutorisationException();
    solde = nouveau;
  }

  public static void main(String[] args) {
    CompteBancaire compte = new CompteBancaire();
    try {
      compte.retrait(800.0);
      System.out.println("Retrait effectué avec succès !");
    } catch (IllegalArgumentException e) {
      System.out.println("Erreur : Mauvais montant");
    } catch (AutorisationException e) {
      System.out.println("Erreur : Retrait non autorisé");
    }
  }
}
