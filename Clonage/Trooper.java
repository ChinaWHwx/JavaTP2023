package Clonage;

import java.util.Random;

public class Trooper implements Cloneable{//士兵类
    private static int compteur = 0;
    /*
     *计数器变量必须被声明为静态的，这样它的值就可以在所有的Trooper类的实例之间共享。
     *当一个变量被声明为静态时，这个变量的单一副本就会被创建并被类的所有实例共享。
     *这意味着每次创建一个新的Trooper实例时，计数器的值都会被递增，并且所有克隆都使用相同的更新值。
     *如果没有静态声明，Trooper的每个实例都会有自己的计数器变量的副本，这意味着每个克隆都有自己的标识符，计数器的值不会在它们之间共享。
     *通过使用静态变量，我们确保每一个新的克隆都能得到一个唯一的标识符，即在每次创建克隆时递增计数器的值。
     */

    private int identifiant;
    private String nom;
    private int niveauSante;
    private Arme arme;
    private Grade grade;

    public Trooper() {
        this("Clone de Jango Fett #" + ++compteur, (int) (Math.random() * 51) + 50, new Fusil(compteur), Grade.TROOPER);
    }

    public Trooper(String nom, int niveauSante, Arme arme, Grade grade) {
        this.identifiant = ++compteur;
        this.nom = nom;
        this.niveauSante = niveauSante;
        this.arme = arme;
        this.grade = grade;
    }

    public void setId(){
        this.identifiant = identifiant;
    }
    public int getId() {
        return identifiant;
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

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public String toString() {
        return "Trooper{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", niveauSante=" + niveauSante +
                ", arme=" + (arme !=null?arme.getSerie():null) +
                ", grade=" + grade +
                '}';
    }

    /*
    @Override
    public Object clone() {
        Trooper object = null;
        try {
            object = (Trooper) super.clone();
        } catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return object;
    }
    */
    @Override
    public Object clone() {
        try {
            Trooper clone = (Trooper) super.clone();
            clone.arme = (Arme) arme.clone(); // 深克隆引用类型属性
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }




    public static void main(String[] args) {
        Trooper cody = new Trooper("Cody", 90, new Fusil(123), Grade.COMMANDEUR);
        System.out.println("Cody: " + cody);

        Trooper cloneCody = (Trooper) cody.clone();
        cloneCody.nom = "Mort";
        cloneCody.niveauSante = 49;
        ((Fusil) cloneCody.arme).setSerie(456);

        System.out.println("Original Cody: " + cody);
        System.out.println("Clone Cody: " + cloneCody);
    }
}


//浅克隆：会复制原始对象的基本属性，但对于引用类型属性，只复制引用，不复制引用指向的对象。这意味着克隆对象和原始对象共享相同的引用类型属性所指向的对象。
//当修改克隆对象的武器编号时，原始对象的武器编号也会被修改，因为它们共享同一个武器对象。
//------------------------------------------------------------------------------------------------------------------------
//深克隆：深克隆会复制原始对象的所有属性，包括引用类型属性所引用的对象。这意味着克隆对象和原始对象拥有各自独立的属性副本，彼此之间不会相互影响。