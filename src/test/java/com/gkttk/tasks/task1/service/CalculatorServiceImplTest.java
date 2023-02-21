package com.gkttk.tasks.task1.service;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gkttk.tasks.task1.calculator.CommissionedPayCalculator;
import com.gkttk.tasks.task1.calculator.HourlyPayCalculator;
import com.gkttk.tasks.task1.calculator.PayCalculator;
import com.gkttk.tasks.task1.calculator.SalariedPayCalculator;
import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;
import com.gkttk.tasks.task1.model.SalaryType;


class CalculatorServiceImplTest {

    private static HashMap<SalaryType, PayCalculator> CALCULATOR_MAP;

    private final CalculatorService service = new CalculatorServiceImpl(CALCULATOR_MAP);

    @BeforeAll
    public static void beforeAll() {

        CALCULATOR_MAP = new HashMap<>();
        CALCULATOR_MAP.put(SalaryType.COMMISSIONED, new CommissionedPayCalculator());
        CALCULATOR_MAP.put(SalaryType.HOURLY, new HourlyPayCalculator());
        CALCULATOR_MAP.put(SalaryType.SALARIED, new SalariedPayCalculator());
    }

    @Test
    void calculatePayForEmployee1() {

        Employee employee = new Employee("asd", SalaryType.COMMISSIONED);
        Money money = service.calculatePayForEmployee(employee);

        Assertions.assertEquals("calculateCommissionedPay", money.getWhere());

    }

    @Test
    void calculateBonusForEmployee1() {

        Employee employee = new Employee("asd", SalaryType.COMMISSIONED);
        Money money = service.calculateBonusForEmployee(employee);
        Assertions.assertEquals("calculateCommissionedBonus", money.getWhere());

    }

    @Test
    void calculatePayForEmployee2() {

        Employee employee = new Employee("asd", SalaryType.HOURLY);
        Money money = service.calculatePayForEmployee(employee);

        Assertions.assertEquals("calculateHourlyPay", money.getWhere());

    }

    @Test
    void calculateBonusForEmployee2() {

        Employee employee = new Employee("asd", SalaryType.HOURLY);
        Money money = service.calculateBonusForEmployee(employee);
        Assertions.assertEquals("calculateHourlyBonus", money.getWhere());

    }


    @Test
    void calculatePayForEmployee3() {

        Employee employee = new Employee("asd", SalaryType.SALARIED);
        Money money = service.calculatePayForEmployee(employee);

        Assertions.assertEquals("calculateSalariedPay", money.getWhere());

    }

    @Test
    void calculateBonusForEmployee3() {

        Employee employee = new Employee("asd", SalaryType.SALARIED);
        Money money = service.calculateBonusForEmployee(employee);
        Assertions.assertEquals("calculateSalariedBonus", money.getWhere());

    }


}