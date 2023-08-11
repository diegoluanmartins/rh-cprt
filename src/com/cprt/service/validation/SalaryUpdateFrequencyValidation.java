package com.cprt.service.validation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.cprt.InvalidSalaryIncreaseException;
import com.cprt.model.Employee;

public class SalaryUpdateFrequencyValidation implements SalaryUpdateValidation {

    private static final double MIN_MONTH_BTWN_SALARY_UPDATE = 6;
    
    public void validate(Employee employee, double percentage){
        LocalDate lastUpdate = employee.getLastSalaryUpdateDate();
        LocalDate currentDate = LocalDate.now();
        Long currentMonthsBtwn = ChronoUnit.MONTHS.between(lastUpdate, currentDate);
        if(currentMonthsBtwn < MIN_MONTH_BTWN_SALARY_UPDATE){
            throw new InvalidSalaryIncreaseException("Not enough months since last salary updated: " + MIN_MONTH_BTWN_SALARY_UPDATE + " > " + currentMonthsBtwn);
        }
    }

}
