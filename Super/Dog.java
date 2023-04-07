package Super;

public class Dog extends Animal {
  private String breed;

  public Dog(String name, String breed){
    super(name);//1.调用父类有参构造方法
    this.breed = breed;
  }

  @Override
  public void makeSound(){
    super.makeSound();//2.调用父类方法
    System.out.println("The"+breed+"dog barks");
  }

  public void fetch(){
    System.out.println("The"+breed+"dog fetches the ball");
  }

  public void printName(){
    System.out.println(super.name);//3.调用父类成员
                                  //注意：这里父类的成员变量不可以设为private，否则无法访问，应设为protected；
  }
}


/*
 * The Max makes a sound
 * TheBixiomdog barks
 * TheBixiomdog fetches the ball
 */