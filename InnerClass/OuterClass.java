package InnerClass;

public class OuterClass {
    private int outerValue;
    private static int outerValue2;

    class InnerClass{
        void printOuterValue(){
            System.out.println("Outer Value"+outerValue);
        }
    }//成员内部类，可以访问外部类的实例变量和方法

    static class StaticInnerClass{
        void printOuterValue(){
            System.out.println("Outer static value:"+outerValue2);
        }
    }//不可以访问外部类的非静态成员

    void someMethod(){
        class LocalInnerClass{
            void printMessage(){
                System.out.println("Hello from local inner class");
            }
        }
    LocalInnerClass inner = new LocalInnerClass();
        inner.printMessage();
    }//定义在方法内部的类，只在方法内部可见，只能在方法内部实例化和访问

    Void someMethode2(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in anonymous inner class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        return null;
    }//匿名内部类，可以在实例化的地方定义，并覆盖其方法。用于临时实现某个接口和类的方法。
}
