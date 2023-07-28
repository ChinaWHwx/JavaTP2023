package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3, 7, 4, 8, 6);

        // 使用sorted()方法对整数列表进行升序排序
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // 打印结果
        System.out.println(sortedNumbers); // 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

//排序
