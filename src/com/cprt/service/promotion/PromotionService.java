package com.cprt.service.promotion;

import java.util.List;

import com.cprt.model.Employee;
import com.cprt.model.JobRole;
import com.cprt.service.promotion.validation.PromotionValidation;

public class PromotionService {

    private List<PromotionValidation> validations;

    public PromotionService(List<PromotionValidation> validations) {
        this.validations = validations;
    }

    public void promote(Employee employee, boolean meetGoals) {
        this.validations.stream().forEach(v -> v.validate(employee, meetGoals));
        JobRole newRole = employee.getPersonalData().getJobRole().getNextRole();
        employee.promote(newRole);
    }

}
