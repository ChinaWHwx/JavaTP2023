package Streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 9, 10);

        // 使用anyMatch()方法检查是否有任何一个元素是奇数
        boolean hasOddNumber = numbers.stream()
                .anyMatch(n -> n % 2 != 0);

        // 打印结果
        System.out.println(hasOddNumber); // 输出：true
    }
}
//匹配
