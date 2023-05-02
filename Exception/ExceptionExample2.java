package Exception;

import java.util.Scanner;

public class ExceptionExample2 {
  public static void main(String args[]){
    try (Scanner scanner = new Scanner(System.in)) {
      int num1, num2, result;
      System.out.println("请输入两个数字：");

      try{
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = num1/num2;
        System.out.println("计算的结果是："+result);
      }catch(ArithmeticException e){
        System.out.println("出现了除以0的计算错误：" + e.getMessage());
      }catch(Exception e){
        System.out.println("出现了其他错误:" + e.getMessage());
      }finally{
        System.out.println("程序结束！");
      }
    }
  }
}
