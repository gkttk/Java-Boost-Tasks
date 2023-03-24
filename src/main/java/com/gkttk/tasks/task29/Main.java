package com.gkttk.tasks.task29;

//In the following program, explain why the value "6" is printed twice in a row
public class Main {

    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);	// "4"
        ++i;
        System.out.println(i);	// "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);	// "7"
    }


}
