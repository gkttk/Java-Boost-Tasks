package com.gkttk.tasks.task1.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;
import com.gkttk.tasks.task1.model.SalaryType;

class HourlyPayCalculatorTest {


    private final PayCalculator calculator = new HourlyPayCalculator();
    private final Employee employee = new Employee("asdad", SalaryType.HOURLY);

    @Test
    void calculatePay() {

        Money money = calculator.calculatePay(employee);
        Assertions.assertEquals("calculateHourlyPay", money.getWhere());

    }

    @Test
    void calculateBonus() {

        Money money = calculator.calculateBonus(employee);
        Assertions.assertEquals("calculateHourlyBonus", money.getWhere());

    }
}