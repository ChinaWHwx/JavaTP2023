package Collections;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 创建一个TreeMap对象
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 添加键值对
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("orange", 30);

        // 获取键值对
        System.out.println("Price of apple: " + treeMap.get("apple"));
        System.out.println("Price of banana: " + treeMap.get("banana"));
        System.out.println("Price of orange: " + treeMap.get("orange"));

        // 遍历TreeMap
        System.out.println("TreeMap:");
        for (String fruit : treeMap.keySet()) {
            System.out.println(fruit + " - " + treeMap.get(fruit));
        }
    }
}

//有序映射，用于存储键值对，并按照键的自然顺序进行排序。

