package Super;


public class SuperExample {
  public static void main(String args[]){
    Dog dog = new Dog("Max", "Bixiom");
    dog.makeSound();
    dog.fetch();
  }
}
/*
 * 当子类重写或重载了父类的方法时，仍然可以调用父类的方法，可以使用super关键字来调用父类的方法
 * 比如这里可以写 super.makeSound(0;
 */
