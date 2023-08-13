package com.cprt.service.salary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.cprt.model.Employee;
import com.cprt.service.salary.validation.SalaryUpgradeValidation;

public class SalaryUpgradeService {

    private static final RoundingMode STD_ROUNDING_MODE = RoundingMode.HALF_UP;
    private List<SalaryUpgradeValidation> validations;

    public SalaryUpgradeService(List<SalaryUpgradeValidation> validations) {
        this.validations = validations;
    }

    public void upgradeEmployeeSalary(final Employee employee, final double percentage) {
        this.validations.stream().forEach(v -> v.validate(employee, percentage));
        BigDecimal newSalary = employee.getPersonalData().getMonthlySalary()
                .multiply(BigDecimal.valueOf(1 + percentage)).setScale(2, STD_ROUNDING_MODE);
        employee.updateSalary(newSalary);
    }

    public void upgradeEmployeeSalary(final Employee employee, final double fixedValue, RoundingMode roundingMode) {
        if (roundingMode == null)
            roundingMode = STD_ROUNDING_MODE;
        final double percentage = BigDecimal.valueOf(fixedValue)
                .divide(employee.getPersonalData().getMonthlySalary(), 3, roundingMode).doubleValue();
        upgradeEmployeeSalary(employee, percentage);
    }

}
