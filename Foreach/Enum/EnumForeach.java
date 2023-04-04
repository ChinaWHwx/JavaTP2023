package Foreach.Enum;

enum DayOfWeek {//枚举类会被自动编译成一个类文件，其中包含枚举常量（例如"MONDAY"、"TUESDAY"等）和枚举方法（例如"values()"和"valueOf()"）。
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY
}

public class EnumForeach {
  public static void main(String args []){
    DayOfWeek[] days = DayOfWeek.values();
    for(DayOfWeek day:days){
      System.out.println(day);
    }
  }
}

//wx@LAPTOP-4OG5AJ85:~/javaTP/TP2023/src/Foreach/Enum$ java -cp ~/javaTP/TP2023/src Foreach.Enum.EnumForeach Enum.DayOfWeek
