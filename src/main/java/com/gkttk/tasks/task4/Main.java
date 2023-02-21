package com.gkttk.tasks.task4;

public class Main {

    public static void main(String[] args) {

        /*Анонимные классы */
        //1. Инлайн реализация
        Action action = new Action() {
            @Override
            public void perform(String string) {
                System.out.printf(string);
            }
        };

        //2. Реализация через лямбду(при условии того что этот класс - функциональный интерфейс)
        Action action2 = str -> System.out.println(str);

        //3. Реализация через лямбду(ссылка на метод)
        Action action3 = System.out::printf;

        //4. Лямбда без сокращений
        Action action4 = (line) -> {

            System.out.printf(line);
            System.out.printf(line);
            System.out.printf(line);

            class LocaleLambdaClass {

                private int privateVar = 10;

            }
        };


    }
}
