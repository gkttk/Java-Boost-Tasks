package com.gkttk.tasks.task1.calculator;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;

public interface PayCalculator {

    Money calculatePay(Employee e);

    Money calculateBonus(Employee e);

}
