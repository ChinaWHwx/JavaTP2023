package Default;

public interface MyInterface {
    void regularMethod();
    default void defaultMethode(){//接口中定义默认方法，可以被实现类继承或覆盖
        System.out.println("This is a default method");
    }
}

class Myclass{
    int myField;//默认包内可见
    void myMethod(){
        System.out.println("this is a default-access method.");
    }
}

/*
 int day = 5;
 switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    ...
    case 5:
    ...
    default:
        System.out.println("Other day");
 */