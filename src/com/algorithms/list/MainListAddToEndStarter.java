package com.algorithms.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListAddToEndStarter {
    private static final int PERSONS_COUNT = 10_000;
    private static final int EXPERIMENT_COUNT = 10;

    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();

        List<Long> experimentsArrayList = new ArrayList<>();
        for (int j = 0; j < EXPERIMENT_COUNT; j++) {
            long start = System.currentTimeMillis();
            addPersons(personArrayList);
            long end = System.currentTimeMillis() - start;
            experimentsArrayList.add(end);
        }

        System.out.println("ArrayList: " + experimentsArrayList);

        //-------------------------------------------------------------------------------------------------------
        List<Person> personLinkedList = new LinkedList<>();

        List<Long> experimentsLinkedList = new ArrayList<>();
        for (int j = 0; j < EXPERIMENT_COUNT; j++) {
            long start = System.currentTimeMillis();
            addPersons(personLinkedList);
            long end = System.currentTimeMillis() - start;
            experimentsLinkedList.add(end);
        }

        System.out.println("LinkedList: " + experimentsLinkedList);

        //-------------------------------------------------------------------------------------------------------

        int aroundArrayList = experimentsArrayList.stream().mapToInt(Long::intValue).sum() / EXPERIMENT_COUNT;
        int aroundLinkedList = experimentsLinkedList.stream().mapToInt(Long::intValue).sum() / EXPERIMENT_COUNT;

        System.out.println("AroundArrayList: " + aroundArrayList + " ms");
        System.out.println("AroundLinkedList: " + aroundLinkedList + " ms");

        System.out.println(aroundLinkedList / aroundArrayList);
    }

    private static void addPersons(List<Person> persons) {
        for (int i = 0; i < PERSONS_COUNT; i++) {
            persons.add(persons.size() / 2, new Person("Игорь", 30));
        }
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
