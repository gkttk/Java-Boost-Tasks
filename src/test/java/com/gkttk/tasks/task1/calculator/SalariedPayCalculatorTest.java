package com.gkttk.tasks.task1.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;
import com.gkttk.tasks.task1.model.SalaryType;


class SalariedPayCalculatorTest {


    private final PayCalculator calculator = new SalariedPayCalculator();
    private final Employee employee = new Employee("asdad", SalaryType.SALARIED);

    @Test
    void calculatePay() {

        Money money = calculator.calculatePay(employee);
        Assertions.assertEquals("calculateSalariedPay", money.getWhere());

    }

    @Test
    void calculateBonus() {

        Money money = calculator.calculateBonus(employee);
        Assertions.assertEquals("calculateSalariedBonus", money.getWhere());

    }
}