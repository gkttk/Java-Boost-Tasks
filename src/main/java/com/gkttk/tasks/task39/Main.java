package com.gkttk.tasks.task39;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Calculate the sum of numbers from 1 to 100 using streams in a different ways ( at least 6 variants)
public class Main {

    public static void main(String[] args) {

        List<Integer> collect = Stream.iterate(1, a -> a + 1).limit(100).toList();
        //1 mapToInt + sum
        int result1 = collect.stream().mapToInt(a -> a).sum();
        System.out.println("Result1: " + result1);
        //2 reduce
        Integer result2 = Stream.iterate(1, a -> a + 1).limit(100).reduce(Integer::sum).orElse(0);
        System.out.println("Result2: " + result2);
        //3 with value holder
        int[] fin = new int[1];
        collect.forEach(a -> fin[0] += a);
        System.out.println("Result3: " + fin[0]);
        //4 rangeClosed + sum
        int result4 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Result4: " + result4);
        //5 summingInt
        Integer result5 = collect.stream().collect(Collectors.summingInt(a -> a));
        System.out.println(result5);
        //6 summarizingInt
        IntSummaryStatistics result6 = collect.stream().collect(Collectors.summarizingInt(e -> e));
        System.out.println(result6.getSum());


    }

}
