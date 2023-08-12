package com.cprt.service.promotion.validation;

import com.cprt.InvalidEmployeeUpdateException;
import com.cprt.model.Employee;

public class PromotionMeetGoalValidation implements PromotionValidation{

    public void validate(Employee employee, boolean meetGoals) {
        if (!meetGoals) {
            throw new InvalidEmployeeUpdateException("Employees that do not meet their goals cannot be promoted");
        }
    }
    
}
