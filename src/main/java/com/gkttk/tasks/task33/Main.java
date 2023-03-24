package com.gkttk.tasks.task33;

import java.util.Map;
import java.util.Map.Entry;

//Find the employeeId of "Charlie" from a map using Java Streams Api
public class Main {

    public static void main(String[] args) {

        Map<Long, String> employees = Map.of(123L, "Alice", 124L, "Bob", 125L, "Charlie");
        Long aLong = employees.entrySet().stream().filter(entry -> "Charlie".equals(entry.getValue()))
                .map(Entry::getKey).findAny().orElse(null);

        System.out.println(aLong);

    }

}
