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
  
  @Override//如果子类中的方法与父类中的方法具有相同的名称、返回类型和参数列表，则子类中的方法被称为覆盖或重写了父类中的方法,@override注解可省略
  public void afficher(){
    System.out.println("Je suis un Camion et l'immatriculation est : " + immat);
  }
}
