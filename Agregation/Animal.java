package Agregation;

public class Animal {
    String nom;

    public Animal(){
        nom = "Inconnu";
    }
    public Animal(String nom) {
        this.nom = nom;
    }

    public void afficher(){
        System.out.println(nom);
    }
}
