package com.gkttk.tasks.task1.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;
import com.gkttk.tasks.task1.model.SalaryType;


class CommissionedPayCalculatorTest {


    private final PayCalculator calculator = new CommissionedPayCalculator();
    private final Employee employee = new Employee("asdad", SalaryType.COMMISSIONED);

    @Test
    void calculatePay() {

        Money money = calculator.calculatePay(employee);
        Assertions.assertEquals("calculateCommissionedPay", money.getWhere());

    }

    @Test
    void calculateBonus() {

        Money money = calculator.calculateBonus(employee);
        Assertions.assertEquals("calculateCommissionedBonus", money.getWhere());

    }
}