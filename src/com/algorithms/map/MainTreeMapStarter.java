package com.algorithms.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainTreeMapStarter {
    private static final int DEL_MB = 1_048_576;
    private static final int PERSON_COUNT = 50_000_000;

    public static void main(String[] args) {
        Map<Integer, Person> map = new TreeMap<>();
        //Map<Integer, Person> map = new HashMap<>();

        long startMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / DEL_MB;

        for (int i = 0; i < PERSON_COUNT; i++) {
            map.put(i, new Person("Игорь", 45));
        }

        long endMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / DEL_MB;
        System.out.println("Всего занято " + (endMemory - startMemory) + " мб");
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
