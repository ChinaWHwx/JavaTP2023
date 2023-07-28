package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 使用count()方法计算元素的个数
        long count = numbers.stream().count();
        System.out.println("元素个数：" + count); // 输出：5

        // 使用sum()方法计算元素的总和
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("元素总和：" + sum); // 输出：15

        // 使用average()方法计算元素的平均值
        double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println("元素平均值：" + average); // 输出：3.0
    }
}

