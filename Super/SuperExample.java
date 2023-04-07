package Super;


public class SuperExample {
  public static void main(String args[]){
    Dog dog = new Dog("Max", "Bixiom");
    dog.makeSound();
    dog.fetch();
  }
}
/*
 * 当子类重写或重载了父类的方法时，仍然可以使用super关键字来调用父类的非静态方法
 * 比如这里可以写 super.makeSound();//此时实例化了父类的对象，再去调用父类的方法
 * 
 * 如果子类需要访问父类的静态变量或方法时，应使用'父类名.方法名'
 * 当父类的方法被声明为final时，子类无法重写与重载。
 */
