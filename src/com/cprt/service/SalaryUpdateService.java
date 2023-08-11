package com.cprt.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.cprt.model.Employee;
import com.cprt.service.validation.SalaryUpdateValidation;

public class SalaryUpdateService {

    private static final RoundingMode STD_ROUNDING_MODE = RoundingMode.HALF_UP;
    private List<SalaryUpdateValidation> validations;
   
    public SalaryUpdateService(List<SalaryUpdateValidation> validations) {
        this.validations = validations;
    }

    public void updateEmployeeSalary(final Employee employee, final double percentage){
        this.validations.stream().forEach(v -> v.validate(employee, percentage));
        BigDecimal newSalary = employee.getMonthlySalary().multiply(BigDecimal.valueOf(1 + percentage)).setScale(2, STD_ROUNDING_MODE);
        employee.updateSalary(newSalary);
    }

    public void updateEmployee(final Employee employee, final double fixedValue, RoundingMode roundingMode){
        if(roundingMode == null) roundingMode = STD_ROUNDING_MODE;
        final double percentage = BigDecimal.valueOf(fixedValue).divide(employee.getMonthlySalary(), 3, roundingMode).doubleValue();
        updateEmployeeSalary(employee, percentage);
    }

}
