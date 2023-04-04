package Foreach;

public class Foreach {
  public static void main(String args[]){
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
    System.out.println("Number is " + number);//循环体
  }
  }
}

//foreach循环的语法是：for (元素类型 元素变量 : 集合) { 
// 循环体 
//}