package Clonage;

import java.util.Random;

public class Trooper implements Cloneable{
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
    private  Ceinture ceinture;

    public Trooper(){
        this.id = ++compteur;
        this.nom = "Clone de Jango Fett #" + id;
        this.niveauSante = new Random().nextInt(51)+50;
        this.arme = null;
        this.grade = Grade.TROOPER;
    }

    public Trooper(String nom, int niveauSante, Arme arme, Grade grade, Ceinture ceinture) {
        this.id = ++compteur;
        this.nom = nom;
        this.niveauSante = niveauSante;
        this.arme = arme;
        this.grade = grade;
        this.ceinture = ceinture;
    }

    public void setId(){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNiveauSante(int niveauSante) {
        this.niveauSante = niveauSante;
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

    public void setCeinture(Ceinture ceinture) {
        this.ceinture = ceinture;
    }

    public Ceinture getCeinture(){
        return  ceinture;
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
                ", arme=" + (arme !=null?arme.getSerie():null) +
                ", grade=" + grade +
                ", ceinture= " + ceinture +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Trooper trooper = (Trooper) super.clone();
        if (this.arme != null) {
            trooper.arme = (Arme) this.arme.clone(); // 深拷贝Arme对象
        }
        if (this.ceinture != null) {
            trooper.ceinture = (Ceinture) this.ceinture.clone(); // 深拷贝Ceinture对象
        }
        return trooper;
    }




    public static void main(String[] args) {
        Trooper trooper = new Trooper();
        System.out.println(trooper);

        try {
            Trooper clone = (Trooper) trooper.clone();
            clone.setNom("Clone de Jango Fett #" + clone.getId());
            clone.getArme().setSerie(999);
            clone.setNiveauSante(49);
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
