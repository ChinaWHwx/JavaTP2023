package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("apple",10);
        hashMap.put("banana",20);
        hashMap.put("orange",30);

        System.out.println("HashMap:");
        for(String fruit:hashMap.keySet()){
            System.out.println(fruit + "-" + hashMap.get(fruit));
        }
    }
}

//HashMap是一个哈希映射，用于存储键值对，根据键快速查找值。
