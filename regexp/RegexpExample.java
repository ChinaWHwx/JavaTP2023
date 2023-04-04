package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpExample {
  public static void main(String[] args){
    String email = "example@example.com";
    String regex = "^([a-zA-Z0-9]+[_\\.-]*)+[a-zA-Z0-9]+@([a-zA-Z0-9]+[_\\.-]*)+[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
    //以字母、数字、下划线、点号和破折号开头，可以有多个点号和破折号，后面紧跟着字母、数字和点号，最后是一个 2 到 6 个字符的顶级域名。
    Pattern pattern = Pattern.compile(regex);//将正则表达式编译成一个 Pattern 对象
    Matcher matcher = pattern.matcher(email);//将待验证的电子邮件地址传递给 Pattern 对象来创建一个 Matcher 对象
    if(matcher.matches()){
      System.out.println("The mail address is valid.");
    } else {
      System.out.println("The mail address is invalid.");
    }
  }
}
