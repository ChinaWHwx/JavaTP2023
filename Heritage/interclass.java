package Heritage;

public class interclass {
  public static void main(String[] args){
    F f=new F();//实例化F类对象
    f.print();//调用F中print方法
}
}

class D{//D类
  private int num=10;
  public int getNum(){
      return this.num;
  }
  public void fun(){
      System.out.println("cool！");
  }
}
class E {//E类（与A类无关）
  private String name="Elon";
  public String getName(){
      return this.name;
  }
  public void fun(){
      System.out.println("nice!");
  }
}
class F {//F类
  // private String name="Bill";
  class OneD extends D{//F类中内部类继承D类
      public void printD(){
          System.out.println(this.getNum());
          fun();
      }
  }
  class OneE extends E{//F类内部类继承E类
      public void printE(){
          System.out.println(this.getName());
          fun();
      }
  }
  public void print(){//在F类中生成普通方法print()
      new OneD().printD();//匿名实例化OneD类对象并调用printD方法
      new OneE().printE();
  }
}

/*
 * 这段Java代码定义了5个类：D、E、F和F的内部类OneD和OneE。

 * 其中，D和E是两个独立的类，F类中定义了两个内部类OneD和OneE，它们都继承自独立的类D和E，分别实现了printD和printE方法。

 * F类中的print方法实例化了OneD和OneE类的对象，并调用它们的printD和printE方法。

 * 这个代码示例主要展示了Java中的内部类继承的使用方法。
 
 * 内部类是定义在另一个类中的类，它可以访问外部类的私有成员，并且可以实现接口、继承其他类或者被其他类继承。
 
 * 内部类可以分为成员内部类、局部内部类、匿名内部类和静态内部类等几种类型。
 
 * 内部类常用于实现一些辅助性的功能，例如事件监听、迭代器等。
 */
