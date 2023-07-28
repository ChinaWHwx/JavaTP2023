package Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 使用reduce()方法计算整数列表的和
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        // 打印结果
        System.out.println(sum); // 输出：15
    }
}
//聚合
