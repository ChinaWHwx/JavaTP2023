package Cours;

public class Cours {
  private int nbEtudiants;
  private boolean passionnant;

  public void setNbEtudiants(int n){
    nbEtudiants = n;
  }

  public int getNbEtudiants(){
    return nbEtudiants;
  }

  public void setPassionnant(boolean p){
    passionnant = p;
  }

  public boolean isPassionnant(){
    return passionnant;
  }

  public Cours(){
    //nbEtudiants = 0;
    this(0,true);
  }

  public Cours(int n,boolean b){
    setNbEtudiants(n); 
    setPassionnant(b);
  }

  public Cours(int n){
    setNbEtudiants(n);
  }

  public static void main(String args[]){
    Cours c1 = new Cours();
    Cours c2 = new Cours(12);

    System.out.println("Classe #" + c2.getNbEtudiants());
    if(!c1.isPassionnant())
      System.out.println("bof");

    System.out.println(c2);
    System.out.println(c2.toString());//这两行代码是等效的
    /*
     * 两者的输出结果都是调用c2对象的toString()方法，将其转换为字符串输出。
     * 如果在Cours类中没有重写toString()方法，则默认使用Object类的toString()方法。
     * 默认情况下，Object类的toString()方法会返回一个包含对象类型和哈希码的字符串。
     * Classe #12
     * Cours.Cours@7a81197d
     * Cours.Cours@7a81197d
     */
  }
}
