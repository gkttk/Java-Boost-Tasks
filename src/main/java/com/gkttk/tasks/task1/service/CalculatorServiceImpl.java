package com.gkttk.tasks.task1.service;

import java.util.Map;

import com.gkttk.tasks.task1.calculator.PayCalculator;
import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;
import com.gkttk.tasks.task1.model.SalaryType;

public class CalculatorServiceImpl implements CalculatorService {

    private final Map<SalaryType, PayCalculator> calculatorMap;

    public CalculatorServiceImpl(Map<SalaryType, PayCalculator> calculatorMap) {

        this.calculatorMap = calculatorMap;
    }

    public Money calculatePayForEmployee(Employee employee) {

        PayCalculator calculator = getCalculator(employee);
        return calculator.calculatePay(employee);

    }

    public Money calculateBonusForEmployee(Employee employee) {

        PayCalculator calculator = getCalculator(employee);
        return calculator.calculateBonus(employee);

    }


    private PayCalculator getCalculator(Employee employee) {

        SalaryType type = employee.getType();
        PayCalculator payCalculator = calculatorMap.get(type);
        if (payCalculator == null) {
            throw new RuntimeException();
        }

        return payCalculator;
    }


}
