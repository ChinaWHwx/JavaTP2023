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

//Java中创建一个新对象时，它需要经历以下过程：

//分配内存空间：在堆内存中为新对象分配空间。

//初始化默认值：在内存空间中将所有实例变量初始化为其默认值（整数为0，布尔值为false，引用为null等）。

//执行构造函数：执行构造函数以对实例变量进行初始化，并在构造函数结束时返回新创建的对象。

//返回引用：将对象引用返回给调用方，以便可以在程序中使用该对象。
