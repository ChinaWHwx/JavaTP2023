package Generic;

public class Generique <E> {
    private E element;
    public Generique(E element){
        this.element = element;
    }

    public E getElement(){
        return element;
    }

    public void setElement(E element){
        this.element = element;
    }

    public static void main(String[] args){
        Generique<Integer> intGenerique =new Generique<>(10);
        System.out.println(intGenerique.getElement());

        Generique<String> strGenerique = new Generique<>("Hello");
        System.out.println(strGenerique.getElement());
    }
}


