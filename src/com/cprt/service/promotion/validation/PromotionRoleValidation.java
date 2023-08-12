package com.cprt.service.promotion.validation;

import com.cprt.InvalidEmployeeUpdateException;
import com.cprt.model.Employee;
import com.cprt.model.JobRole;

public class PromotionRoleValidation implements PromotionValidation {

    public void validate(Employee employee, boolean meetGoals) {
        if (JobRole.MANAGER == employee.getPersonalData().getJobRole()) {
            throw new InvalidEmployeeUpdateException("Manager cannot be promoted");
        }
    }
    
    

}
