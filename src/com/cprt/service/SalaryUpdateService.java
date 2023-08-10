package com.cprt.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.cprt.InvalidSalaryIncreaseException;
import com.cprt.model.Employee;

public class SalaryUpdateService {

    private static final double MAX_PERCENTAGE = 0.4;
    private static final RoundingMode STD_ROUNDING_MODE = RoundingMode.HALF_UP;
    
    public void updateEmployeeSalary(final Employee employee, final double percentage){
        if(percentage > MAX_PERCENTAGE){
            throw new InvalidSalaryIncreaseException("Increase is bigger than the allowed: " + MAX_PERCENTAGE + " < " + percentage);
        }
        BigDecimal newSalary = employee.getMonthlySalary().multiply(BigDecimal.valueOf(1 + percentage)).setScale(2, STD_ROUNDING_MODE);
        employee.updateSalary(newSalary);
    }

    public void updateEmployee(final Employee employee, final double fixedValue, RoundingMode roundingMode){
        if(roundingMode == null) roundingMode = STD_ROUNDING_MODE;
        final double percentage = BigDecimal.valueOf(fixedValue).divide(employee.getMonthlySalary(), 3, roundingMode).doubleValue();
        updateEmployeeSalary(employee, percentage);
    }

}
