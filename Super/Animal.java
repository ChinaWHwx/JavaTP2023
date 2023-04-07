package Super;

public class Animal {
  protected String name;

  public Animal(String name){
    this.name = name;
  }

  public void makeSound() {
    System.out.println("The " + name + " makes a sound");
  }
}
