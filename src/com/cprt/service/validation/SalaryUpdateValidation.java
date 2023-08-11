package com.cprt.service.validation;

import com.cprt.model.Employee;

public interface SalaryUpdateValidation {

    void validate(final Employee employee, final double percentage);

}
