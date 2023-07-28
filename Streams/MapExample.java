package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 使用map()方法将所有字符串转换为大写形式
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // 打印结果
        System.out.println(upperCaseNames); // 输出：[ALICE, BOB, CHARLIE, DAVID]
    }
}

//映射