package com.gkttk.tasks.task1.model;

public class Employee {

    private String name;
    private SalaryType type;

    public Employee(String name, SalaryType type) {

        this.name = name;
        this.type = type;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public SalaryType getType() {

        return type;
    }

    public void setType(SalaryType type) {

        this.type = type;
    }
}
