package Imbrique.dynamique;

public class OuterClass {
    private int outerVar = 5;
    public void outerMethod(){
        System.out.println("Outer method");
    }

    //非静态内部类（成员内部类）
    public class InnerClass{
        private int innerVar = 15;
        //内部变量
        public void innerMethod(){
            System.out.println("Inner method");
            System.out.println("Accessing outer Variable: "+outerVar);
        }
    }
}
