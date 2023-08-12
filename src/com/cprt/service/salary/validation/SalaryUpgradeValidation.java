package com.cprt.service.salary.validation;

import com.cprt.model.Employee;

public interface SalaryUpgradeValidation {

    void validate(final Employee employee, final double percentage);

}
