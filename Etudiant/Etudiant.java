package Etudiant;

public class Etudiant {
  private String nom;
  private int id;
  private static int compteur = 0;

  public Etudiant(){
    compteur ++;
  }

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
    //Etudiant et = new Etudiant();

    System.out.println("nom:" + e.nom);
    System.out.println("id:" + e.id);

    System.out.println(compteur);
    System.out.println(getCompteur());

    /*
     * System.out.println(et.compteur);
     * System.out.println(et.getCompteur());
     * 在Java中，静态变量是属于类本身而不是类的实例对象的，
     * 因此，应该使用类名来访问静态变量而不是使用实例对象来访问。
     * 所以，应该使用Etudiant.compteur而不是et.compteur来访问静态变量。
     */
    

    System.out.println(Etudiant.compteur);
    System.out.println(Etudiant.getCompteur());//静态变量是所有类实例共享的变量，因此它们的值在类的所有实例之间是唯一的。

  }
}

//Java中创建一个新对象时，它需要经历以下过程：

//分配内存空间：在堆内存中为新对象分配空间。

//初始化默认值：在内存空间中将所有实例变量初始化为其默认值（整数为0，布尔值为false，引用为null等）。

//执行构造函数：执行构造函数以对实例变量进行初始化，并在构造函数结束时返回新创建的对象。

//返回引用：将对象引用返回给调用方，以便可以在程序中使用该对象。
