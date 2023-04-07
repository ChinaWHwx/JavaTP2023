package vehicule;

public class Voiture extends Vehicule{
  private String immat;
  //private int couleur;
  private int places;

  public Voiture(){
    super();//调用父类构造函数
  }

  public Voiture(String im){
    super(im);//调用父类构造函数
  }

  /*
   * super可以调用父类构造方法
   *             父类方法
   *             访问父类成员变量
   * 详见Super文件夹例子
   */

  @Override
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
