package Tableux;

public class Tableux {
  public static void main(String args []){
    int [] t1 = new int [5];//如果没有显式地为其分配初始值，则其所有元素将被自动初始化为其对应类型的默认值
    int [] t2 = null;
    int [] t3 = t1;

    for (int i=0;i<t1.length;++i)//我们使用length来检查索引，避免访问到数组中不存在的元素，抛出ArrayIndexOutOfBoundsException；
      System.out.println(t1[i]);//对于int类型的数组，其默认值为0
    for(int e:t1) 
      System.out.println(e);

    System.out.println(t2);
    //System.out.println(t2[0]);
    //未实例化数组，抛出 NullPointerException 异常

    System.out.println(t3);//t3 数组变量被赋值为 t1，因此 t3 和 t1 引用同一个数组对象，输出结果为 [I@d716361，
                           //其中 [I 表示 int 类型数组，@d716361 是该数组对象的哈希码。
  }
}

//可以理解为t3拷贝了t1的元素值并存放在其他位置吗？
//不完全正确。在 Java 中，数组变量实际上是引用变量，它们存储的是数组对象在内存中的地址。因此，当您执行以下语句时：

//int[] t3 = t1;
//实际上是将 t3 变量赋值为 t1 变量引用的数组对象的地址。此时，t1 和 t3 引用同一个数组对象。
//因此，对 t3 数组的修改也会反映在 t1 数组中，因为它们实际上引用同一个数组对象。
//需要注意的是，这不是一个拷贝操作，而是一个引用赋值操作。
//如果想要将一个数组复制到另一个数组，可以使用 Java 提供的 System.arraycopy() 方法或者使用 Java 8 中引入的 Arrays.copyOf() 方法。
