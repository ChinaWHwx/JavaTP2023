package Clonage;

import java.util.Random;

public class Trooper {
    private static int compteur = 0;
    /*
     *计数器变量必须被声明为静态的，这样它的值就可以在所有的Trooper类的实例之间共享。
     *当一个变量被声明为静态时，这个变量的单一副本就会被创建并被类的所有实例共享。
     *这意味着每次创建一个新的Trooper实例时，计数器的值都会被递增，并且所有克隆都使用相同的更新值。
     *如果没有静态声明，Trooper的每个实例都会有自己的计数器变量的副本，这意味着每个克隆都有自己的标识符，计数器的值不会在它们之间共享。
     *通过使用静态变量，我们确保每一个新的克隆都能得到一个唯一的标识符，即在每次创建克隆时递增计数器的值。
     */

    private int id;
    private String nom;
    private int niveauSante;
    private Arme arme;
    private Grade grade;

    public Trooper(){
        this.id = ++compteur;
        this.nom = "Clone de Jango Fett #" + id;
        this.niveauSante = new Random().nextInt(51)+50;
        this.arme = null;
        this.grade = Grade.TROOPER;
    }

    public Trooper(String nom, int niveauSante, Arme arme, Grade grade) {
        this.id = ++compteur;
        this.nom = nom;
        this.niveauSante = niveauSante;
        this.arme = arme;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauSante() {
        return niveauSante;
    }

    public Arme getArme() {
        return arme;
    }

    public Grade getGarde() {
        return grade;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public String toString() {
        return "Trooper{" +
                "identifiant=" + id +
                ", nom='" + nom + '\'' +
                ", niveauSante=" + niveauSante +
                ", arme=" + arme +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        Trooper trooper1 = new Trooper();
        System.out.println(trooper1);

        Fusil fusil = new Fusil(123);
        Trooper trooper2 = new Trooper("Cody", 80, fusil, Grade.SERGENT);
        System.out.println(trooper2);
    }
}
