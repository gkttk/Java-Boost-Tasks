package com.gkttk.tasks.task1.calculator;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;

public class CommissionedPayCalculator implements PayCalculator {

    @Override
    public Money calculatePay(Employee e) {
        //logic CommissionedPayCalculator
        return calculateCommissionedPay(e);
    }

    @Override
    public Money calculateBonus(Employee e) {
        //logic CommissionedPayCalculator
        return calculateCommissionedBonus(e);
    }

    private Money calculateCommissionedPay(Employee e) {

        return new Money("calculateCommissionedPay");
    }

    private Money calculateCommissionedBonus(Employee e) {

        return new Money("calculateCommissionedBonus");
    }
}
