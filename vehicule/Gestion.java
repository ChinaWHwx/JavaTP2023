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
        System.out.println(((Voiture)vehture).getPlaces());
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
        //Voiture i = new Vehicule(); //Erreur
  }
  
}
