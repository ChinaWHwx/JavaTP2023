package Exception;

public class CustomException extends Exception{//自定义一个异常类
    public CustomException(String message){
        super(message);//调用父类构造函数来设置异常消息
    }
}
