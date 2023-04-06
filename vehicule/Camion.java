package vehicule;

public class Camion extends Vehicule{
  private String immat;
  private int capacite;

  public void setCapacite(int capa){capacite=capa;}
  public int getCapacite(){return capacite;};


  public Camion(){
    super();
  }

  public Camion(String im){
    super(im);
  }

  public void afficher(){
    System.out.println("Je suis un Camion et l'immatriculation est : " + immat);
  }
}
