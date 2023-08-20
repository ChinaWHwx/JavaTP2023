package Reflection;

import java.lang.reflect.Method;
import java.util.Objects;

public class ReflectionExample {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("java.util.ArrayList");//获取类的信息

        Object object =clazz .newInstance();//创建对象

        Method addMethod = clazz.getMethod("add",Object.class);//获取add方法

        addMethod.invoke(object,"Hello");//调用add方法

        System.out.println(object);//打印对象内容
    }
}
