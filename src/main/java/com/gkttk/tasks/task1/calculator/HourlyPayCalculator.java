package com.gkttk.tasks.task1.calculator;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;


public class HourlyPayCalculator implements PayCalculator {

    @Override
    public Money calculatePay(Employee e) {
        //logic HourlyPayCalculator
        return calculateHourlyPay(e);
    }

    @Override
    public Money calculateBonus(Employee e) {
        //logic HourlyPayCalculator
        return calculateHourlyBonus(e);
    }

    private Money calculateHourlyPay(Employee e) {

        return new Money("calculateHourlyPay");
    }

    private Money calculateHourlyBonus(Employee e) {

        return new Money("calculateHourlyBonus");
    }
}
