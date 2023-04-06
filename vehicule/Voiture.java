package vehicule;

public class Voiture extends Vehicule{
  private String immat;
  //private int couleur;
  private int places;

  public Voiture(){
    super();
  }

  public Voiture(String im){
    super(im);
  }

  public void afficher(){
      System.out.println("Je suis une Voiture et l'immatriculation est : " + immat);
  }

  public int getPlaces(){
      return places;
  }

  public void special(){
      System.out.println("Je suis spécial à la voiture");
  }
}
