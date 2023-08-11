package com.cprt.service.validation;

import com.cprt.InvalidSalaryIncreaseException;
import com.cprt.model.Employee;

public class SalaryUpdatePercentualValidation implements SalaryUpdateValidation{

    private static final double MAX_PERCENTAGE = 0.4;

    public void validate(Employee employee, double percentage) {
        if(percentage > MAX_PERCENTAGE){
            throw new InvalidSalaryIncreaseException("Increase is bigger than the allowed: " + MAX_PERCENTAGE + " < " + percentage);
        }
    }
    
}
