package Serialization;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // 序列化到文件
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            outputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中反序列化
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person restoredPerson = (Person) inputStream.readObject();
            System.out.println("Name: " + restoredPerson.getName()); // 输出：Name: Alice
            System.out.println("Age: " + restoredPerson.getAge());   // 输出：Age: 30
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

