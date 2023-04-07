package vehicule;

public class Gestion {
  public static void main(String args[]){
        Voiture v = new Voiture("ZZ 002 TC");
        System.out.println(v.getImmat());
        System.out.println(v.getPlaces());
        Camion c = new Camion();
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println("===============");
        Vehicule vehture = new Voiture();
        vehture.afficher(); //afficher(); de voiture
        //((Vehicule)vehture).afficher(); //Pas d'impact, affiche toujours afficher() de voiture
        System.out.println(((Voiture)vehture).getPlaces());//将vehicule类型的对象强制转换为voiture，并调用voiture类型的getPlaces方法
                                                          //获取places属性的值并输出
        System.out.println("=============== Polymorphisme marche directement ===============");
        Vehicule veh = new Vehicule();
        veh.afficher(); //Vehicule
        Voiture w = new Voiture();
        w.afficher(); //Voiture
        Camion cam = new Camion();
        cam.afficher(); //Camion
        Vehicule z = new Voiture();
        z.afficher(); //Voiture
        ((Voiture)z).special();
        System.out.println(z);
        System.out.println((Voiture)z);
        //Voiture i = new Vehicule(); 
        //Erreur！因为Voiture是Vehicule的子类，它继承了Vehicule的所有属性和方法，但Vehicule不具有Voiture的特性。
        //这意味着，如果你创建一个Vehicule对象，并将其赋给Voiture类型的变量，这是不合法的，因为它缺少Voiture具有的特殊属性和方法。
        //在Java中，一个子类的实例可以被赋值给一个父类的引用，比如：Vehicule z = new Voiture();
        //但一个父类的实例不能被赋值给一个子类的引用。
  }
  
}
