package Variable;

public class VariableExample {
  private static int globalVar = 10;//全局变量
  private int instanceVar = 20;//实例变量

  public void exampleMethod(int parameterVar){//使用方法参数
    System.out.println("Parameter Variable:" + parameterVar);
  }

  public static void main(String args []){
    int localVal = 40;//局部变量

    System.out.println("Global Variable: " + globalVar);
    VariableExample v = new VariableExample();
    System.out.println("Instance Variable:" + v.instanceVar);
    v.exampleMethod(30);
    System.out.println("localVar:" + localVal);
  }
}
