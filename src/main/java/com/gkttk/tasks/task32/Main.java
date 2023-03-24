package com.gkttk.tasks.task32;


/**
 * a.         What output do you think the code will produce if aNumber is 3?
 * b.         Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
 * c.         Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
 * d.         Use braces, { and }, to further clarify the code.
 */

//Consider the following code snippet.
public class Main {

    public static void main(String[] args) {

        int aNumber = 3;

        if (aNumber > 0) {
            System.out.println("second string");
        } else if (aNumber == 0) {
            System.out.println("first string");
        }
        System.out.println("third string");

    }


}
