package Switch;

public class Switch {
  public static void main(String []args){
    int dayOfWeek = 5;
    String dayName;

    switch(dayOfWeek){
      case 1:
        dayName = "Monday";
        break;//如果不写break，则会自动跳过当前case，进入下一个case；
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wensday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;        
      case 6:
        dayName = "Sateurday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default://如果在Java中的switch语句中没有添加default分支，则在测试的表达式不匹配任何case分支时，程序将会跳过switch语句而继续执行下一个语句。
        dayName = "Invalid day";
              //通常建议在Java switch语句中添加一个default分支，以便在测试的表达式不匹配任何case分支时提供默认行为。
    }

    System.out.println(dayName);
  }
}
