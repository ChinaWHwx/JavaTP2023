public class Hello {
    public static void main(String[] args){
      /* 
       * int i = 0;
       * char c = 'A';
       * double d = 1.0;
       * float f = 1.3f;
      */
      int i = 0;
      i = i+1;
      i += 1;
      i *= 2;
      System.out.println(i);
      System.out.println(++i);
      System.out.println(i);
      System.out.println(i++);
      System.out.println(i);

      i = (int)10.6;
      System.out.println(i);
      //4
      //5
      //5
      //5
      //6
      //10
    }
}