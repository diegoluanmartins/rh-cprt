package com.cprt.service.salary.validation;

import com.cprt.InvalidEmployeeUpdateException;
import com.cprt.model.Employee;

public class SalaryUpgradePercentualValidation implements SalaryUpgradeValidation {

    private static final double MAX_PERCENTAGE = 0.4;

    public void validate(Employee employee, double percentage) {
        if (percentage > MAX_PERCENTAGE) {
            throw new InvalidEmployeeUpdateException(
                    "Salary upgrade is bigger than the allowed: " + MAX_PERCENTAGE + " < " + percentage);
        }
    }

}
