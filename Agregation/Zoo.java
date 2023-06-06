package Agregation;

public class Zoo {
    static final int NB_ANI = 50;
    Animal[] animaux;
    public Zoo(){
        animaux = new Animal[NB_ANI];
    }

    public void  setAnimal(int i, Animal a){
        if((i>=0)&&(i<NB_ANI))
        animaux[i] = a;
    }

    public Animal getAnimal(int i){
        if ((i >= 0) && (i < NB_ANI))
            return animaux[i];
        else
            return null;
    }

    public static void main(String[] chaines){
        Zoo zoo = new Zoo();
        zoo.setAnimal(0, new Animal("lion"));

        Animal animal1 = zoo.getAnimal(0);
        if (animal1 != null)
            animal1.afficher();

        Animal animal2 = zoo.getAnimal(1);
        if (animal2 != null)
            animal2.afficher();

        Animal animal60 = zoo.getAnimal(60);
        if (animal60 != null)
            animal60.afficher();
    }

}
