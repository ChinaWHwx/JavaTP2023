package Etudiant;

public class Etudiant {
  private String nom;
  private int id;
  private static int compteur = 0;

  public Etudiant(String nom, int id) {
    this.nom = nom;
    this.id = id;
    compteur++;
  }

// getters and setters for name and id

  public static int getCompteur() {
      return compteur;
  }

  public static void main(String args[]){
    Etudiant e  =  new Etudiant("xin", 1);
    System.out.println("nom:" + e.nom);
    System.out.println("id:" + e.id);
  }
}
