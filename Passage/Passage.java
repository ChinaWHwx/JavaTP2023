package Passage;

import java.util.Arrays;
import Passage.A;
import Passage.AE;

public class Passage{
  static void methode1(int i){
    i = 3;
  }//methode1是传递基本类型参数的方法，演示了传递基本类型参数时对实参的修改不会影响到原始值

  static void methode2(int []t){
    t[4] = 7;
  }//methode2是传递引用类型参数的方法，演示了传递引用类型参数时对对象成员的修改会影响到原始值

  static void methode3(int []t){
    t = new int [10];
    t[4] = 9;
  }//methode3是传递引用类型参数的方法，但方法内部对参数进行了重新赋值，因此对新对象成员的修改不会影响到原始值

  static void methode4(AE a){
    a = new AE(2);
  }//methode4是传递引用类型参数的方法，但方法内部对参数进行了重新赋值，因此对新对象的修改不会影响到原始值

  static void methode5(AE c){
    c.setValeur(3);
  }//methode5是传递引用类型参数的方法，演示了通过方法内部的访问器方法来修改对象成员的值的正确方式

  static AE methode6(AE b){
    b = new AE(4);
    return b;
  }//methode6是传递引用类型参数的方法，演示了通过方法内部的重新赋值返回新对象的正确方式
  public static void main(String [] args){
    int i = 5;
    int [] t = new int[10];
    methode1(i);
    System.out.println(t);//显示数组的引用（内存地址）
    System.out.println(Arrays.toString(t));//显示数组的内容
    methode2(t);//此时修改数组对象的引用
    System.out.println(t);//引用地址不变
    System.out.println(Arrays.toString(t));//数组引用存放的数据发生变化
    methode3(t);//相当于从当前数组引用拷贝一份新的，修改新的数组成员，不影响最初数组引用的值。
    System.out.println(t);
    System.out.println(Arrays.toString(t));

    AE a = new AE(1);
    System.out.println(a.getValeur());//输出当前a对象的valeur2值为1
    methode4(a);
    System.out.println(a.getValeur());//输出当前a对象的valeur2值为1，未被修改
    methode5(a);
    System.out.println(a.getValeur());//输出当前a对象的valeur2值为3，被修改了
    a = methode6(a);
    System.out.println(a.getValeur());//输出当前a对象的valeur2值为4，被修改了
  }
}

/*
[I@d716361
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[I@d716361
[0, 0, 0, 0, 7, 0, 0, 0, 0, 0]
[I@d716361
[0, 0, 0, 0, 7, 0, 0, 0, 0, 0]
1
1
3
4
 */