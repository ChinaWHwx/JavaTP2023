package Passage;

import java.util.Arrays;

public class Passage{
  static void methode1(int i){
    i = 3;
  }

  static void methode2(int []t){
    t[4] = 7;
  }

  static void methode3(int []t){
    t = new int [10];
    t[4] = 9;
  }

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
  }
}

/*
[I@d716361
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[I@d716361
[0, 0, 0, 0, 7, 0, 0, 0, 0, 0]
[I@d716361
[0, 0, 0, 0, 7, 0, 0, 0, 0, 0]
 */