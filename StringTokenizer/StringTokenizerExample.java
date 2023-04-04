package StringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample {
  public static void main(String [] args){
    String str = "apple,banana,orange";
    StringTokenizer st = new StringTokenizer(str, ",");//将指定字符串按指定分隔符划分为多个子字符串，StringTokenizer(str,delimiter);
    StringTokenizer st2 = new StringTokenizer(str,"、");
    while(st.hasMoreTokens()){
      String token = st.nextToken();
      System.out.println(token);
    }
    while(st2.hasMoreTokens()){
      String token2 = st2.nextToken();
      System.out.println(token2);
    }
  }
}
