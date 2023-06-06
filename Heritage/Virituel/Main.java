package Heritage.Virituel;

public class Main {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
