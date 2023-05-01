package Heritage;

public class example {
  public static void main(String[] args){
    A a=new A();
    a.fun();
    print(new B());//向上转型（优点在于子类可自动进行向上转型，可实现参数的统一）
    print(new C());
}
  public static void print(A a){
    a.fun();
  }
  
}

class A{//父类A类
  private int num=10;
  public int getNum(){
    return this.num;
  }
  public void fun(){
    System.out.println("Hello！");
  }
}
class B extends A{//B类继承A类
  private String name="Elon Mask";
  public String getName(){
      return this.name;
  }
  @Override
  public void fun(){//方法覆写
      System.out.println(this.getNum());
      //父类私有域被继承但不可直接使用，需通过getter方法间接获得私有域的内容
  }
}

class C extends B{//C类继承B类，相当于间接继承A类
  private String name="Bill Gates";
  public String getName(){
      return this.name;
  }
  @Override
  public void fun(){//方法覆写（结果为覆写后的内容）
      System.out.println(this.getName());
      System.out.println(this.name);
  }
}
