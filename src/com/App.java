package com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cprt.model.Employee;
import com.cprt.model.JobRole;
import com.cprt.service.salary.SalaryUpgradeService;
import com.cprt.service.salary.validation.SalaryUpgradeFrequencyValidation;
import com.cprt.service.salary.validation.SalaryUpgradePercentualValidation;

public class App {

  public static final String EMPLOYEE_LOG = "Employee = {0}";

  public static void main(String[] args) {
    Logger logger = Logger.getLogger("main");
    Employee emp = new Employee("Diego M", "666.999.666-69", JobRole.ANALYST, BigDecimal.valueOf(10000));
    SalaryUpgradeService salaryUpgradeService = new SalaryUpgradeService(new ArrayList<>(
        Arrays.asList(new SalaryUpgradeFrequencyValidation(), new SalaryUpgradePercentualValidation())));
    logger.log(Level.INFO, EMPLOYEE_LOG, emp);
    salaryUpgradeService.upgradeEmployeeSalary(emp, 4000, null);
    logger.log(Level.INFO, EMPLOYEE_LOG, emp);
    salaryUpgradeService.upgradeEmployeeSalary(emp, 5650, null);
    logger.log(Level.INFO, EMPLOYEE_LOG, emp);
  }

}
