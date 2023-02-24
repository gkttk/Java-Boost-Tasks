package com.gkttk.tasks.sidecoding.navigableset;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {

    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>(Arrays.asList(12, 13, 1, 2, 3, 4, 5));

        System.out.println(set.ceiling(3)); // ближайший >=
        System.out.println(set.floor(3)); // ближайший <=
        System.out.println(set.higher(3)); // ближайший >
        System.out.println(set.lower(3)); // ближайший <

        // System.out.println(set.pollFirst()); //получить и удалить первый(lower) элемент или null, если коллекция пуста
        // System.out.println(set.pollLast()); //получить и удалить последний(higher) элемент или null, если коллекция пуста
        // System.out.println(set.subSet(12, true, 13, true)); //получить подмножество элементов от x до y

        System.out.println(set.headSet(5)); //подмножество элементов меньше x
        System.out.println(set.tailSet(5)); //подмножество элементов больше x


    }

}
