package com.gkttk.tasks.task1.service;

import com.gkttk.tasks.task1.model.Employee;
import com.gkttk.tasks.task1.model.Money;

public interface CalculatorService {

    Money calculatePayForEmployee(Employee employee);

    Money calculateBonusForEmployee(Employee employee);

}
