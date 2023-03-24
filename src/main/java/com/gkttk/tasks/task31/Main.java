package com.gkttk.tasks.task31;

//What will be printed
public class Main {

    public static void main(String[] args) {

        try {
            try {
                if (true) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.err.print(" 1");
            } catch (Exception e) {
                System.err.print(" 2");
            } finally {
                System.err.print(" 3");
            }
        } catch (RuntimeException e) {
            System.err.print(" 4");
        } catch (Exception e) {
            System.err.print(" 5");
        } finally {
            System.err.print(" 6");
        }
    }


}

