package Encapsulation;

public class Person {
  private String name;
  private int age;

  public Person(String name,int age){
    this.name = name;
    this.age  = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    if(age<0){
      System.out.println("Age cannot be negative.");
    }else{
      this.age = age;
    }
  }

  @Override
  public String toString(){
    return "name:" + name + ",age:" + age;
  }

  public static void main(String args[]){
    Person person = new Person("Alice",25);
    System.out.println(person);

    person.setName("Eric");
    person.setAge(24);
    System.out.println(person);
  }
}


/*
 * name:Alice,age:25
 * name:eric,age:24
 */