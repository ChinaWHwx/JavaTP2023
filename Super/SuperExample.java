package Super;


public class SuperExample {
  public static void main(String args[]){
    Dog dog = new Dog("Max", "Bixiom");
    dog.makeSound();
    dog.fetch();
    dog.printName();
  }
}
/*
 * 当子类重写或重载了父类的方法时，仍然可以使用super关键字来调用父类的非静态方法
 * 在子类中可以写 super.makeSound();//此时实例化了父类的对象，再去调用父类的方法
 * 
 * 如果子类需要访问父类的静态变量，应使用'父类名.静态变量名'来访问
 * 对于父类的静态方法，应该使用'父类名.方法名'来访问
 * 当父类的方法被声明为final时，子类无法重写与重载。
 */
