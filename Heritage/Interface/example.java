package Heritage.Interface;


interface IA{//父接口A（接口为更纯粹的抽象类，结构组成只含全局常量和抽象方法）
  void funA();
}
interface IB {//父接口B（接口前添加I用以区分接口）
  void funB();
}


interface CImpl extends IA,IB{//接口可继承多个父接口，用,分隔开即可，子接口的命名可选择较为重要的父接口进行命名或自行命名，一般子接口后添加Impl用以区分
  void funC();
}

class Impl implements CImpl{//定义类实现接口（也可直接实现父接口（多个））
  public void funA(){//抽象方法的实现
      System.out.println("1,ok！");
  }
  public void funB(){
      System.out.println("2,ok！");
  }
  public void funC(){
      System.out.println("3,ok!");
  }
}
public class example {
  public static void main(String args[]){
    Impl im=new Impl();//实例化对象
    im.funA();
    im.funB();
    im.funC();
  }
}

//java编译器会把接口编译成和类一样的可执行文件，
//这个字节码文件会被Java虚拟机加载和解析，然后在运行时由Java程序动态实现接口中定义的方法。
