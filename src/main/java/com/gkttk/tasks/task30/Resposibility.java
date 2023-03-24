package com.gkttk.tasks.task30;

public class Resposibility implements Cloneable {


    private int notNumber;

    public Resposibility(int notNumber) {

        this.notNumber = notNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public void setNotNumber(int notNumber) {

        this.notNumber = notNumber;
    }

    @Override
    public String toString() {

        return "Resposibility{" +
                "notNumber=" + notNumber +
                '}';
    }
}
