package com.gkttk.tasks.task30;

import java.util.List;
import java.util.stream.Collectors;

//Make this class immutable
public final class Employee {

    private final String empName;
    private final int age;
    private final Address address;
    private final List<Resposibility> responsibilities;

    public Employee(final String empName, final int age, final Address address,
            final List<Resposibility> responsibilities) {

        this.empName = empName;
        this.age = age;
        this.address = address;
        this.responsibilities = responsibilities;

    }

    public int getAge() {

        return age;
    }

    public String getEmpName() {

        return empName;
    }


    public Address getAddress() {

        return new Address(this.address);
    }

    public List<Resposibility> getResponsibilities() {

        return this.responsibilities.stream().map(responsibility -> {
            try {
                return (Resposibility) responsibility.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException();
            }
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {

        return "Employee{" + "empName='" + empName + '\'' + ", age=" + age + ", address=" + address
                + ", responsibilities=" + responsibilities + '}';
    }
}
