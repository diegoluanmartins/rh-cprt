package com.cprt.service.promotion.validation;

import com.cprt.model.Employee;

public interface PromotionValidation {
    public void validate(Employee employee, boolean meetGoals);
}
