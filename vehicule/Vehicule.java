package vehicule;

public class Vehicule {
  protected String immat;

  public Vehicule(){
        immat = "0000 AA 00"; // ou this("0000 AA 00");
  }

  public Vehicule(String im){
    immat = im;
  }
  public void afficher(){
    System.out.println("Je suis un Véhicule");
  }

  public void avancer(){
    System.out.println("J'avance");
  }

  public final String getImmat(){
    return immat;
  }
  
  public final void setImmat(String im){
    immat = im;
  }
}
