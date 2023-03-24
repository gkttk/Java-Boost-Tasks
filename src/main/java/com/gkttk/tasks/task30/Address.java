package com.gkttk.tasks.task30;

public class Address {

    private final String number;

    public Address(final String number) {

        this.number = number;
    }

    public Address(final Address address) {

        this.number = address.getNumber();
    }

    public String getNumber() {

        return number;
    }

    @Override
    public String toString() {

        return "Address{" +
                "number='" + number + '\'' +
                '}';
    }
}
