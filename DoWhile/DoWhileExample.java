package DoWhile;

public class DoWhileExample {
  public static void main(String args[]){
    int count = 0;
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count < 5);
  }
}

/*
 * Count is: 0
 * Count is: 1
 * Count is: 2
 * Count is: 3
 * Count is: 4
 */
