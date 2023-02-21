package com.gkttk.tasks.task1.calculator;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;

public class SalariedPayCalculator implements PayCalculator {

    @Override
    public Money calculatePay(Employee e) {
        //logic SalariedPayCalculator
        return calculateSalariedPay(e);
    }

    @Override
    public Money calculateBonus(Employee e) {
        //logic SalariedPayCalculator
        return calculateSalariedBonus(e);
    }

    private Money calculateSalariedPay(Employee e) {

        return new Money("calculateSalariedPay");
    }

    private Money calculateSalariedBonus(Employee e) {

        return new Money("calculateSalariedBonus");
    }
}
