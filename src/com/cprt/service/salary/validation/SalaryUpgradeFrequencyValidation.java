package com.cprt.service.salary.validation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.cprt.InvalidEmployeeUpdateException;
import com.cprt.model.Employee;

public class SalaryUpgradeFrequencyValidation implements SalaryUpgradeValidation {

    private static final long MIN_MONTH_BTWN_SALARY_UPDATE = 6;
    
    public void validate(Employee employee, double percentage){
        LocalDate lastUpdate = employee.getLastSalaryUpdateDate();
        LocalDate currentDate = LocalDate.now();
        Long currentMonthsBtwn = lastUpdate == null ? MIN_MONTH_BTWN_SALARY_UPDATE : ChronoUnit.MONTHS.between(lastUpdate, currentDate);
        if(currentMonthsBtwn < MIN_MONTH_BTWN_SALARY_UPDATE){
            throw new InvalidEmployeeUpdateException("Not enough months since last salary upgrade: " + MIN_MONTH_BTWN_SALARY_UPDATE + " > " + currentMonthsBtwn);
        }
    }

}
