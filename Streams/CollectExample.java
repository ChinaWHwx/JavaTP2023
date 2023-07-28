package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Pear");

        // 使用collect()方法将包含字母"A"的字符串收集到一个新的列表中
        List<String> wordsWithA = words.stream()
                .filter(s -> s.contains("A"))
                .collect(Collectors.toList());

        // 打印结果
        System.out.println(wordsWithA); // 输出：[Apple, Banana, Grape]
    }
}

